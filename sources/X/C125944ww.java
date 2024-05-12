package X;

import Y.ARunnableS38S0100000_2;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.ugc.android.editor.base.viewmodel.AudioViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125944ww implements InterfaceC1279450k {
    public final ActivityC45651qj LIZ;
    public final C62822Ol8 LIZIZ;
    public final SafeHandler LIZJ;
    public final List<SoundEffect> LIZLLL;
    public long LJ;

    @Override // X.InterfaceC1279450k
    public final void LIZIZ() {
        this.LIZJ.post(new ARunnableS38S0100000_2(this, 6));
    }

    public final EditorProContext LJI() {
        return (EditorProContext) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1279450k
    public final void LIZLLL() {
        NLETrackSlot selectedTrackSlot = LJI().getSelectedTrackSlot();
        if (selectedTrackSlot == null || !C124604um.LJII(selectedTrackSlot, LJI())) {
            return;
        }
        if (selectedTrackSlot.hasExtra("slot_extra_music_id")) {
            o.LJIIIIZZ(selectedTrackSlot.getExtra("slot_extra_music_id"), "slot.getExtra(ExtraKeys.SLOT_EXTRA_MUSIC_ID)");
        }
        C125024vS c125024vS = AudioViewModel.Companion;
        ActivityC45651qj activity = this.LIZ;
        c125024vS.getClass();
        o.LJIIIZ(activity, "activity");
        boolean deleteAudio = ((AudioViewModel) C5G0.LIZ(AudioViewModel.class)).deleteAudio(selectedTrackSlot, LJI());
        Iterator it = ((ArrayList) C124604um.LIZLLL(C79057V0z.LJJI(LJI()))).iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((NLETrack) it.next()).LJIILL().contains(selectedTrackSlot)) {
                z = true;
            }
        }
        if (deleteAudio && !z) {
            C124604um.LJIIIIZZ(C79057V0z.LJJI(LJI()));
            LJII(this);
            C32151Nz.LIZIZ(EnumC126814yL.DELETE.getNameId(), LJI());
            return;
        }
        H7C.LJI(3, "SoundEffect", "deleteSound", "delete Sound failed.");
    }

    @Override // X.InterfaceC1279450k
    public final void LJFF() {
        NLETrackSlot selectedTrackSlot = LJI().getSelectedTrackSlot();
        if (selectedTrackSlot == null || !C124604um.LJII(selectedTrackSlot, LJI())) {
            return;
        }
        NLETrackSlot newSlot = NLETrackSlot.LIZ(selectedTrackSlot.deepClone(true));
        NLEModel LJJI = C79057V0z.LJJI(LJI());
        o.LJIIIIZZ(newSlot, "newSlot");
        C52B.LJ(LJJI, newSlot, C124604um.LIZLLL(C79057V0z.LJJI(LJI())), new AqS152S0100000_2(this, 8));
        C79057V0z.LJJJJLI(LJI(), "selected_audio_track_slot", newSlot, true);
        C32151Nz.LIZIZ(EnumC126814yL.COPY_SOUND_EFFECT.getNameId(), LJI());
    }

    @Override // X.InterfaceC1279450k
    public final void LIZ() {
        LJII(this);
    }

    public static void LJII(C125944ww c125944ww) {
        c125944ww.getClass();
        List LIZLLL = C124604um.LIZLLL(C79057V0z.LJJI(c125944ww.LJI()));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NLETrack) it.next()).LJIILLIIL().size()));
        }
        if (ORZ.LLILLIZIL(arrayList) == ((ArrayList) c125944ww.LIZLLL).size()) {
            return;
        }
        List LIZLLL2 = C124604um.LIZLLL(C79057V0z.LJJI(c125944ww.LJI()));
        ((ArrayList) c125944ww.LIZLLL).clear();
        Iterator it2 = ((ArrayList) LIZLLL2).iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILLIIL().iterator();
            while (it3.hasNext()) {
                SoundEffect LIZIZ = C125954wx.LIZIZ(it3.next().getExtra("slot_extra_music_id"));
                if (LIZIZ != null) {
                    ((ArrayList) c125944ww.LIZLLL).add(LIZIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC1279450k
    public final void LJ(float f) {
        Iterator it = ((ArrayList) C124604um.LIZLLL(C79057V0z.LJJI(LJI()))).iterator();
        while (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = ((NLETrack) it.next()).LJIILLIIL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot it3 = it2.next();
                o.LJIIIIZZ(it3, "it");
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, it3.LJI());
                if (nLESegmentAudio != null) {
                    nLESegmentAudio.LJIL(f);
                }
            }
        }
        C79057V0z.LJIIL(LJI());
    }

    public C125944ww(C29S activity, C127604zc playground) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(playground, "playground");
        this.LIZ = activity;
        this.LIZIZ = C221108m2.LIZIZ(C123484sy.LJLIL);
        this.LIZJ = new SafeHandler(playground.LJLLLLLL);
        this.LIZLLL = new ArrayList();
        this.LJ = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x021e, code lost:
    
        if (r6 != null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1279450k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.creative.model.SoundEffect r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125944ww.LIZJ(com.ss.android.ugc.aweme.creative.model.SoundEffect, java.lang.String):void");
    }
}
