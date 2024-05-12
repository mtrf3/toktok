package com.ss.ugc.android.editor.base.viewmodel;

import X.C122684rg;
import X.C124574uj;
import X.C124614un;
import X.C125014vR;
import X.C125024vS;
import X.C127594zb;
import X.C131935Ft;
import X.C79057V0z;
import X.EnumC123864ta;
import X.EnumC124724uy;
import X.OSZ;
import X.X1D;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioViewModel extends ViewModel {
    public static final C125024vS Companion = new Object() { // from class: X.4vS
    };
    public final long maxFadeDuration = TimeUnit.SECONDS.toMicros(10);

    private final long calculateMaxFadeDuration(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot != null) {
            long j = 2;
            long duration = nLETrackSlot.getDuration() / j;
            long j2 = this.maxFadeDuration;
            if (duration >= j2) {
                return j2;
            }
            return nLETrackSlot.getDuration() / j;
        }
        return 0L;
    }

    private final float getMaxFadeDuration(NLETrackSlot nLETrackSlot) {
        return ((float) TimeUnit.MICROSECONDS.toMillis(calculateMaxFadeDuration(nLETrackSlot))) / 1000.0f;
    }

    public final void playRange(EditorProContext editorContext) {
        NLETrackSlot selectedTrackSlot;
        o.LJIIIZ(editorContext, "editorContext");
        if (editorContext.getSelectedTrack() != null && (selectedTrackSlot = editorContext.getSelectedTrackSlot()) != null) {
            C125014vR.LIZ(editorContext.getPlayer(), selectedTrackSlot.getStartTime(), selectedTrackSlot.getMeasuredEndTime(), false, 12);
        }
    }

    private final void sendSelectEvent(NLETrackSlot nLETrackSlot, EditorProContext editorProContext) {
        C127594zb c127594zb = null;
        if (nLETrackSlot != null) {
            c127594zb = new C127594zb(nLETrackSlot, null, 14);
        }
        C79057V0z.LJJJJL(editorProContext, "select_slot_event", c127594zb);
    }

    public final boolean deleteAudio(NLETrackSlot nLETrackSlot, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        OSZ<NLETrack, NLETrackSlot> LJJIZ = editorContext.getEditor().LJJIZ(nLETrackSlot, EnumC124724uy.COMMIT);
        NLEModel LJJI = C79057V0z.LJJI(editorContext);
        EnumC123864ta enumC123864ta = EnumC123864ta.AUDIO;
        C124614un.LIZLLL(LJJI, enumC123864ta);
        C79057V0z.LJJJJL(editorContext, "delete_slot_event", new C122684rg(enumC123864ta, LJJIZ.getFirst(), LJJIZ.getSecond()));
        if (LJJIZ.getFirst() != null && LJJIZ.getSecond() != null) {
            return true;
        }
        return false;
    }

    public final Float getProgress(boolean z, EditorProContext editorContext) {
        NLETrackSlot selectedTrackSlot;
        long j;
        o.LJIIIZ(editorContext, "editorContext");
        if (editorContext.getSelectedTrack() == null || (selectedTrackSlot = editorContext.getSelectedTrackSlot()) == null) {
            return null;
        }
        long calculateMaxFadeDuration = calculateMaxFadeDuration(selectedTrackSlot);
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(selectedTrackSlot.LJI());
        if (LIZLLL != null) {
            if (z) {
                j = LIZLLL.LJII();
            } else {
                j = LIZLLL.LJIIIIZZ();
            }
        } else {
            j = 0;
        }
        float f = 1.0f;
        float f2 = (((float) j) * 1.0f) / ((float) calculateMaxFadeDuration);
        if (f2 <= 1.0f) {
            f = f2;
        }
        return Float.valueOf(f);
    }

    public final float getCurDuration(boolean z, NLETrackSlot nLETrackSlot, EditorProContext editorContext) {
        float f;
        o.LJIIIZ(editorContext, "editorContext");
        float maxFadeDuration = getMaxFadeDuration(nLETrackSlot);
        Float progress = getProgress(z, editorContext);
        if (progress != null) {
            f = progress.floatValue();
        } else {
            f = 0.0f;
        }
        return maxFadeDuration * f;
    }

    public final void updateFadeInOut(float f, boolean z, boolean z2, EditorProContext editorContext) {
        NLETrackSlot selectedTrackSlot;
        long LJII;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrack selectedTrack = editorContext.getSelectedTrack();
        if (selectedTrack != null && (selectedTrackSlot = editorContext.getSelectedTrackSlot()) != null) {
            long calculateMaxFadeDuration = calculateMaxFadeDuration(selectedTrackSlot);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Drag time: ");
            long j = ((float) calculateMaxFadeDuration) * f;
            LIZ.append(j);
            C131935Ft.LIZ(X1D.LIZIZ(LIZ));
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(selectedTrackSlot.LJI());
            if (LIZLLL != null) {
                if (z) {
                    LJII = j;
                } else {
                    LJII = LIZLLL.LJII();
                }
                LIZLLL.LJIIZILJ(LJII);
                if (z) {
                    j = LIZLLL.LJIIIIZZ();
                }
                LIZLLL.LJIJ(j);
            }
            if (C124574uj.LJJIL(selectedTrack) && selectedTrack.LJIILLIIL().size() > 1) {
                selectedTrack.setExtra("AudioTrackType", "EDITOR_MUSIC");
            }
            if (!selectedTrack.hasExtra("track_extra_is_fade")) {
                selectedTrack.setExtra("track_extra_is_fade", "true");
            }
        }
        if (z2) {
            C79057V0z.LJIILJJIL(editorContext, true);
        } else {
            C79057V0z.LJIIL(editorContext);
        }
    }

    public static /* synthetic */ boolean deleteAudio$default(AudioViewModel audioViewModel, NLETrackSlot nLETrackSlot, EditorProContext editorProContext, int i, Object obj) {
        if ((i & 1) != 0) {
            nLETrackSlot = null;
        }
        return audioViewModel.deleteAudio(nLETrackSlot, editorProContext);
    }

    public static /* synthetic */ void sendSelectEvent$default(AudioViewModel audioViewModel, NLETrackSlot nLETrackSlot, EditorProContext editorProContext, int i, Object obj) {
        if ((i & 1) != 0) {
            nLETrackSlot = null;
        }
        audioViewModel.sendSelectEvent(nLETrackSlot, editorProContext);
    }
}
