package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5OY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5OY implements InterfaceC159596Od {
    public final NLEEditor LIZ;
    public final VESize LIZIZ;
    public final C1NS<BaseStickerModel> LIZJ;
    public final LifecycleOwner LIZLLL;
    public String LJ;

    @Override // X.InterfaceC159596Od
    public final void LIZ() {
    }

    @Override // X.InterfaceC159596Od
    public final void LIZIZ(AqS149S0200000_2 aqS149S0200000_2) {
    }

    @Override // X.InterfaceC159596Od
    public final Bitmap LIZJ() {
        Bitmap createBitmap = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_8888);
        o.LJIIIIZZ(createBitmap, "createBitmap(0, 0, Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }

    public final NLETrackSlot LIZLLL() {
        Object obj;
        NLEModel LJ = this.LIZ.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack != null && nLETrack.LJIIZILJ() == EnumC123864ta.STICKER && o.LJ(nLETrack.getExtra("StickerTrackType"), "TEXT")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it2.next()).LJIILL(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (o.LJ(((NLENode) obj).getUUID(), this.LJ)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NLETrackSlot) obj;
    }

    public C5OY(NLEEditor nleEditor, VESize initSize, Context context, C1NS<BaseStickerModel> baseStateContainer, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(nleEditor, "nleEditor");
        o.LJIIIZ(initSize, "initSize");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(baseStateContainer, "baseStateContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = nleEditor;
        this.LIZIZ = initSize;
        this.LIZJ = baseStateContainer;
        this.LIZLLL = lifecycleOwner;
        this.LJ = "";
    }
}
