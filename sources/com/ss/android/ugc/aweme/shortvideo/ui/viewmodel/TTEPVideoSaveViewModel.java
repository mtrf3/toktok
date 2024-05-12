package com.ss.android.ugc.aweme.shortvideo.ui.viewmodel;

import X.AbstractC41437GOb;
import X.C29901Fi;
import X.C41442GOg;
import X.C78555UsJ;
import X.C84654XKg;
import X.GON;
import X.GOP;
import X.GOR;
import X.GOS;
import X.GOT;
import X.GUH;
import X.GUJ;
import X.GUU;
import X.H7B;
import X.InterfaceC67352kd;
import X.X1D;
import X.XKX;
import Y.ARunnableS6S1200000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TTEPVideoSaveViewModel extends ViewModel {
    public final PublishModel LJLIL;
    public final C29901Fi<GOP> LJLILLLLZI;
    public final C29901Fi LJLJI;

    public final void gv0(boolean z) {
        if (z) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new GON(this, null), 3);
        } else {
            this.LJLILLLLZI.LJII(GOR.LIZ);
        }
    }

    public TTEPVideoSaveViewModel(PublishModel publishModel, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(publishModel, "publishModel");
        this.LJLIL = publishModel;
        new MutableLiveData(Boolean.TRUE);
        C29901Fi<GOP> c29901Fi = new C29901Fi<>();
        this.LJLILLLLZI = c29901Fi;
        this.LJLJI = c29901Fi;
    }

    public static Object hv0(PublishModel publishModel, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        GUH guh = GUH.LIZ;
        AqS188S0100000_6 aqS188S0100000_6 = new AqS188S0100000_6(c84654XKg, 6);
        o.LJIIIZ(publishModel, "publishModel");
        synchronized (guh) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishScheduler | startPublish creationId:");
            LIZ.append(publishModel.creationId);
            LIZ.append(" publishId:");
            LIZ.append((String) null);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            if (publishModel.isTTEPSave) {
                GUH.LJJII(publishModel, aqS188S0100000_6, null);
            } else {
                if (publishModel.creationId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    GUH.LJJII(publishModel, null, null);
                } else {
                    GUU LIZJ = GUJ.LIZJ(GUH.LIZIZ, "", publishModel);
                    if (LIZJ != null) {
                        AbstractC41437GOb abstractC41437GOb = LIZJ.LIZLLL;
                        if (abstractC41437GOb instanceof GOT) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("ReStartNewPublish ");
                            LIZ2.append((String) null);
                            GUH.LJJI(X1D.LIZIZ(LIZ2));
                            GUH.LJJII(publishModel, null, null);
                        } else if (abstractC41437GOb instanceof GOS) {
                            GUH.LJJII(publishModel, null, null);
                        } else if (abstractC41437GOb instanceof C41442GOg) {
                            GUH.LJJI("ReStartRunningPublishWhenPublishIdIsNull");
                            GUH.LIZLLL.execute(new ARunnableS6S1200000_7(LIZJ, publishModel, 2));
                        }
                    }
                    GUH.LJJII(publishModel, null, null);
                }
            }
        }
        return c84654XKg.LIZ();
    }
}
