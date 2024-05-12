package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.LabelData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.ui.LabelDialog;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.viewmodel.InferenceCategoryVM;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XnC, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85882XnC implements InterfaceC36621EYv<BaseResponse> {
    public final /* synthetic */ LabelDialog LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C85882XnC(LabelDialog labelDialog, String str) {
        this.LJLIL = labelDialog;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<BaseResponse> interfaceC37276Ek4, Throwable th) {
        int i = InferenceCategoryVM.LJLJJI;
        if (i > 0) {
            InferenceCategoryVM.LJLJJI = i - 1;
            this.LJLIL.Al(this.LJLILLLLZI);
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<BaseResponse> interfaceC37276Ek4, C64797Pbt<BaseResponse> c64797Pbt) {
        BaseResponse baseResponse;
        boolean z;
        if (c64797Pbt != null && c64797Pbt.LIZIZ() && (baseResponse = c64797Pbt.LIZIZ) != null) {
            if (baseResponse.status_code == 0) {
                LabelData labelData = this.LJLIL.LJLIL;
                if (labelData != null) {
                    if (labelData.getLabelType() == 0) {
                        LabelDialog labelDialog = this.LJLIL;
                        LabelData labelData2 = labelDialog.LJLIL;
                        if (labelData2 != null) {
                            labelData2.setInterestTagId(String.valueOf(labelDialog.LJLJL));
                            LabelDialog labelDialog2 = this.LJLIL;
                            if (labelDialog2.LJLJL == 2) {
                                LabelData labelData3 = labelDialog2.LJLIL;
                                if (labelData3 != null) {
                                    labelData3.setInterestTagValue(labelDialog2.LJLJLJ);
                                } else {
                                    o.LJIJI("mLabelData");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("mLabelData");
                            throw null;
                        }
                    } else {
                        LabelData labelData4 = this.LJLIL.LJLIL;
                        if (labelData4 != null) {
                            Boolean interestTagActive = labelData4.getInterestTagActive();
                            if (interestTagActive != null) {
                                z = interestTagActive.booleanValue();
                            } else {
                                z = false;
                            }
                            labelData4.setInterestTagActive(Boolean.valueOf(!z));
                        } else {
                            o.LJIJI("mLabelData");
                            throw null;
                        }
                    }
                    LabelDialog labelDialog3 = this.LJLIL;
                    InferenceCategoryVM inferenceCategoryVM = labelDialog3.LJLJI;
                    if (inferenceCategoryVM != null) {
                        MutableLiveData<LabelData> mutableLiveData = inferenceCategoryVM.LJLILLLLZI;
                        LabelData labelData5 = labelDialog3.LJLIL;
                        if (labelData5 != null) {
                            mutableLiveData.setValue(labelData5);
                        } else {
                            o.LJIJI("mLabelData");
                            throw null;
                        }
                    } else {
                        o.LJIJI("inferenceVM");
                        throw null;
                    }
                } else {
                    o.LJIJI("mLabelData");
                    throw null;
                }
            } else {
                ActivityC45651qj activityC45651qj = this.LJLIL.LJLILLLLZI;
                if (activityC45651qj != null) {
                    C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
                    c26045AKb.LJIIIIZZ(R.string.img);
                    c26045AKb.LJIIJ();
                } else {
                    o.LJIJI("mActivity");
                    throw null;
                }
            }
            InferenceCategoryVM.LJLJJI = 3;
            return;
        }
        int i = InferenceCategoryVM.LJLJJI;
        if (i <= 0) {
            return;
        }
        InferenceCategoryVM.LJLJJI = i - 1;
        this.LJLIL.Al(this.LJLILLLLZI);
    }
}
