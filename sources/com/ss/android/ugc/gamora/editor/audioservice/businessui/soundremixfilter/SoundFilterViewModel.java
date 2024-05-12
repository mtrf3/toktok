package com.ss.android.ugc.gamora.editor.audioservice.businessui.soundremixfilter;

import X.C150055uj;
import X.C76800UCe;
import X.InterfaceC150095un;
import X.InterfaceC88472Yns;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SoundFilterViewModel extends ViewModel {
    public final NLEEditor LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final C150055uj LJLJJI;
    public InterfaceC150095un LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:90:0x001b, code lost:
    
        if (r15 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(com.ss.android.ugc.effectmanager.effect.model.Effect r15) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.audioservice.businessui.soundremixfilter.SoundFilterViewModel.gv0(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SoundFilterViewModel(NLEEditor nleEditor, String str, InterfaceC88472Yns<? super String, C76800UCe> onSelectSoundFilter, C150055uj c150055uj) {
        o.LJIIIZ(nleEditor, "nleEditor");
        o.LJIIIZ(onSelectSoundFilter, "onSelectSoundFilter");
        this.LJLIL = nleEditor;
        this.LJLILLLLZI = str;
        this.LJLJI = onSelectSoundFilter;
        this.LJLJJI = c150055uj;
    }
}
