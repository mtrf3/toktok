package com.ss.android.ugc.gamora.editorpro.audio;

import X.AnonymousClass514;
import X.C124574uj;
import X.C16880lQ;
import X.C32I;
import X.C36636EZk;
import X.C40675Fxn;
import X.C48841JEv;
import X.C5F7;
import X.C5FX;
import X.C64504PTg;
import X.C68322mC;
import X.C79057V0z;
import X.EnumC122254qz;
import X.H7C;
import X.InterfaceC70422pa;
import X.MBA;
import X.ORS;
import X.ORZ;
import X.T2R;
import X.XKQ;
import X.XKX;
import Y.ARunnableS13S0300000_2;
import Y.IDComparatorS30S0000000_2;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioRecordActivityViewModel extends ViewModel implements InterfaceC70422pa {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final MBA LJLIL = C36636EZk.LIZ.plus(T2R.LJIIJJI());
    public final MutableLiveData<List<Float>> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<AnonymousClass514> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<String> LJLJJI = new MutableLiveData<>();
    public final Handler LJLJJL = new Handler(C16880lQ.LLJJJJ());
    public XKQ LJLJJLL;
    public boolean LJLJL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C48841JEv.LIZJ(this, null);
        this.LJLJJL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public static Stack gv0(EditorProContext editorProContext) {
        int i;
        Stack stack = new Stack();
        VecNLETrackSPtr tracks = C79057V0z.LJJI(editorProContext).getTracks();
        o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it3.next()).LJIILL(), arrayList2);
        }
        for (NLETrackSlot nLETrackSlot : ORZ.LLILII(new IDComparatorS30S0000000_2(58), arrayList2)) {
            int LJJLIIIJL = (int) C124574uj.LJJLIIIJL(nLETrackSlot.getStartTime());
            int LJJLIIIJL2 = (int) C124574uj.LJJLIIIJL(nLETrackSlot.getEndTime());
            if (nLETrackSlot.hasExtra("audio_record_order")) {
                i = C64504PTg.LIZ(nLETrackSlot, "audio_record_order", "slot.getExtra(ExtraKeys.AUDIO_RECORD_ORDER)");
            } else {
                i = 0;
            }
            if (stack.isEmpty() || ((C5FX) stack.peek()).LJLIL.getY() < LJJLIIIJL) {
                stack.push(new C5FX(i, new Point(LJJLIIIJL, LJJLIIIJL2, LJJLIIIJL2 - LJJLIIIJL)));
            } else {
                C5FX c5fx = (C5FX) stack.peek();
                Point point = c5fx.LJLIL;
                point.setY(Math.max(point.getY(), LJJLIIIJL2));
                c5fx.LJLIL.setT(r2.getY() - c5fx.LJLIL.getX());
                c5fx.LJLILLLLZI = i;
                C79057V0z.LJJI(editorProContext).setExtra("is_audio_record_overlap", "1");
            }
        }
        if (stack.size() > 1) {
            C40675Fxn.LJJLIIIJ(stack, new IDComparatorS30S0000000_2(57));
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(stack, 10));
        Iterator it4 = stack.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((C5FX) it4.next()).LJLIL);
        }
        Stack stack2 = new Stack();
        stack2.addAll(arrayList3);
        return stack2;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.Set] */
    public static void hv0(String str, EditorProContext editorProContext) {
        ArrayList arrayList = new ArrayList();
        C68322mC c68322mC = new C68322mC();
        VecNLETrackSPtr tracks = C79057V0z.LJJI(editorProContext).getTracks();
        o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                it2.setEnable(false);
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(((NLETimeSpaceNode) it3.next()).getStartTime()));
                }
                c68322mC.element = ORZ.LLJJ(arrayList2);
                Iterator<NLETrackSlot> it4 = it2.LJIILL().iterator();
                while (it4.hasNext()) {
                    NLETrackSlot next = it4.next();
                    if (((Set) c68322mC.element).contains(Long.valueOf(next.getStartTime()))) {
                        next.setStartTime(next.getStartTime() + 1);
                    }
                    arrayList.add(next);
                }
            } else if (o.LJ(it2.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                if (str != null) {
                    C79057V0z.LJJI(editorProContext).removeTrack(it2);
                } else {
                    it2.setEnable(true);
                }
            }
        }
        if (str != null) {
            NLETrack nLETrack = new NLETrack();
            nLETrack.setExtra("AudioTrackType", EnumC122254qz.DUB.name());
            nLETrack.setStartTime(0L);
            nLETrack.setEndTime(-2L);
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                nLETrack.LIZIZ(NLETrackSlot.LIZ(((NLENode) it5.next()).deepClone(true)));
            }
            C79057V0z.LJJI(editorProContext).addTrack(nLETrack);
        }
        C79057V0z.LJIIL(editorProContext);
    }

    public final void iv0(VideoPublishEditModel videoPublishEditModel, EditorProContext editorProContext) {
        H7C.LJI(3, "music", null, "compileRecordAudio call");
        XKQ xkq = this.LJLJJLL;
        if (xkq != null && !xkq.isCompleted()) {
            H7C.LJI(3, "music", null, "compileRecordAudio call canel");
            xkq.LIZIZ(null);
        }
        this.LJLJJLL = XKX.LIZLLL(this, null, null, new C5F7(this, editorProContext, videoPublishEditModel, null), 3);
        C79057V0z.LJJI(editorProContext).setExtra("is_audio_record_edited", "1");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(android.app.Dialog r7, X.InterfaceC67352kd<? super java.lang.String> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C5FW
            if (r0 == 0) goto L6e
            r5 = r8
            X.5FW r5 = (X.C5FW) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r2 = 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L38
            if (r0 != r2) goto L74
            java.lang.Object r7 = r5.LJLILLLLZI
            android.app.Dialog r7 = (android.app.Dialog) r7
            com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L28:
            if (r7 == 0) goto L2d
            r7.dismiss()
        L2d:
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r0.LJLJJI
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L36
        L35:
            return r4
        L36:
            r4 = r0
            goto L35
        L38:
            X.C141335gf.LIZJ(r1)
            X.XKQ r1 = r6.LJLJJLL
            if (r1 != 0) goto L49
            r3 = 0
            r2 = 5
            java.lang.String r1 = "music"
            java.lang.String r0 = "compileJob is null"
            X.H7C.LJI(r2, r1, r3, r0)
            return r4
        L49:
            boolean r0 = r1.isCompleted()
            if (r0 == 0) goto L5a
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r6.LJLJJI
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L58
        L57:
            return r4
        L58:
            r4 = r0
            goto L57
        L5a:
            if (r7 == 0) goto L5f
            X.C16880lQ.LIZ(r7)
        L5f:
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r2
            java.lang.Object r0 = r1.LJJJJ(r5)
            if (r0 != r3) goto L6c
            return r3
        L6c:
            r0 = r6
            goto L28
        L6e:
            X.5FW r5 = new X.5FW
            r5.<init>(r6, r8)
            goto L12
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel.jv0(android.app.Dialog, X.2kd):java.lang.Object");
    }

    public final void lv0(EditorProContext editorContext, VideoPublishEditModel videoPublishEditModel, long j) {
        o.LJIIIZ(editorContext, "editorContext");
        XKQ xkq = this.LJLJJLL;
        if (xkq == null) {
            iv0(videoPublishEditModel, editorContext);
            return;
        }
        if (!xkq.isCompleted()) {
            H7C.LJI(3, "music", null, "compileRecordAudio call canel");
            xkq.LIZIZ(null);
        }
        this.LJLJJL.removeCallbacksAndMessages(null);
        this.LJLJL = true;
        this.LJLJJL.postDelayed(new ARunnableS13S0300000_2(this, editorContext, videoPublishEditModel, 11), j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, com.ss.ugc.android.editor.core.EditorProContext r8, kotlin.jvm.internal.AqS152S0100000_2 r9, X.InterfaceC67352kd r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C5FV
            if (r0 == 0) goto Lae
            r5 = r10
            X.5FV r5 = (X.C5FV) r5
            int r2 = r5.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r5.LJLJJLL = r2
        L12:
            java.lang.Object r3 = r5.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJJLL
            r2 = 1
            r0 = 0
            if (r1 == 0) goto L7b
            if (r1 != r2) goto Lb5
            com.ss.ugc.android.editor.core.EditorProContext r8 = r5.LJLJI
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r5.LJLILLLLZI
            com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel r4 = r5.LJLIL
            X.C141335gf.LIZJ(r3)
        L27:
            java.lang.String r3 = (java.lang.String) r3
            int r0 = r3.length()
            r2 = 0
            if (r0 <= 0) goto L78
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r7.veAudioRecorderParam
            if (r1 == 0) goto L50
            r1.setAudioUrl(r3)
            r4.getClass()
            java.util.Stack r0 = gv0(r8)
            r1.setMStack(r0)
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r8)
            java.util.List r0 = X.C120834oh.LIZ(r0)
            r1.setMultiTrackAudio(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L72
        L50:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = new com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam
            r1.<init>()
            r1.setAudioUrl(r3)
            r4.getClass()
            java.util.Stack r0 = gv0(r8)
            r1.setMStack(r0)
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r8)
            java.util.List r0 = X.C120834oh.LIZ(r0)
            r1.setMultiTrackAudio(r0)
            r1.setNeedOriginalSound(r2)
            r7.veAudioRecorderParam = r1
        L72:
            r4.getClass()
            hv0(r3, r8)
        L78:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7b:
            X.C141335gf.LIZJ(r3)
            X.XKQ r1 = r6.LJLJJLL
            if (r1 != 0) goto L88
            hv0(r0, r8)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L88:
            boolean r1 = r6.LJLJL
            if (r1 == 0) goto L94
            android.os.Handler r1 = r6.LJLJJL
            r1.removeCallbacksAndMessages(r0)
            r6.iv0(r7, r8)
        L94:
            if (r9 == 0) goto L9c
            java.lang.Object r0 = r9.invoke()
            android.app.Dialog r0 = (android.app.Dialog) r0
        L9c:
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJI = r8
            r5.LJLJJLL = r2
            java.lang.Object r3 = r6.jv0(r0, r5)
            if (r3 != r4) goto Lab
            return r4
        Lab:
            r4 = r6
            goto L27
        Lae:
            X.5FV r5 = new X.5FV
            r5.<init>(r6, r10)
            goto L12
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.audio.AudioRecordActivityViewModel.kv0(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.ugc.android.editor.core.EditorProContext, kotlin.jvm.internal.AqS152S0100000_2, X.2kd):java.lang.Object");
    }
}
