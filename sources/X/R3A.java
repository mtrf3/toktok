package X;

import android.hardware.Camera;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R3A implements C5NZ, C6W4, InterfaceC47527Il1, InterfaceC46111I7v {
    public static int LJLIL = 1;
    public static volatile FestivalEntity LJLILLLLZI;
    public static final R3A LJLJI = new R3A();

    @Override // X.C6W4
    public int LIZIZ(C153155zj item, boolean z, boolean z2) {
        o.LJIIIZ(item, "item");
        return 0;
    }

    @Override // X.InterfaceC47527Il1
    public void LJ() {
    }

    public static FestivalEntity LJI() {
        if (LJLILLLLZI != null) {
            return LJLILLLLZI;
        }
        String LIZ = C235779Nd.LIZ.LJFF().LIZ();
        if (TextUtils.isEmpty(LIZ)) {
            return null;
        }
        try {
            LJLILLLLZI = (FestivalEntity) new Gson().LJI(LIZ, FestivalEntity.class);
        } catch (Exception unused) {
            LJLILLLLZI = null;
        }
        return LJLILLLLZI;
    }

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        C3Z.LIZ.getClass();
        C3Z.LIZJ();
    }

    public static boolean LJII() {
        if (LJI() != null && LJI().inActivity) {
            return true;
        }
        return false;
    }

    public /* synthetic */ R3A() {
    }

    public /* synthetic */ R3A(C161426Ve c161426Ve) {
    }

    public static void LJFF(Camera camera, Cert cert) {
        C63922P6w.LIZLLL("TECamera1PolicyAdapter", "check privacy, Camera close");
        try {
            P3O.LIZ(cert, new C62009OVh(camera));
        } catch (Exception e) {
            C63922P6w.LIZJ("TECamera1PolicyAdapter", "Exception occur:", e);
        }
    }

    @Override // X.InterfaceC47527Il1
    public void LIZLLL(java.util.Map map, Object obj) {
        ((java.util.Map) obj).putAll(map);
    }

    @Override // X.C5NZ
    public void LIZJ(InterfaceC153045zY editor, float f, float f2) {
        o.LJIIIZ(editor, "editor");
        InterfaceC134035Nv toNLEModel = editor.LLLIILIL();
        o.LJIIIZ(toNLEModel, "$this$toNLEModel");
        if (toNLEModel instanceof C5NW) {
            NLEModel invoke = ((C5NW) toNLEModel).LJLIL.invoke();
            VecNLETrackSPtr tracks = invoke.getTracks();
            o.LJIIIIZZ(tracks, "it.tracks");
            if (tracks.isEmpty()) {
                return;
            }
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getExtra("business"), "cutsame")) {
                    invoke.updateRelativeSizeWhileGlobalCanvasChanged(f, f2);
                    return;
                }
            }
            return;
        }
        "this must be NLEEditor Data Model".toString();
        throw new IllegalArgumentException("this must be NLEEditor Data Model");
    }
}
