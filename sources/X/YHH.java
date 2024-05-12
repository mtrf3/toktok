package X;

import com.google.gson.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHH {
    public final YHJ LIZ;
    public final String LIZIZ;
    public List<YHV> LIZJ;
    public YHI LIZLLL;
    public YHK LJ;
    public m LJFF;
    public List<String> LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public YHH(YHJ sceneConfig, String functionName) {
        o.LJIIIZ(sceneConfig, "sceneConfig");
        o.LJIIIZ(functionName, "functionName");
        this.LIZ = sceneConfig;
        this.LIZIZ = functionName;
        this.LIZJ = new ArrayList();
        this.LIZLLL = new YHI(0, -1L, -1L, "", C61878OQg.INSTANCE);
        this.LJ = new YHK(-1, "", "", null);
        this.LJFF = new m();
        this.LJI = new ArrayList();
        new HashMap();
    }
}
