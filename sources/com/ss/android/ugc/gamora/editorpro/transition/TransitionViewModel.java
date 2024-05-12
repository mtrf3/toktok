package com.ss.android.ugc.gamora.editorpro.transition;

import X.AnonymousClass519;
import X.C124614un;
import X.C124784v4;
import X.C124984vO;
import X.C125104va;
import X.C134305Ow;
import X.C139795eB;
import X.C5BA;
import X.C6YK;
import X.C79057V0z;
import X.EnumC124724uy;
import X.EnumC126814yL;
import X.EnumC127484zQ;
import X.InterfaceC125004vQ;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.g0;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TransitionViewModel extends ViewModel {
    public static final C125104va Companion = new Object() { // from class: X.4va
    };
    public String curApplyTransitionId = "";
    public String originTransitionName;

    public final String getCurApplyTransitionId() {
        return this.curApplyTransitionId;
    }

    public final String getOriginTransitionName() {
        return this.originTransitionName;
    }

    public final void applyToAll(EditorProContext editorContext) {
        boolean z;
        C124984vO c124984vO;
        NLETrackSlot LIZ;
        NLESegmentTransition LIZLLL;
        NLEResourceNode LIZLLL2;
        String LIZJ;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot LIZ2 = editorContext.getEditor().LIZ();
        NLESegmentTransition nLESegmentTransition = null;
        if (LIZ2 != null && (nLESegmentTransition = LIZ2.LIZLLL()) != null) {
            z = nLESegmentTransition.LJ();
            String extra = nLESegmentTransition.getExtra("transition_tab");
            String str = "";
            if (extra == null) {
                extra = "";
            }
            String extra2 = nLESegmentTransition.getExtra("transition_name");
            int saveIndex = getSaveIndex(editorContext);
            NLEResourceNode LIZLLL3 = nLESegmentTransition.LIZLLL();
            if (LIZLLL3 != null && (LIZJ = LIZLLL3.LIZJ()) != null) {
                str = LIZJ;
            }
            c124984vO = new C124984vO(saveIndex, 160, nLESegmentTransition.LJFF(), extra, str, extra2, nLESegmentTransition.LJ());
        } else {
            z = false;
            c124984vO = new C124984vO(0, 224, 0L, "", "", null, false);
        }
        long LJIIJJI = editorContext.getMainTrack().LJIIJJI();
        editorContext.getEditor().LJIIZILJ(c124984vO, EnumC124724uy.NONE);
        if (z && !((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C124614un.LIZJ(editorContext);
        }
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, Boolean.FALSE)).booleanValue() && editorContext.getMainTrack().LJIIJJI() > LJIIJJI) {
            C124614un.LIZIZ(LJIIJJI, editorContext);
        }
        if (nLESegmentTransition != null && (LIZ = editorContext.getEditor().LIZ()) != null && LIZ.hasExtra("slot_extra_transition_resource_id")) {
            String extra3 = LIZ.getExtra("slot_extra_transition_resource_id");
            if (!TextUtils.isEmpty(extra3)) {
                Iterator<NLETrackSlot> it = editorContext.getMainTrack().LJIILL().iterator();
                while (it.hasNext()) {
                    it.next();
                    NLETrackSlot LIZ3 = editorContext.getEditor().LIZ();
                    if (LIZ3 != null && (LIZLLL = LIZ3.LIZLLL()) != null && (LIZLLL2 = LIZLLL.LIZLLL()) != null) {
                        LIZLLL2.setExtra("biz_res_id", C134305Ow.LIZ(extra3, "editor_pro_transition"));
                    }
                }
            }
        }
        C79057V0z.LJJI(editorContext).setExtra("is_editorpro_transition", "true");
        g0.LJIILIIL(C79057V0z.LJJ(editorContext), true, C6YK.LIZ(new C139795eB(EnumC126814yL.APPLY_TO_ALL.getNameId(), null, null, null, "apply_to_all", 14)), false, false, 12);
    }

    public final NLESegmentTransition getCurSlotTransition(EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot LIZ = editorContext.getEditor().LIZ();
        if (LIZ != null) {
            return LIZ.LIZLLL();
        }
        return null;
    }

    public final String getCurSlotTransitionName(EditorProContext editorContext) {
        NLESegmentTransition LIZLLL;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot LIZ = editorContext.getEditor().LIZ();
        if (LIZ == null || (LIZLLL = LIZ.LIZLLL()) == null) {
            return "";
        }
        String extra = LIZLLL.getExtra("transition_name");
        o.LJIIIIZZ(extra, "{\n            transition…RANSITION_NAME)\n        }");
        return extra;
    }

    public final long getMaxDuration(EditorProContext editorContext) {
        long duration;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot LIZ = editorContext.getEditor().LIZ();
        NLETrackSlot LJ = editorContext.getEditor().LJ();
        if (LIZ == null || LJ == null) {
            return 0L;
        }
        if (LIZ.getDuration() > LJ.getDuration()) {
            duration = LJ.getDuration() / 2;
        } else {
            duration = LIZ.getDuration() / 2;
        }
        long j = C124784v4.LIZ;
        if (duration <= j) {
            return duration;
        }
        return j;
    }

    public final NLETrackSlot getPreNLESlot(EditorProContext editorProContext) {
        InterfaceC125004vQ editor;
        if (editorProContext != null && (editor = editorProContext.getEditor()) != null) {
            return editor.LIZ();
        }
        return null;
    }

    public final int getSaveIndex(EditorProContext editorContext) {
        NLESegmentTransition LIZLLL;
        String extra;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot LIZ = editorContext.getEditor().LIZ();
        if (LIZ != null && (LIZLLL = LIZ.LIZLLL()) != null && (extra = LIZLLL.getExtra("transition_position")) != null) {
            return CastIntegerProtector.parseInt(extra);
        }
        return 0;
    }

    public final String getSaveTab(EditorProContext editorContext) {
        NLESegmentTransition LIZLLL;
        String extra;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot LIZ = editorContext.getEditor().LIZ();
        if (LIZ == null || (LIZLLL = LIZ.LIZLLL()) == null || (extra = LIZLLL.getExtra("transition_tab")) == null) {
            return "";
        }
        return extra;
    }

    public final boolean hasTransition(EditorProContext editorContext) {
        NLESegmentTransition LIZLLL;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrackSlot LIZ = editorContext.getEditor().LIZ();
        if (LIZ != null && (LIZLLL = LIZ.LIZLLL()) != null) {
            LIZLLL.LJFF();
            return true;
        }
        return false;
    }

    public final void setCurApplyTransitionId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.curApplyTransitionId = str;
    }

    public final void setOriginTransitionName(String str) {
        this.originTransitionName = str;
    }

    public final void setNullTransition(String nullResName, final EditorProContext editorContext) {
        o.LJIIIZ(nullResName, "nullResName");
        o.LJIIIZ(editorContext, "editorContext");
        InterfaceC125004vQ editor = editorContext.getEditor();
        NLETrackSlot LIZ = editor.LIZ();
        if (LIZ == null) {
            return;
        }
        NLETrackSlot LIZ2 = editor.LIZ();
        if (LIZ2 == null || LIZ2.LIZLLL() == null) {
            editorContext.getPlayer().fa(LIZ.getEndTime(), new AnonymousClass519() { // from class: X.4vV
                @Override // X.AnonymousClass519
                public final void LIZ(int i) {
                    EditorProContext.this.getPlayer().pause();
                }
            });
            return;
        }
        long LJIIJJI = editorContext.getMainTrack().LJIIJJI();
        editor.LJIJJ(new C124984vO(-1, 240, 0L, "", "", null, false), EnumC124724uy.NONE);
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, Boolean.FALSE)).booleanValue() && editorContext.getMainTrack().LJIIJJI() > LJIIJJI) {
            C124614un.LIZIZ(LJIIJJI, editorContext);
        }
        C79057V0z.LJJI(editorContext).setExtra("is_editorpro_transition", "true");
        g0.LJIILIIL(C79057V0z.LJJ(editorContext), true, C6YK.LIZ(new C139795eB(EnumC126814yL.VIDEO_TRANSITION.getNameId(), null, null, nullResName, "click", 6)), false, false, 12);
        editorContext.getPlayer().fa(LIZ.getEndTime(), new AnonymousClass519() { // from class: X.4vW
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                EditorProContext.this.getPlayer().pause();
            }
        });
    }

    public final void setTransition(C124984vO transitionParam, EditorProContext editorContext) {
        NLESegmentTransition nLESegmentTransition;
        long j;
        NLETrackSlot LIZ;
        NLESegmentTransition LIZLLL;
        NLEResourceNode LIZLLL2;
        long j2;
        long j3;
        NLEResourceNode LIZLLL3;
        o.LJIIIZ(transitionParam, "transitionParam");
        o.LJIIIZ(editorContext, "editorContext");
        final InterfaceC125004vQ editor = editorContext.getEditor();
        NLETrackSlot LIZ2 = editor.LIZ();
        String str = null;
        if (LIZ2 != null) {
            nLESegmentTransition = LIZ2.LIZLLL();
        } else {
            nLESegmentTransition = null;
        }
        String str2 = transitionParam.LIZJ;
        final long j4 = transitionParam.LIZLLL;
        boolean z = transitionParam.LJ;
        if (nLESegmentTransition != null && (LIZLLL3 = nLESegmentTransition.LIZLLL()) != null) {
            str = LIZLLL3.LIZJ();
        }
        if (o.LJ(str, str2) && nLESegmentTransition.LJFF() == j4) {
            NLETrackSlot LIZ3 = editor.LIZ();
            if (LIZ3 != null) {
                long measuredEndTime = LIZ3.getMeasuredEndTime();
                if (z) {
                    j3 = j4;
                } else {
                    j3 = j4 / 2;
                }
                editorContext.getPlayer().fa(measuredEndTime - j3, new AnonymousClass519() { // from class: X.4vX
                    @Override // X.AnonymousClass519
                    public final void LIZ(int i) {
                        InterfaceC125004vQ.this.LJJI(j4);
                    }
                });
                return;
            }
            return;
        }
        NLETrackSlot LIZ4 = editor.LIZ();
        if (LIZ4 != null) {
            long measuredEndTime2 = LIZ4.getMeasuredEndTime();
            if (z) {
                j2 = j4;
            } else {
                j2 = j4 / 2;
            }
            editorContext.getPlayer().M9(measuredEndTime2 - j2);
        }
        long LJIIJJI = editorContext.getMainTrack().LJIIJJI();
        editor.LJIJJ(transitionParam, EnumC124724uy.NONE);
        if (z && !((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C124614un.LIZJ(editorContext);
        }
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, Boolean.FALSE)).booleanValue() && editorContext.getMainTrack().LJIIJJI() > LJIIJJI) {
            C124614un.LIZIZ(LJIIJJI, editorContext);
        }
        C79057V0z.LJJI(editorContext).setExtra("is_editorpro_transition", "true");
        if (!TextUtils.isEmpty(transitionParam.LJII) && (LIZ = editor.LIZ()) != null && (LIZLLL = LIZ.LIZLLL()) != null && (LIZLLL2 = LIZLLL.LIZLLL()) != null) {
            LIZLLL2.setExtra("biz_res_id", C134305Ow.LIZ(transitionParam.LJII, "editor_pro_transition"));
        }
        String str3 = transitionParam.LJI;
        if (str3 == null) {
            str3 = "";
        }
        g0.LJIILIIL(C79057V0z.LJJ(editorContext), true, C6YK.LIZ(new C139795eB(EnumC126814yL.VIDEO_TRANSITION.getNameId(), null, null, str3, "click", 6)), false, false, 12);
        NLETrackSlot LIZ5 = editor.LIZ();
        if (LIZ5 != null) {
            long measuredEndTime3 = LIZ5.getMeasuredEndTime();
            if (z) {
                j = j4;
            } else {
                j = j4 / 2;
            }
            editorContext.getPlayer().fa(measuredEndTime3 - j, new AnonymousClass519() { // from class: X.4vY
                @Override // X.AnonymousClass519
                public final void LIZ(int i) {
                    InterfaceC125004vQ.this.LJJI(j4);
                }
            });
        }
    }
}
