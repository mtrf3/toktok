package com.ss.android.ugc.gamora.editorpro.magic;

import X.AbstractC123304sg;
import X.AnonymousClass519;
import X.C123314sh;
import X.C123434st;
import X.C124614un;
import X.C124944vK;
import X.C125114vb;
import X.C125184vi;
import X.C125244vo;
import X.C221108m2;
import X.C47261Igj;
import X.C5BA;
import X.C62822Ol8;
import X.C79057V0z;
import X.EnumC127484zQ;
import X.InterfaceC126184xK;
import X.ORZ;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.magic.MagicViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import java.util.List;
import ujb.o;
import ujb.s;

/* loaded from: classes3.dex */
public final class MagicViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C125114vb.LJLIL);

    public final void iv0() {
        long[] jArr = new long[2];
        getEditorContext().getSelectedSlotTimeRange(jArr);
        getEditorContext().getPlayer().fa(jArr[0] + 1000, new AnonymousClass519() { // from class: X.4vc
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                MagicViewModel.this.getEditorContext().getPlayer().I9();
            }
        });
    }

    public final EditorProContext getEditorContext() {
        return (EditorProContext) this.LJLIL.getValue();
    }

    public final String hv0() {
        String extra;
        NLETrackSlot selectedTrackSlot = getEditorContext().getSelectedTrackSlot();
        if (selectedTrackSlot == null || !selectedTrackSlot.hasExtra("ep_magic_resource_id") || (extra = selectedTrackSlot.getExtra("ep_magic_resource_id")) == null) {
            return "";
        }
        return extra;
    }

    public final void jv0(NLETrackSlot nLETrackSlot, InterfaceC126184xK interfaceC126184xK) {
        String str;
        String hv0 = hv0();
        NLETrackSlot selectedTrackSlot = getEditorContext().getSelectedTrackSlot();
        if (selectedTrackSlot == null || !selectedTrackSlot.hasExtra("ep_magic_effect_id") || (str = selectedTrackSlot.getExtra("ep_magic_effect_id")) == null) {
            str = "";
        }
        if (!o.LJJJJJL(hv0)) {
            NLEModel LJJI = C79057V0z.LJJI(getEditorContext());
            int i = 0;
            List LJLJJL = s.LJLJJL(str, new String[]{","}, 0, 6);
            for (Object obj : s.LJLJJL(hv0, new String[]{","}, 0, 6)) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if (!o.LJJJJJL(str2)) {
                        String str3 = (String) ORZ.LJLLLLLL(i, LJLJJL);
                        if (str3 == null) {
                            str3 = "";
                        }
                        interfaceC126184xK.LIZIZ(new C125184vi(new C125244vo(null, str2, str3, null, null, null, 121), nLETrackSlot, LJJI));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void gv0(long j, NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        EnumC127484zQ enumC127484zQ = EnumC127484zQ.ENABLE_TRACK_LINKAGE;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) C5BA.LIZ(enumC127484zQ, bool)).booleanValue()) {
            TrackLinkageManagerProvider.Companion.getClass();
            AbstractC123304sg businessTrackLinkageManager = C124944vK.LIZ().getBusinessTrackLinkageManager();
            if (businessTrackLinkageManager != null) {
                businessTrackLinkageManager.LIZIZ(new C123314sh("clip_video", C47261Igj.LJII(new C123434st(nLETrackSlot, getEditorContext().getSelectedTrackSlot(), null, 1, 4)), nLEModel));
            }
        }
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C124614un.LIZJ(getEditorContext());
        }
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, bool)).booleanValue() && getEditorContext().getMainTrack().LJIIJJI() > j) {
            C124614un.LIZIZ(j, getEditorContext());
        }
    }
}
