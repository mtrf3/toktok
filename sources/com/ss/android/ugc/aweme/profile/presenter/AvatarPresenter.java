package com.ss.android.ugc.aweme.profile.presenter;

import X.ActivityC45651qj;
import X.C09900aA;
import X.C16880lQ;
import X.C198517qh;
import X.C245319jz;
import X.C252669vq;
import X.C26356AWa;
import X.C36922EeM;
import X.C38306F1q;
import X.C38333F2r;
import X.C38816FLg;
import X.C38891fp;
import X.C65661Ppp;
import X.C66619QCp;
import X.C72972SkS;
import X.C78977Uz7;
import X.C86184Xs4;
import X.DialogC254019y1;
import X.EnumC26325AUv;
import X.InterfaceC248539pB;
import X.InterfaceC26319AUp;
import X.InterfaceC26320AUq;
import X.InterfaceC26321AUr;
import X.STD;
import X.ViewOnClickListenerC26328AUy;
import X.X1D;
import Y.ACListenerS17S0301000_4;
import Y.ACListenerS22S0201000_4;
import Y.ACListenerS23S0101000_4;
import Y.ACListenerS28S0101000_10;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS3S1200000_4;
import Y.IDCListenerS280S0100000_4;
import android.app.Activity;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class AvatarPresenter implements InterfaceC26321AUr, WeakHandler.IHandler, InterfaceC248539pB {
    public C86184Xs4 mAccountHelper;
    public String mFilePath;
    public WeakHandler mHandler = new WeakHandler(this);
    public int mRetryCount;
    public InterfaceC26320AUq mView;
    public InterfaceC26319AUp tracker;
    public List<C66619QCp> uploadParams;

    @Override // X.InterfaceC26321AUr
    public void onUploadAvatar() {
        this.mRetryCount = 0;
    }

    public void checkPermissionAfterSetting() {
        boolean z;
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 != null) {
            boolean z2 = true;
            if (c86184Xs4.LJIILJJIL) {
                if (C38891fp.LJIIJ(c86184Xs4.LIZJ, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c86184Xs4.LJIILJJIL = false;
                c86184Xs4.LJIIL.LJI(EnumC26325AUv.UPLOAD_PHOTO, z);
            }
            if (c86184Xs4.LJIILIIL) {
                if (C38891fp.LJIIJ(c86184Xs4.LIZJ, "android.permission.CAMERA") != 0) {
                    z2 = false;
                }
                c86184Xs4.LJIILIIL = false;
                c86184Xs4.LJIIL.LJI(EnumC26325AUv.UPLOAD_PHOTO, z2);
            }
        }
    }

    public void dismissProgressDialog() {
        DialogC254019y1 dialogC254019y1;
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 != null && (dialogC254019y1 = c86184Xs4.LJIIIZ) != null && dialogC254019y1.isShowing()) {
            c86184Xs4.LJIIIZ.dismiss();
        }
    }

    public C86184Xs4 getHeadUploadHelper() {
        return this.mAccountHelper;
    }

    public void bindView(InterfaceC26320AUq interfaceC26320AUq) {
        this.mView = interfaceC26320AUq;
    }

    public void chooseImage(int i) {
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 != null) {
            c86184Xs4.LJIILJJIL(i);
        }
    }

    public void handleMsg(Message message) {
        String message2;
        String str;
        InterfaceC26320AUq interfaceC26320AUq = this.mView;
        if (interfaceC26320AUq != null) {
            Object obj = message.obj;
            if (obj instanceof Exception) {
                C16880lQ.LLLLIIL((Exception) obj);
                Exception exc = (Exception) message.obj;
                if (this.mAccountHelper != null && needRetry(exc, this.mRetryCount)) {
                    int i = this.mRetryCount + 1;
                    this.mRetryCount = i;
                    C86184Xs4 c86184Xs4 = this.mAccountHelper;
                    String str2 = this.mFilePath;
                    List<C66619QCp> list = this.uploadParams;
                    c86184Xs4.getClass();
                    C38816FLg.LIZLLL(new ARunnableS3S1200000_4(list, str2, c86184Xs4, 4), (i << 1) * 1000);
                    return;
                }
                C198517qh c198517qh = new C198517qh();
                boolean z = exc instanceof C38333F2r;
                if (z) {
                    message2 = ((C38333F2r) exc).getErrorMsg();
                } else {
                    message2 = exc.getMessage();
                }
                c198517qh.LIZ.put("errorDesc", message2);
                if (z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(((C38306F1q) exc).getErrorCode());
                    LIZ.append("");
                    str = X1D.LIZIZ(LIZ);
                } else {
                    str = "-1";
                }
                c198517qh.LIZ.put("errorCode", str);
                c198517qh.LIZ.put("imageUrl", this.mFilePath);
                C09900aA.LJIIJJI("aweme_avartar_upload_error_rate", 1, c198517qh.LJ());
                InterfaceC26319AUp interfaceC26319AUp = this.tracker;
                if (interfaceC26319AUp != null) {
                    interfaceC26319AUp.LIZJ(exc);
                }
                C36922EeM.LJFF((Throwable) message.obj);
                this.mView.cq((Exception) message.obj);
                return;
            }
            if (obj instanceof AvatarUri) {
                interfaceC26320AUq.yH((AvatarUri) obj);
                C09900aA.LJIIJJI("aweme_avartar_upload_error_rate", 0, null);
                InterfaceC26319AUp interfaceC26319AUp2 = this.tracker;
                if (interfaceC26319AUp2 != null) {
                    interfaceC26319AUp2.LIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC26321AUr
    public void onChooseAvatar(String str) {
        this.mFilePath = str;
        InterfaceC26320AUq interfaceC26320AUq = this.mView;
        if (interfaceC26320AUq != null) {
            interfaceC26320AUq.rs0(str);
        }
    }

    public void onClickAvatarImageByJsb(String str) {
        String str2;
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 == null) {
            return;
        }
        Activity activity = c86184Xs4.LIZJ;
        str.getClass();
        if (!str.equals("camera")) {
            if (!str.equals("album")) {
                String[] LJIIIZ = C86184Xs4.LJIIIZ(c86184Xs4.LIZLLL, 0, 5);
                C245319jz c245319jz = new C245319jz();
                C252669vq[] c252669vqArr = new C252669vq[2];
                C252669vq c252669vq = new C252669vq();
                String str3 = "";
                if (LJIIIZ.length < 1) {
                    str2 = "";
                } else {
                    str2 = LJIIIZ[0];
                }
                c252669vq.LIZIZ(str2);
                c252669vq.LJ = new ACListenerS39S0200000_4(c86184Xs4, activity, LiveTryModeCountDownThresholdSetting.DEFAULT);
                c252669vqArr[0] = c252669vq;
                C252669vq c252669vq2 = new C252669vq();
                if (LJIIIZ.length >= 2) {
                    str3 = LJIIIZ[1];
                }
                c252669vq2.LIZIZ(str3);
                c252669vq2.LJ = new ACListenerS28S0101000_10(3, c86184Xs4, 6);
                c252669vqArr[1] = c252669vq2;
                c245319jz.LIZIZ(c252669vqArr);
                c245319jz.LIZJ().show(((ActivityC45651qj) c86184Xs4.LIZJ).getSupportFragmentManager(), "Click BA Avatar Image");
                return;
            }
            if (c86184Xs4.LJI()) {
                return;
            }
            c86184Xs4.LJIILJJIL(0);
            return;
        }
        if (c86184Xs4.LJI()) {
            return;
        }
        if (activity != null && MSAdaptionService.LJIIL().LJI(activity)) {
            C16880lQ.LLZILL(Toast.makeText(activity, activity.getString(R.string.f1i), 0));
        } else {
            c86184Xs4.LJIIL(0);
        }
    }

    public void onClickUploadAvatarImage(int i) {
        FragmentManager supportFragmentManager;
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 == null) {
            return;
        }
        Fragment fragment = c86184Xs4.LJ;
        if (fragment != null) {
            supportFragmentManager = fragment.getFragmentManager();
        } else {
            Activity activity = c86184Xs4.LIZJ;
            if (!(activity instanceof ActivityC45651qj)) {
                return;
            } else {
                supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
            }
        }
        if (supportFragmentManager == null) {
            return;
        }
        String string = c86184Xs4.LIZLLL.getString(R.string.clz);
        String string2 = c86184Xs4.LIZLLL.getString(R.string.cm0);
        C245319jz c245319jz = new C245319jz();
        C252669vq c252669vq = new C252669vq();
        c252669vq.LIZIZ(string);
        c252669vq.LJ = new ACListenerS23S0101000_4(i, c86184Xs4, 13);
        C252669vq c252669vq2 = new C252669vq();
        c252669vq2.LIZIZ(string2);
        c252669vq2.LJ = new ACListenerS23S0101000_4(i, c86184Xs4, 14);
        c245319jz.LIZIZ(c252669vq, c252669vq2);
        c245319jz.LIZ.LJLIL = new IDCListenerS280S0100000_4(c86184Xs4, 7);
        c245319jz.LIZJ().show(supportFragmentManager, "chooseAvatar");
    }

    public void uploadAvatar(int i) {
        if (i != -1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C66619QCp("source", C72972SkS.LIZLLL(i, "")));
            uploadAvatar(this.mFilePath, arrayList);
            return;
        }
        uploadAvatar(this.mFilePath, null);
    }

    private boolean needRetry(Exception exc, int i) {
        String str;
        if (!(exc instanceof C38333F2r) && !(exc instanceof FileNotFoundException) && !(exc instanceof NullPointerException) && i <= 3) {
            if (exc.getMessage() != null) {
                str = exc.getMessage();
            } else {
                str = "";
            }
            if (!str.contains("Content-Length") && (!str.contains("expected") || !str.contains("received"))) {
                return true;
            }
        }
        return false;
    }

    public void initHeadUploadHelper(Activity activity, Fragment fragment) {
        initHeadUploadHelper(activity, fragment, -1, null);
    }

    public void uploadAvatar(String str, List<C66619QCp> list) {
        this.mFilePath = str;
        this.uploadParams = list;
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 != null) {
            InterfaceC26321AUr interfaceC26321AUr = c86184Xs4.LJIIIIZZ;
            if (interfaceC26321AUr != null) {
                interfaceC26321AUr.onUploadAvatar();
            }
            C38816FLg.LIZLLL(new ARunnableS3S1200000_4(list, str, c86184Xs4, 4), 0);
        }
    }

    @Override // X.InterfaceC248539pB
    public boolean onActivityResult(int i, int i2, Intent intent) {
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 == null) {
            return false;
        }
        return c86184Xs4.LJII(i, i2, intent);
    }

    @Override // X.InterfaceC248539pB
    public void onClickAvatarImage(int i, Activity activity, String str) {
        String str2;
        C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 == null) {
            return;
        }
        String[] LJIIIZ = C86184Xs4.LJIIIZ(c86184Xs4.LIZLLL, 0, 5);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("btn_name", str);
        }
        C252669vq[] c252669vqArr = new C252669vq[2];
        C252669vq c252669vq = new C252669vq();
        String str3 = "";
        if (LJIIIZ.length < 1) {
            str2 = "";
        } else {
            str2 = LJIIIZ[0];
        }
        c252669vq.LIZIZ(str2);
        c252669vq.LJ = new ViewOnClickListenerC26328AUy(c86184Xs4, hashMap, activity, i, 1);
        c252669vqArr[0] = c252669vq;
        C252669vq c252669vq2 = new C252669vq();
        if (LJIIIZ.length >= 2) {
            str3 = LJIIIZ[1];
        }
        c252669vq2.LIZIZ(str3);
        c252669vq2.LJ = new ACListenerS22S0201000_4(c86184Xs4, hashMap, i, 2);
        c252669vqArr[1] = c252669vq2;
        ArrayList LIZIZ = C65661Ppp.LIZIZ(c252669vqArr);
        if (C26356AWa.LIZ()) {
            C252669vq c252669vq3 = new C252669vq();
            c252669vq3.LIZLLL = true;
            c252669vq3.LIZ(R.string.eb);
            c252669vq3.LJ = new ACListenerS32S0101000_15(3, activity, 3);
            ListProtector.add(LIZIZ, 0, c252669vq3);
            STD.LJI("show");
        }
        C245319jz c245319jz = new C245319jz();
        c245319jz.LIZ.LJLIL = new IDCListenerS280S0100000_4(c86184Xs4, 8);
        c245319jz.LJFF(LIZIZ);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        Fragment fragment = c86184Xs4.LJ;
        if (fragment != null) {
            LIZJ.show(fragment.getFragmentManager(), "Click profile Avatar Image");
            return;
        }
        Activity activity2 = c86184Xs4.LIZJ;
        if (!(activity2 instanceof ActivityC45651qj)) {
            return;
        }
        LIZJ.show(((ActivityC45651qj) activity2).getSupportFragmentManager(), "Click profile Avatar Image");
    }

    @Override // X.InterfaceC248539pB
    public void initHeadUploadHelper(Activity activity, Fragment fragment, int i, HashMap<String, String> hashMap) {
        this.tracker = C78977Uz7.LJJIZ(Integer.valueOf(i), hashMap);
        this.mAccountHelper = new C86184Xs4(activity, fragment, new WeakHandler(this), this, i, this.tracker);
    }

    public void onClickAvatarImage(int i, final Activity activity, final View view, final User user, String str) {
        final String uri;
        String str2;
        String str3;
        final C86184Xs4 c86184Xs4 = this.mAccountHelper;
        if (c86184Xs4 == null) {
            return;
        }
        if (TextUtils.isEmpty(this.mFilePath)) {
            uri = null;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file://");
            LIZ.append(this.mFilePath);
            uri = UriProtector.parse(X1D.LIZIZ(LIZ)).toString();
        }
        String[] LJIIIZ = C86184Xs4.LJIIIZ(c86184Xs4.LIZLLL, 0, 1, 3, 4);
        final HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("btn_name", str);
        }
        ArrayList arrayList = new ArrayList();
        C252669vq c252669vq = new C252669vq();
        String str4 = "";
        if (LJIIIZ.length < 1) {
            str2 = "";
        } else {
            str2 = LJIIIZ[0];
        }
        c252669vq.LIZIZ(str2);
        c252669vq.LJ = new ACListenerS17S0301000_4(c86184Xs4, hashMap, activity, i, 2);
        arrayList.add(c252669vq);
        C252669vq c252669vq2 = new C252669vq();
        if (LJIIIZ.length < 2) {
            str3 = "";
        } else {
            str3 = LJIIIZ[1];
        }
        c252669vq2.LIZIZ(str3);
        c252669vq2.LJ = new ACListenerS22S0201000_4(c86184Xs4, hashMap, i, 1);
        arrayList.add(c252669vq2);
        C252669vq c252669vq3 = new C252669vq();
        if (LJIIIZ.length >= 3) {
            str4 = LJIIIZ[2];
        }
        c252669vq3.LIZIZ(str4);
        c252669vq3.LJ = new View.OnClickListener() { // from class: X.9iQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C86184Xs4 c86184Xs42 = C86184Xs4.this;
                HashMap hashMap2 = hashMap;
                Activity activity2 = activity;
                View view3 = view;
                String str5 = uri;
                User user2 = user;
                c86184Xs42.getClass();
                C244309iM.LJIIIIZZ("click_view_present_profile_photo", "click_edit_profile", hashMap2);
                if (c86184Xs42.LJI()) {
                    return;
                }
                C87030YDq.LIZIZ.startHeaderDetailActivity(activity2, view3, str5, user2);
            }
        };
        arrayList.add(c252669vq3);
        C245319jz c245319jz = new C245319jz();
        c245319jz.LIZ.LJLIL = new IDCListenerS280S0100000_4(c86184Xs4, 6);
        c245319jz.LIZIZ((C252669vq[]) arrayList.toArray(new C252669vq[0]));
        c245319jz.LIZJ().show(c86184Xs4.LJ.getFragmentManager(), "Click Avatar Image");
    }
}
