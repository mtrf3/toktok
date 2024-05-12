package com.ss.android.ugc.aweme.commerce.tools.music.viewmodel;

import X.C1DF;
import X.C221108m2;
import X.C42494Gm2;
import X.C42496Gm4;
import X.C42498Gm6;
import X.C61845OOz;
import X.C62822Ol8;
import X.C65351Pkp;
import X.C65352Pkq;
import X.InterfaceC41034G8o;
import X.InterfaceC42491Glz;
import X.InterfaceC74236TBo;
import X.OF1;
import X.TBT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceMusicLegalViewModel extends ViewModel implements InterfaceC41034G8o<InterfaceC42491Glz> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final InterfaceC42491Glz LJLIL;
    public final OF1 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final boolean LJLJJLL;

    static {
        TBT tbt = new TBT(CommerceMusicLegalViewModel.class, "hasBrandedContent", "getHasBrandedContent()Landroidx/lifecycle/MutableLiveData;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(CommerceMusicLegalViewModel.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC42491Glz L9() {
        return this.LJLIL;
    }

    public CommerceMusicLegalViewModel(InterfaceC42491Glz depend) {
        AVMusic extractAVMusic;
        o.LJIIIZ(depend, "depend");
        this.LJLIL = depend;
        this.LJLILLLLZI = C1DF.LJJIFFI(this, C42494Gm2.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 69));
        OF1 LJJIFFI = C1DF.LJJIFFI(this, C42496Gm4.LJLIL);
        this.LJLJJI = new MutableLiveData<>(Boolean.valueOf(C42498Gm6.LIZ().defaultValue));
        this.LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 70));
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLJL;
        boolean z = true;
        if (!((VideoPublishEditModel) LJJIFFI.LIZ(this, interfaceC74236TBoArr[1])).realHasOriginalSound() && (extractAVMusic = MusicBeanUtilKt.extractAVMusic(((VideoPublishEditModel) LJJIFFI.LIZ(this, interfaceC74236TBoArr[1])).creativeModel.musicBuzModel)) != null && !extractAVMusic.isOriginalSound()) {
            z = false;
        }
        this.LJLJJLL = z;
    }
}
