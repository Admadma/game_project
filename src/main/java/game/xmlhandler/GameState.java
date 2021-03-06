package game.xmlhandler;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

/**
 * Blueprint for GameState java objects and XML files.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class GameState {

    private int numberOfMoves;

    private String playerName;

    @XmlElementWrapper(name = "playerXValues")
    @XmlElement(name = "x")
    private int[] playerXValues;

    @XmlElementWrapper(name = "playerYValues")
    @XmlElement(name = "y")
    private int[] playerYValues;

    @XmlElementWrapper(name = "wallXValues")
    @XmlElement(name = "x")
    private int[] wallXValues;

    @XmlElementWrapper(name = "wallYValues")
    @XmlElement(name = "y")
    private int[] wallYValues;

    @XmlElementWrapper(name = "ballXValues")
    @XmlElement(name = "x")
    private int[] ballXValues;

    @XmlElementWrapper(name = "ballYValues")
    @XmlElement(name = "y")
    private int[] ballYValues;

    @XmlElementWrapper(name = "goalXValues")
    @XmlElement(name = "x")
    private int[] goalXValues;

    @XmlElementWrapper(name = "goalYValues")
    @XmlElement(name = "y")
    private int[] goalYValues;
}

