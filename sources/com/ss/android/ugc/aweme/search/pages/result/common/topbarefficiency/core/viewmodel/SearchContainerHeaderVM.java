package com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel;

import X.C36636EZk;
import X.C49802Jgc;
import X.C49803Jgd;
import X.C49804Jge;
import X.EnumC49652JeC;
import X.XKX;
import android.animation.ValueAnimator;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchContainerHeaderVM extends ViewModel {
    public int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public final NextLiveData LJLJJI;
    public final NextLiveData LJLJJL;
    public final NextLiveData LJLJJLL;
    public final NextLiveData LJLJL;
    public final NextLiveData LJLJLJ;
    public final NextLiveData LJLJLLL;
    public final NextLiveData LJLL;
    public final NextLiveData LJLLI;
    public final NextLiveData LJLLILLLL;
    public final NextLiveData LJLLJ;
    public boolean LJLLL;
    public EnumC49652JeC LJLLLL;
    public EnumC49652JeC LJLLLLLL;
    public ValueAnimator LJLZ;
    public ValueAnimator LJZ;
    public final MutableLiveData<Boolean> LJZI;
    public final MutableLiveData LJZL;
    public boolean LL;
    public int LLD;
    public int LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final C49803Jgd LLFII;

    public final void gv0() {
        if (!C49804Jge.LJJIZ()) {
            return;
        }
        this.LL = false;
        this.LJLLL = false;
        EnumC49652JeC enumC49652JeC = EnumC49652JeC.NOT_START;
        this.LJLLLL = enumC49652JeC;
        this.LJLLLLLL = enumC49652JeC;
        this.LLFFF = false;
        this.LJZI.setValue(Boolean.FALSE);
        this.LJLJLJ.setValue(0);
        this.LJLJJLL.setValue(0);
    }

    public final void iv0() {
        this.LJLLL = true;
        hv0();
    }

    public SearchContainerHeaderVM() {
        NextLiveData nextLiveData = new NextLiveData();
        this.LJLJJI = nextLiveData;
        this.LJLJJL = nextLiveData;
        NextLiveData nextLiveData2 = new NextLiveData();
        this.LJLJJLL = nextLiveData2;
        this.LJLJL = nextLiveData2;
        NextLiveData nextLiveData3 = new NextLiveData();
        this.LJLJLJ = nextLiveData3;
        this.LJLJLLL = nextLiveData3;
        NextLiveData nextLiveData4 = new NextLiveData();
        this.LJLL = nextLiveData4;
        this.LJLLI = nextLiveData4;
        NextLiveData nextLiveData5 = new NextLiveData();
        this.LJLLILLLL = nextLiveData5;
        this.LJLLJ = nextLiveData5;
        EnumC49652JeC enumC49652JeC = EnumC49652JeC.NOT_START;
        this.LJLLLL = enumC49652JeC;
        this.LJLLLLLL = enumC49652JeC;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.LJZI = mutableLiveData;
        this.LJZL = mutableLiveData;
        this.LLFF = true;
        this.LLFII = new C49803Jgd(this);
    }

    public final void hv0() {
        if (C49804Jge.LJJIZ() && this.LJLLLLLL == EnumC49652JeC.NOT_START) {
            EnumC49652JeC enumC49652JeC = this.LJLLLL;
            EnumC49652JeC enumC49652JeC2 = EnumC49652JeC.START;
            if (enumC49652JeC != enumC49652JeC2 && this.LJZ == null) {
                T value = this.LJZL.getValue();
                Boolean bool = Boolean.FALSE;
                if (o.LJ(value, bool)) {
                    return;
                }
                this.LJLLLLLL = enumC49652JeC2;
                this.LJZI.setValue(bool);
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C36636EZk.LIZ, null, new C49802Jgc(this, null), 2);
            }
        }
    }
}
