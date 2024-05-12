package com.ss.android.ugc.aweme.profile.edit;

import X.AV1;
import X.C03880Dg;
import X.C09900aA;
import X.C198517qh;
import X.C245319jz;
import X.C252669vq;
import X.C26316AUm;
import X.C26317AUn;
import X.C26335AVf;
import X.C38306F1q;
import X.C38333F2r;
import X.C38816FLg;
import X.C40883G2t;
import X.C43256GyK;
import X.C65300Pk0;
import X.C66619QCp;
import X.C72972SkS;
import X.C86184Xs4;
import X.C87030YDq;
import X.DialogC254019y1;
import X.HG3;
import X.InterfaceC26315AUl;
import X.InterfaceC26318AUo;
import X.InterfaceC26320AUq;
import X.RBX;
import X.X1D;
import Y.ACListenerS21S0201000_3;
import Y.ACListenerS23S0101000_4;
import Y.ACListenerS32S0101000_15;
import Y.ARunnableS3S1200000_4;
import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class AvatarVideoPresenter extends AvatarPresenter implements InterfaceC26318AUo {
    public boolean mIsRemovedVideoIcon;
    public List<C66619QCp> mPairs;

    @Override // X.InterfaceC26318AUo
    public void onRemoveAvatarVideo() {
        this.mIsRemovedVideoIcon = true;
        InterfaceC26320AUq interfaceC26320AUq = this.mView;
        if (interfaceC26320AUq != null) {
            ((InterfaceC26315AUl) interfaceC26320AUq).fT();
        }
    }

    public void onUploadAvatarVideo() {
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 != null) {
            if (c86184Xs4.LJIIIZ == null) {
                DialogC254019y1 dialogC254019y1 = new DialogC254019y1(c86184Xs4.LIZJ);
                c86184Xs4.LJIIIZ = dialogC254019y1;
                dialogC254019y1.setCancelable(false);
            }
            DialogC254019y1 dialogC254019y12 = c86184Xs4.LJIIIZ;
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/dmt/ui/dialog/DmtStatusViewDialog", "show", dialogC254019y12, new Object[0], "void", new C65300Pk0(false, "()V", "5828566512857760111")).LIZ) {
                dialogC254019y12.show();
            }
        }
        this.mRetryCount = 0;
    }

    public void toSelectVideo() {
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 == null) {
            return;
        }
        C26316AUm c26316AUm = (C26316AUm) c86184Xs4;
        new C43256GyK().LIZ(c26316AUm.LIZJ, new C26317AUn(c26316AUm));
    }

    public boolean isRemovedVideoIcon() {
        return this.mIsRemovedVideoIcon;
    }

    public void bindView(InterfaceC26315AUl interfaceC26315AUl) {
        this.mView = interfaceC26315AUl;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        String message2;
        String str;
        DialogC254019y1 dialogC254019y1;
        C86184Xs4 c86184Xs4;
        InterfaceC26320AUq interfaceC26320AUq = this.mView;
        if (interfaceC26320AUq != null) {
            Object obj = message.obj;
            if (obj instanceof Exception) {
                int i = this.mRetryCount;
                if (i < 4 && (c86184Xs4 = this.mAccountHelper) != null) {
                    int i2 = i + 1;
                    this.mRetryCount = i2;
                    C26316AUm c26316AUm = (C26316AUm) c86184Xs4;
                    C38816FLg.LIZLLL(new ARunnableS3S1200000_4(this.mPairs, c26316AUm.LJIILLIIL, c26316AUm, 3), (i2 << 1) * 1000);
                    return;
                }
                Exception exc = (Exception) obj;
                C198517qh c198517qh = new C198517qh();
                boolean z = exc instanceof C38333F2r;
                if (z) {
                    message2 = ((C38333F2r) exc).getErrorMsg();
                } else {
                    message2 = exc.getMessage();
                }
                c198517qh.LIZ.put("errorDesc", message2);
                String str2 = "-1";
                if (!z) {
                    str = "-1";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(((C38306F1q) exc).getErrorCode());
                    LIZ.append("");
                    str = X1D.LIZIZ(LIZ);
                }
                c198517qh.LIZ.put("errorCode", str);
                C09900aA.LJIIJJI("aweme_avartar_upload_error_rate", 1, c198517qh.LJ());
                if (z) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(((C38306F1q) exc).getErrorCode());
                    LIZ2.append("");
                    str2 = X1D.LIZIZ(LIZ2);
                }
                C26335AVf.LJIILL(0, "video", str2);
                ((InterfaceC26315AUl) this.mView).rr((Exception) message.obj);
                C86184Xs4 c86184Xs42 = this.mAccountHelper;
                if (c86184Xs42 != null && (dialogC254019y1 = c86184Xs42.LJIIIZ) != null && dialogC254019y1.isShowing()) {
                    c86184Xs42.LJIIIZ.dismiss();
                    return;
                }
                return;
            }
            if (obj instanceof AvatarUri) {
                ((InterfaceC26315AUl) interfaceC26320AUq).Ni((AvatarUri) obj);
                C09900aA.LJIIJJI("aweme_avartar_upload_error_rate", 0, null);
                C26335AVf.LJIILL(1, "video", null);
            }
        }
    }

    @Override // X.InterfaceC26318AUo
    public void onChooseAvatarVideo(String str) {
        InterfaceC26320AUq interfaceC26320AUq = this.mView;
        if (interfaceC26320AUq != null) {
            ((InterfaceC26315AUl) interfaceC26320AUq).iS(str);
        }
        this.mFilePath = str;
    }

    public void onClickAvatarVideo(View view) {
        String str;
        String str2;
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 == null) {
            return;
        }
        String[] stringArray = c86184Xs4.LIZLLL.getStringArray(R.array.ai);
        C245319jz c245319jz = new C245319jz();
        C252669vq[] c252669vqArr = new C252669vq[3];
        C252669vq c252669vq = new C252669vq();
        String str3 = "";
        if (stringArray.length < 1) {
            str = "";
        } else {
            str = stringArray[0];
        }
        c252669vq.LIZIZ(str);
        c252669vq.LJ = new ACListenerS32S0101000_15(2, c86184Xs4, 0);
        c252669vqArr[0] = c252669vq;
        C252669vq c252669vq2 = new C252669vq();
        if (stringArray.length < 2) {
            str2 = "";
        } else {
            str2 = stringArray[1];
        }
        c252669vq2.LIZIZ(str2);
        c252669vq2.LJ = new ACListenerS23S0101000_4(1, c86184Xs4, 0);
        c252669vqArr[1] = c252669vq2;
        C252669vq c252669vq3 = new C252669vq();
        if (stringArray.length >= 3) {
            str3 = stringArray[2];
        }
        c252669vq3.LIZIZ(str3);
        c252669vq3.LJ = new ACListenerS21S0201000_3(1, c86184Xs4, view, 0);
        c252669vqArr[2] = c252669vq3;
        c245319jz.LIZIZ(c252669vqArr);
        c245319jz.LIZJ().show(c86184Xs4.LJ.getFragmentManager(), "Click Avatar Video");
    }

    public void setIsRemovedVideoIcon(Boolean bool) {
        this.mIsRemovedVideoIcon = bool.booleanValue();
    }

    public void uploadAvatarVideo(int i) {
        if (this.mAccountHelper != null && !TextUtils.isEmpty(this.mFilePath)) {
            if (i != -1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C66619QCp("source", C72972SkS.LIZLLL(i, "")));
                this.mPairs = arrayList;
            } else {
                this.mPairs = null;
            }
            C26316AUm c26316AUm = (C26316AUm) this.mAccountHelper;
            String str = this.mFilePath;
            List<C66619QCp> list = this.mPairs;
            c26316AUm.LJIILLIIL = str;
            C38816FLg.LIZLLL(new ARunnableS3S1200000_4(list, str, c26316AUm, 3), 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter
    public void initHeadUploadHelper(Activity activity, Fragment fragment) {
        this.mAccountHelper = new C26316AUm(activity, fragment, new WeakHandler(this), this);
    }

    public void initHeadVideoUploadHelper(Activity activity, Fragment fragment) {
        this.mAccountHelper = new C26316AUm(activity, fragment, new WeakHandler(this), this);
    }

    @Override // X.InterfaceC26318AUo
    public void onViewImageAvatarClick(Activity activity, View view) {
        String[] strArr;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        C87030YDq c87030YDq = C87030YDq.LIZIZ;
        C40883G2t c40883G2t = new C40883G2t();
        ((Bundle) c40883G2t.LIZ).putParcelable("extra_zoom_info", ZoomAnimationUtils.LIZ(view));
        c40883G2t.LIZJ("enable_edit_img", false);
        c40883G2t.LIZJ("enable_download_img", true);
        if (TextUtils.isEmpty(this.mFilePath)) {
            strArr = AV1.LJIIIZ(AV1.LJIIJ(curUser));
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            LIZ.append(this.mFilePath);
            strArr = new String[]{UriProtector.parse(X1D.LIZIZ(LIZ)).toString()};
        }
        ((BaseBundle) c40883G2t.LIZ).putStringArray("uri", strArr);
        ((Bundle) c40883G2t.LIZ).putSerializable("share_info", curUser);
        c87030YDq.startHeaderDetailActivity(activity, (Bundle) c40883G2t.LIZ);
    }
}
