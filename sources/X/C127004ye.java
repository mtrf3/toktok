package X;

import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127004ye {
    public static void LIZ(InterfaceC142545ic interfaceC142545ic, VideoPublishEditModel mModel) {
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC153045zY value;
        NLEModel LJJ;
        List<NLETrack> LJIILIIL;
        String str;
        o.LJIIIZ(mModel, "mModel");
        if (interfaceC142545ic == null || (Kh = interfaceC142545ic.Kh()) == null || (value = Kh.getValue()) == null || (LJJ = C17N.LJJ(value)) == null || (LJIILIIL = C124574uj.LJIILIIL(LJJ)) == null || LJIILIIL.isEmpty()) {
            mModel.creativeModel.editEffectModel.effectFromPaths.clear();
            return;
        }
        for (NLETrack nLETrack : LJIILIIL) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
            while (it.hasNext()) {
                String extra = it.next().getExtra("extra_video_effect_source");
                if (o.LJ(extra, String.valueOf(EnumC126794yJ.EDIT.getValue()))) {
                    str = "effect_entrance";
                } else if (o.LJ(extra, String.valueOf(EnumC126794yJ.EDIT_RECOMMEND.getValue()))) {
                    str = "edit_page";
                } else if (o.LJ(extra, String.valueOf(EnumC126794yJ.EDITOR_PRO.getValue()))) {
                    str = "editor_pro";
                } else if (o.LJ(extra, String.valueOf(EnumC126794yJ.MULTI_TRACK.getValue()))) {
                    str = "multi_track";
                } else {
                    str = "";
                }
                arrayList.add(str);
            }
            EditEffectModel editEffectModel = mModel.creativeModel.editEffectModel;
            editEffectModel.getClass();
            editEffectModel.effectFromPaths = arrayList;
        }
    }
}
