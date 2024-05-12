package com.ss.android.ugc.aweme.profile.editprofile.vm;

import X.C221108m2;
import X.C243999hr;
import X.C244209iC;
import X.C32I;
import X.C62822Ol8;
import X.C73318Sq2;
import X.InterfaceC57784Mm4;
import X.ORZ;
import X.SIT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileEditProfileViewModel extends ViewModel {
    public final C73318Sq2 LJLIL;
    public final List<Integer> LJLILLLLZI;
    public final List<Integer> LJLJI;
    public final List<Integer> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final MutableLiveData<String> LJLJJLL;
    public final MutableLiveData<List<Integer>> LJLJL;
    public final MutableLiveData<Boolean> LJLJLJ;
    public final MutableLiveData<Boolean> LJLJLLL;

    public ProfileEditProfileViewModel(C73318Sq2 behaviorSubjectDisposable) {
        o.LJIIIZ(behaviorSubjectDisposable, "behaviorSubjectDisposable");
        this.LJLIL = behaviorSubjectDisposable;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
        this.LJLJJL = C221108m2.LIZIZ(C244209iC.LJLIL);
        this.LJLJJLL = new MutableLiveData<>();
        this.LJLJL = new MutableLiveData<>();
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new MutableLiveData<>();
    }

    public final void gv0(SIT powerChunk) {
        o.LJIIIZ(powerChunk, "powerChunk");
        ((ArrayList) this.LJLILLLLZI).clear();
        List<Integer> list = this.LJLILLLLZI;
        List<InterfaceC57784Mm4> LJII = powerChunk.LJLJJL.LJII();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJII, 10));
        for (InterfaceC57784Mm4 interfaceC57784Mm4 : LJII) {
            o.LJII(interfaceC57784Mm4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesItem");
            arrayList.add(Integer.valueOf(((C243999hr) interfaceC57784Mm4).LJLIL));
        }
        ((ArrayList) list).addAll(ORZ.LLJILJILJ(arrayList));
        if (((ArrayList) this.LJLJJI).isEmpty()) {
            ((ArrayList) this.LJLJJI).addAll(this.LJLILLLLZI);
        }
    }
}
