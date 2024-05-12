package X;

import android.view.Surface;
import com.ss.android.vesdk.VEEditor;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YOH {
    public final CopyOnWriteArrayList<InterfaceC88472Yns<Surface, C76800UCe>> LIZ;
    public final YOI LIZIZ;
    public final VEEditor LIZJ;

    public YOH(VEEditor editor) {
        o.LJIIIZ(editor, "editor");
        this.LIZJ = editor;
        this.LIZ = new CopyOnWriteArrayList<>();
        this.LIZIZ = new YOI(this);
    }
}
