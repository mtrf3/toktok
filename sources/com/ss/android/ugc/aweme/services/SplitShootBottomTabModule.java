package com.ss.android.ugc.aweme.services;

import X.C0IB;
import X.C45850Hz4;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C82622Wbi;
import X.HKF;
import X.I34;
import X.I3K;
import X.I3X;
import X.I8W;
import X.InterfaceC115514g7;
import X.InterfaceC135635Tz;
import X.InterfaceC74236TBo;
import X.InterfaceC82086WJm;
import X.TBT;
import X.UCI;
import X.WSF;
import X.WSH;
import X.WSJ;
import X.WT3;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SplitShootBottomTabModule implements WSH, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public InterfaceC82086WJm cameraApiComponent;
    public final boolean defaultSelected;
    public final C82622Wbi diContainer;
    public final InterfaceC115514g7 permissionComponent$delegate;
    public final InterfaceC115514g7 recordControlApi$delegate;
    public final InterfaceC115514g7 splitShootApiComponent$delegate;
    public C45850Hz4 tabEnv;
    public final String tag;
    public final String text;

    static {
        TBT tbt = new TBT(SplitShootBottomTabModule.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(SplitShootBottomTabModule.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(SplitShootBottomTabModule.class, "permissionComponent", "getPermissionComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.WSH
    public boolean enable() {
        return true;
    }

    @Override // X.WSH
    public WT3 provideScene() {
        return null;
    }

    public final I8W getPermissionComponent() {
        return (I8W) this.permissionComponent$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.recordControlApi$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    public final I3K getSplitShootApiComponent() {
        return (I3K) this.splitShootApiComponent$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ((ViewModelProvider) getDiContainer().LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "diContainer.get(ViewMode…s.java).shortVideoContext");
        return shortVideoContext;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    @Override // X.WSH
    public WSF createBottomTabItem(C45850Hz4 tabEnv) {
        o.LJIIIZ(tabEnv, "tabEnv");
        return new WSF(this.text, this.tag, "video_15", this.defaultSelected, new WSJ() { // from class: com.ss.android.ugc.aweme.services.SplitShootBottomTabModule$createBottomTabItem$1
            @Override // X.WSJ
            public boolean onTabSelected(WSF model, I34 extraInfo) {
                C0IB<Boolean> iz;
                I8W permissionComponent;
                I3K splitShootApiComponent;
                o.LJIIIZ(model, "model");
                o.LJIIIZ(extraInfo, "extraInfo");
                SplitShootBottomTabModule.this.getRecordControlApi().DG(HKF.class);
                if (!SplitShootBottomTabModule.this.getShortVideoContext().isDuetMode && (splitShootApiComponent = SplitShootBottomTabModule.this.getSplitShootApiComponent()) != null) {
                    splitShootApiComponent.gd0(true);
                }
                I3K splitShootApiComponent2 = SplitShootBottomTabModule.this.getSplitShootApiComponent();
                if (splitShootApiComponent2 != null) {
                    splitShootApiComponent2.Ad0(extraInfo);
                }
                I8W permissionComponent2 = SplitShootBottomTabModule.this.getPermissionComponent();
                if (permissionComponent2 != null && (iz = permissionComponent2.iz()) != null && o.LJ(iz.LIZ(), Boolean.TRUE) && (permissionComponent = SplitShootBottomTabModule.this.getPermissionComponent()) != null) {
                    permissionComponent.Dd0();
                }
                return true;
            }

            @Override // X.WSJ
            public boolean onTabUnselected(WSF model, I34 extraInfo) {
                I3K splitShootApiComponent;
                o.LJIIIZ(model, "model");
                o.LJIIIZ(extraInfo, "extraInfo");
                if (!o.LJ(extraInfo.LJ, "RecordCombinePhoto") && (splitShootApiComponent = SplitShootBottomTabModule.this.getSplitShootApiComponent()) != null) {
                    splitShootApiComponent.gd0(false);
                }
                return false;
            }
        });
    }

    @Override // X.WSH
    public void initialize(C45850Hz4 tabEnv) {
        o.LJIIIZ(tabEnv, "tabEnv");
        this.cameraApiComponent = tabEnv.LIZIZ();
        this.tabEnv = tabEnv;
    }

    public SplitShootBottomTabModule(String text, String tag, C82622Wbi diContainer, boolean z) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(diContainer, "diContainer");
        this.text = text;
        this.tag = tag;
        this.diContainer = diContainer;
        this.defaultSelected = z;
        this.splitShootApiComponent$delegate = UCI.LJII(getDiContainer(), I3K.class, null);
        this.recordControlApi$delegate = UCI.LJI(getDiContainer(), I3X.class, null);
        this.permissionComponent$delegate = UCI.LJII(getDiContainer(), I8W.class, null);
    }
}
