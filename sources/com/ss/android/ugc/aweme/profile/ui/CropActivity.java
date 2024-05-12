package com.ss.android.ugc.aweme.profile.ui;

import X.AX0;
import X.AXX;
import X.AXY;
import X.AXZ;
import X.ActivityC86117Xqz;
import X.C03880Dg;
import X.C06540Nm;
import X.C162476Zf;
import X.C16880lQ;
import X.C188727au;
import X.C1A7;
import X.C221018lt;
import X.C221108m2;
import X.C238089Wa;
import X.C244309iM;
import X.C244379iT;
import X.C26045AKb;
import X.C26048AKe;
import X.C26347AVr;
import X.C26382AXa;
import X.C32151Nz;
import X.C36922EeM;
import X.C39579Fg7;
import X.C39687Fhr;
import X.C39849FkT;
import X.C44384HbQ;
import X.C47261Igj;
import X.C51938KZy;
import X.C52238Keo;
import X.C5H3;
import X.C5S1;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65300Pk0;
import X.C65803Ps7;
import X.C71897SJp;
import X.C76800UCe;
import X.C76900UGa;
import X.C76903UGd;
import X.C780334l;
import X.C78250UnO;
import X.C78561UsP;
import X.C78613UtF;
import X.C79241V8b;
import X.C79262V8w;
import X.C79263V8x;
import X.C81098VsE;
import X.C86157Xrd;
import X.C86165Xrl;
import X.C86166Xrm;
import X.C86170Xrq;
import X.C86171Xrr;
import X.C86172Xrs;
import X.C86173Xrt;
import X.C86174Xru;
import X.C86175Xrv;
import X.C86176Xrw;
import X.C86177Xrx;
import X.C86178Xry;
import X.DialogC25756A8y;
import X.E2D;
import X.EnumC122664re;
import X.EnumC26153AOf;
import X.EnumC78978Uz8;
import X.EnumC86167Xrn;
import X.EnumC86168Xro;
import X.FMX;
import X.GLC;
import X.InterfaceC26189APp;
import X.InterfaceC26320AUq;
import X.InterfaceC88472Yns;
import X.KL2;
import X.ORZ;
import X.OSZ;
import X.Q7K;
import X.V1B;
import X.ViewOnClickListenerC86183Xs3;
import X.ViewOnTouchListenerC86181Xs1;
import X.W5I;
import X.X1D;
import X.XKX;
import Y.ACListenerS35S0100000_15;
import Y.IDTListenerS123S0100000_15;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS30S1000000_7;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public final class CropActivity extends ActivityC86117Xqz implements InterfaceC26320AUq, InterfaceC26189APp {
    public static boolean LLILLIZIL;
    public C76903UGd LJLIL;
    public C81098VsE LJLILLLLZI;
    public C76900UGa LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public ConstraintLayout LJLJL;
    public LinearLayout LJLJLJ;
    public C71897SJp LJLJLLL;
    public String LJLL;
    public AvatarPresenter LJLLI;
    public C244379iT LJLLILLLL;
    public UserPresenter LJLLJ;
    public UrlModel LJLLL;
    public FrameLayout LJZ;
    public boolean LJZI;
    public final String LJZL;
    public String LL;
    public boolean LLD;
    public Bitmap LLF;
    public Rect LLFF;
    public DialogC25756A8y LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public Uri LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public final C5H3 LLIIIL;
    public final C5H3 LLIIIZ;
    public final C5H3 LLIIJI;
    public final C5H3 LLIIJLIL;
    public final C5H3 LLIIL;
    public final C5H3 LLIILII;
    public final C5H3 LLIILZL;
    public final C5H3 LLIIZ;
    public final C5H3 LLIL;
    public final C62822Ol8 LLILII;
    public final AqS154S0100000_4 LLILIL;
    public final Map<Integer, View> LLILL = new LinkedHashMap();
    public String LJLLLL = "";
    public String LJLLLLLL = "";
    public String LJLZ = "";

    static {
        new C26347AVr();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC26320AUq
    public final void rs0(String str) {
    }

    public CropActivity() {
        String uri;
        UrlModel avatarThumb = AccountService.LJIJ().LJFF().getCurUser().getAvatarThumb();
        this.LJZL = (avatarThumb == null || (uri = avatarThumb.getUri()) == null) ? "" : uri;
        this.LL = "";
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LLFII = routeArgExtension.optionalArgNotNull(this, AXY.LJLIL, "extra_min_width", Integer.class);
        this.LLFZ = routeArgExtension.optionalArgNotNull(this, AXX.LJLIL, "extra_min_height", Integer.class);
        this.LLI = routeArgExtension.optionalArgNotNull(this, C26382AXa.LJLIL, "extra_source_type", Integer.class);
        this.LLII = routeArgExtension.optionalArgNotNull(this, C86175Xrv.LJLIL, "is_oval", Boolean.class);
        this.LLIIII = routeArgExtension.optionalArgNotNull(this, AX0.LJLIL, "rect_ratio", Float.class);
        this.LLIIIILZ = routeArgExtension.optionalArgNotNull(this, AXZ.LJLIL, "rect_margin", Integer.class);
        this.LLIIIJ = routeArgExtension.optionalArg(this, C86176Xrw.LJLIL, "original_url", String.class);
        this.LLIIIL = routeArgExtension.optionalArgNotNull(this, C86174Xru.LJLIL, "extra_need_update_avatar", Boolean.class);
        this.LLIIIZ = routeArgExtension.optionalArgNotNull(this, C86178Xry.LJLIL, "extra_upload_avatar", Boolean.class);
        this.LLIIJI = routeArgExtension.optionalArgNotNull(this, C79263V8x.LJLIL, "enter_method", String.class);
        this.LLIIJLIL = routeArgExtension.optionalArgNotNull(this, C79262V8w.LJLIL, "btn_name", String.class);
        this.LLIIL = routeArgExtension.optionalArgNotNull(this, C86173Xrt.LJLIL, "is_from_camera", Boolean.class);
        this.LLIILII = routeArgExtension.optionalArgNotNull(this, C79241V8b.LJLIL, "avatar_upload_scene", Integer.class);
        this.LLIILZL = routeArgExtension.optionalArg(this, C86171Xrr.LJLIL, "avatar_upload_track_param", Serializable.class);
        this.LLIIZ = routeArgExtension.optionalArgNotNull(this, C86172Xrs.LJLIL, "is_from_aigc_flow", Boolean.class);
        this.LLIL = routeArgExtension.optionalArg(this, C86177Xrx.LJLIL, "path_mode", String.class);
        this.LLILII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 689));
        this.LLILIL = new AqS154S0100000_4(this, 690);
    }

    public final void LLFZ() {
        DialogC25756A8y dialogC25756A8y = this.LLFFF;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            try {
                DialogC25756A8y dialogC25756A8y2 = this.LLFFF;
                if (dialogC25756A8y2 != null) {
                    dialogC25756A8y2.dismiss();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final int LLIIIZ() {
        return ((Number) this.LLIILII.getValue()).intValue();
    }

    public final int LLIIJLIL() {
        return ((Number) this.LLI.getValue()).intValue();
    }

    public final String LLIILII() {
        return (String) this.LLIL.getValue();
    }

    public final boolean LLILIL() {
        return ((Boolean) this.LLIIZ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OSZ<String, Integer> LLIZLLLIL() {
        boolean z;
        String str;
        File file = new File(C39579Fg7.LJIIJ("profileHeader"), "profileHeaderCrop.png");
        int LIZIZ = Q7K.LIZIZ("clear_storage_available_space_minimum_limitation", 1048576);
        long LJ = C39687Fhr.LJ(C39849FkT.LIZ());
        if (LJ < LIZIZ) {
            C244309iM.LIZLLL(C39849FkT.LIZ(), "saveToFile storage low", null, null, LJ, null, 44);
            z = true;
        } else {
            z = false;
        }
        C81098VsE c81098VsE = this.LJLILLLLZI;
        Long l = 0;
        if (c81098VsE != null) {
            Bitmap bitmap = this.LLF;
            if (bitmap != null) {
                OSZ<Bitmap, Integer> LLIIJI = LLIIJI(c81098VsE, bitmap);
                if (z && LLIIJI.getFirst() == null) {
                    C244309iM.LIZLLL(C39849FkT.LIZ(), "saveToFile getCropBitmap", null, null, C39687Fhr.LJ(C39849FkT.LIZ()), Boolean.FALSE, 12);
                }
                if (LLIIJI.getFirst() == null) {
                    C244309iM.LIZLLL(C39849FkT.LIZ(), "first saveToFile getCropBitmap", null, null, C39687Fhr.LJ(C39849FkT.LIZ()), null, 44);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("getCropBitmap freeSpace: ");
                    LIZ.append(file.getFreeSpace());
                    LIZ.append('}');
                    l = 0;
                    LLILLJJLI(this, null, X1D.LIZIZ(LIZ), null, null, 13);
                }
                Bitmap first = LLIIJI.getFirst();
                if (first == null) {
                    return new OSZ<>(l, LLIIJI.getSecond());
                }
                String parent = file.getParent();
                o.LJIIIIZZ(parent, "file.parent");
                String name = file.getName();
                o.LJIIIIZZ(name, "file.name");
                boolean LLILZ = LLILZ(first, parent, name);
                if (z) {
                    C244309iM.LIZLLL(C39849FkT.LIZ(), "saveToFile saveBitmapToSD failed", l, l, C39687Fhr.LJ(C39849FkT.LIZ()), Boolean.valueOf(LLILZ), 12);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("saveToFile:");
                if (LLILZ) {
                    str = file.getAbsolutePath();
                } else {
                    str = "null";
                }
                LIZ2.append(str);
                X1D.LIZIZ(LIZ2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("saveBitmapToSD status: ");
                LIZ3.append(LLILZ);
                LIZ3.append(' ');
                LIZ3.append(file.length());
                C36922EeM.LIZLLL(4, "CropActivity", X1D.LIZIZ(LIZ3));
                String str2 = l;
                if (LLILZ) {
                    str2 = file.getAbsolutePath();
                }
                return new OSZ<>(str2, Integer.valueOf(R.string.g5e));
            }
            o.LJIJI("originalBitmap");
            throw null;
        }
        o.LJIJI("mCoverImage");
        throw null;
    }

    public final void LLJILJILJ() {
        DialogC25756A8y dialogC25756A8y = this.LLFFF;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            DialogC25756A8y dialogC25756A8y2 = this.LLFFF;
            if (dialogC25756A8y2 != null) {
                dialogC25756A8y2.dismiss();
            }
            C26048AKe c26048AKe = new C26048AKe(this);
            c26048AKe.LIZJ(R.raw.icon_tick_circle);
            c26048AKe.LJ(R.attr.dj);
            c26048AKe.LJFF(R.string.tnc);
            c26048AKe.LIZIZ(500L);
            c26048AKe.LIZ(this.LLILIL);
            c26048AKe.LJII();
        }
    }

    public final boolean LLILLIZIL() {
        if ((C52238Keo.LIZ() && LLIIJLIL() != 1101) || LLIIIZ() == EnumC78978Uz8.SIGNUP.getValue()) {
            return true;
        }
        return false;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        E2D.LIZ(LLILIL(), LLIILII(), EnumC86167Xrn.BACK);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        AVExternalServiceImpl.LIZ().avatarService().clearEditPageData();
        DialogC25756A8y dialogC25756A8y = this.LLFFF;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.dismiss();
        }
        this.LLFFF = null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public static String LLIIIJ(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("className ");
        LIZ.append(exc.getClass());
        LIZ.append(" cause ");
        LIZ.append(exc.getCause());
        LIZ.append(" message ");
        LIZ.append(exc.getMessage());
        LIZ.append(" stackTrace ");
        LIZ.append(Log.getStackTraceString(exc));
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
        C244379iT c244379iT;
        String str;
        boolean z2;
        if (z) {
            if (!C78561UsP.LIZ(this)) {
                C71897SJp c71897SJp = this.LJLJLLL;
                if (c71897SJp != null) {
                    if (c71897SJp.isChecked() && (c244379iT = this.LJLLILLLL) != null && c244379iT.LIZJ != null) {
                        if (c244379iT == null || (str = c244379iT.LIZJ) == null) {
                            str = "";
                        }
                        Bundle LLIIIILZ = LLIIIILZ(new AqS30S1000000_7(str, 3));
                        IAvatarPublishStoryService avatarService = AVExternalServiceImpl.LIZ().avatarService();
                        if (C51938KZy.LIZ() && !LLILIL()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        avatarService.publishDirectly(this, LLIIIILZ, z2, new C86157Xrd(this));
                        return;
                    }
                } else {
                    o.LJIJI("postToStoryCheckBox");
                    throw null;
                }
            }
            LLJILJILJ();
        }
    }

    public final void LLFII(String str) {
        DialogC25756A8y dialogC25756A8y;
        this.LLIFFJFJJ = Uri.fromFile(new File(str));
        if (((Boolean) this.LLIIIZ.getValue()).booleanValue()) {
            DialogC25756A8y dialogC25756A8y2 = this.LLFFF;
            if (dialogC25756A8y2 == null) {
                DialogC25756A8y dialogC25756A8y3 = new DialogC25756A8y(this);
                dialogC25756A8y3.LIZIZ(R.string.toe);
                this.LLFFF = dialogC25756A8y3;
                V1B.LJLJJL(dialogC25756A8y3);
            } else if (!dialogC25756A8y2.isShowing() && (dialogC25756A8y = this.LLFFF) != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "5470986617293845389")).LIZ) {
                dialogC25756A8y.show();
            }
            this.LJLL = str;
            AvatarPresenter avatarPresenter = this.LJLLI;
            if (avatarPresenter != null) {
                avatarPresenter.onChooseAvatar(str);
            }
            AvatarPresenter avatarPresenter2 = this.LJLLI;
            if (avatarPresenter2 != null) {
                avatarPresenter2.uploadAvatar(LLIIJLIL());
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(new File(str)));
        setResult(-1, intent);
        finish();
    }

    public final Bundle LLIIIILZ(InterfaceC88472Yns<? super Bundle, C76800UCe> interfaceC88472Yns) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("creation_id", UUID.randomUUID().toString());
        if (LLILIL()) {
            str = "ai_avatar";
        } else {
            str = "profile_photo";
        }
        bundle.putString("shoot_way", str);
        bundle.putString("origin_avatar_uri", this.LJZL);
        bundle.putString("origin_avatar_url", this.LJLLLL);
        bundle.putBoolean("is_aivatar", LLILIL());
        bundle.putString("path_mode", LLIILII());
        bundle.putString("origin_no_crop_avatar_path", this.LL);
        bundle.putString("cover_avatar_path", this.LJLZ);
        interfaceC88472Yns.invoke(bundle);
        return bundle;
    }

    public final void LLIL(Intent intent) {
        if (intent != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "new_uri");
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "new_url");
            if (LLJJIJIIJIL == null || LLJJIJIIJIL2 == null) {
                return;
            }
            Intent intent2 = new Intent();
            intent2.setData(Uri.fromFile(new File(this.LL)));
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(LLJJIJIIJIL);
            urlModel.setUrlList(C47261Igj.LJJIJ(LLJJIJIIJIL2));
            intent2.putExtra("path", urlModel);
            intent2.putExtra("dismiss_dialog", true);
            setResult(-1, intent2);
            finish();
        }
    }

    public final void LLILLL(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Bundle LLIIIILZ = LLIIIILZ(new GLC(str, this));
        this.LJZI = true;
        AVExternalServiceImpl.LIZ().avatarService().openEditPage(this, LLIIIILZ, str, this.LL, new AqS181S0100000_15(this, 114));
    }

    public final void LLJILLL(GradientDrawable gradientDrawable) {
        EnumC122664re mode;
        EnumC86168Xro enumC86168Xro;
        if (a.LJFF().LJJII(this)) {
            mode = EnumC122664re.FIRST_PUBLISH;
        } else {
            mode = EnumC122664re.NORMAL;
        }
        String str = this.LJLLLLLL;
        FrameLayout frameLayout = this.LJZ;
        o.LJII(frameLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        if (LLILIL()) {
            enumC86168Xro = EnumC86168Xro.ROUND_CORNER_RECT;
        } else {
            enumC86168Xro = EnumC86168Xro.DEFAULT;
        }
        C86165Xrl c86165Xrl = new C86165Xrl(str, this, frameLayout, gradientDrawable, enumC86168Xro, new C86166Xrm(this));
        o.LJIIIZ(mode, "mode");
        if (mode == EnumC122664re.NORMAL) {
            c86165Xrl.LJIILLIIL.setVisibility(8);
            c86165Xrl.LJIIZILJ.setVisibility(8);
        } else {
            c86165Xrl.LJIIJ.setVisibility(8);
        }
        if (C51938KZy.LIZ()) {
            c86165Xrl.LJIILIIL.setText(C44384HbQ.LJJZ(R.string.p5p));
        }
        c86165Xrl.LJIIL.setChecked(true);
        Uri fromFile = Uri.fromFile(new File(c86165Xrl.LIZ));
        c86165Xrl.LIZJ.addView(c86165Xrl.LJFF);
        W5I.LIZ().LIZIZ(fromFile);
        c86165Xrl.LJIILJJIL.setImageURI(fromFile);
        c86165Xrl.LJFF.setOnTouchListener(new IDTListenerS123S0100000_15(c86165Xrl, 2));
        C244309iM.LIZIZ("default_publish_window_show", "checked");
        C16880lQ.LJJJJJL(c86165Xrl.LJII, new ACListenerS35S0100000_15(c86165Xrl, 268));
        C16880lQ.LJJJI(c86165Xrl.LJIIL, new ACListenerS35S0100000_15(c86165Xrl, 269));
        C16880lQ.LJIILJJIL(c86165Xrl.LJIIJ, new ACListenerS35S0100000_15(c86165Xrl, 270));
        C62846OlW c62846OlW = c86165Xrl.LJII;
        GradientDrawable gradientDrawable2 = c86165Xrl.LIZLLL;
        gradientDrawable2.setCornerRadius(C32151Nz.LJIIZILJ(20));
        c62846OlW.setBackground(gradientDrawable2);
        c86165Xrl.LJIIIZ.setOnTouchListener(ViewOnTouchListenerC86181Xs1.LJLIL);
        C16880lQ.LJIL(c86165Xrl.LJIIIZ, ViewOnClickListenerC86183Xs3.LJLIL);
        C16880lQ.LJJJ(c86165Xrl.LJIIIIZZ, new ACListenerS35S0100000_15(c86165Xrl, 271));
        C16880lQ.LJJJJI(c86165Xrl.LJIIJJI, new ACListenerS35S0100000_15(c86165Xrl, 272));
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(c86165Xrl, 267), c86165Xrl.LJFF);
    }

    @Override // X.InterfaceC26320AUq
    public final void cq(Exception exc) {
        C1A7.LJIJJ(this, exc);
        LLFZ();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:118|119|(1:121)(1:188)|122|123|(2:125|(3:127|(1:184)|129)(1:185))(1:186)|(2:130|131)|(3:(1:162)(1:175)|163|(4:168|169|170|137)(1:167))(1:133)|134|135|136|137) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ca, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03b7, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.CropActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && intent.getBooleanExtra("change_avatar_normal_post_in_publish_page", false)) {
            LLIL(intent);
        }
    }

    @Override // X.InterfaceC26320AUq
    public final void yH(AvatarUri avatarUri) {
        List<String> list;
        String str;
        String str2;
        EnumC26153AOf enumC26153AOf;
        String str3 = null;
        Map<String, String> map = null;
        if (((Boolean) this.LLIIIL.getValue()).booleanValue()) {
            C244379iT c244379iT = this.LJLLILLLL;
            if (c244379iT != null) {
                if (avatarUri != null) {
                    str2 = avatarUri.uri;
                } else {
                    str2 = null;
                }
                c244379iT.LIZJ = str2;
                if (LLILIL()) {
                    enumC26153AOf = EnumC26153AOf.AIGC_PROFILE;
                } else {
                    enumC26153AOf = EnumC26153AOf.USER_PROFILE;
                }
                c244379iT.LJFF = enumC26153AOf;
            }
            UserPresenter userPresenter = this.LJLLJ;
            if (userPresenter != null) {
                C244379iT c244379iT2 = this.LJLLILLLL;
                if (c244379iT2 != null) {
                    map = c244379iT2.LIZ();
                }
                userPresenter.updateUserInfo(map);
            }
            if (LLILIL()) {
                C71897SJp c71897SJp = this.LJLJLLL;
                if (c71897SJp != null && c71897SJp.isChecked()) {
                    return;
                }
                ProfileAIGCServiceImpl.LJFF().LIZ();
                return;
            }
            return;
        }
        LLFZ();
        Intent intent = new Intent();
        intent.setData(this.LLIFFJFJJ);
        if (avatarUri != null) {
            str3 = avatarUri.uri;
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("uri", str3);
        if (avatarUri != null && (list = avatarUri.urlList) != null && (str = (String) ORZ.LJLLLL(list)) != null) {
            str4 = str;
        }
        intent.putExtra("url", str4);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<android.graphics.Bitmap, java.lang.Integer> LLIIJI(X.C81098VsE r19, android.graphics.Bitmap r20) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.CropActivity.LLIIJI(X.VsE, android.graphics.Bitmap):X.OSZ");
    }

    public final void LLJJIJIIJIL(boolean z, boolean z2) {
        if (z2) {
            C71897SJp c71897SJp = this.LJLJLLL;
            if (c71897SJp != null) {
                c71897SJp.setChecked(z);
            } else {
                o.LJIJI("postToStoryCheckBox");
                throw null;
            }
        }
        C71897SJp c71897SJp2 = this.LJLJLLL;
        if (c71897SJp2 != null) {
            if (c71897SJp2.isChecked()) {
                TuxTextView tuxTextView = this.LJLJJL;
                if (tuxTextView != null) {
                    tuxTextView.setText(getString(R.string.p7p));
                    return;
                } else {
                    o.LJIJI("mConfirm");
                    throw null;
                }
            }
            TuxTextView tuxTextView2 = this.LJLJJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(tuxTextView2.getContext().getString(R.string.fkl));
                return;
            } else {
                o.LJIJI("mConfirm");
                throw null;
            }
        }
        o.LJIJI("postToStoryCheckBox");
        throw null;
    }

    @Override // X.InterfaceC26189APp
    public final void Pp0(User user, int i) {
        UrlModel urlModel;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        this.LJLLL = urlModel;
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception exc, int i) {
        C1A7.LJIJJ(this, exc);
        LLFZ();
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.dto);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String str, boolean z) {
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        C5S1 c5s1 = new C5S1(this);
        c5s1.LIZLLL(str);
        c5s1.LJ();
    }

    public final void LLII(Bitmap bitmap, GradientDrawable gradientDrawable, EnumC86168Xro style) {
        int LJIIJJI;
        Bitmap createBitmap;
        Bitmap output;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        o.LJIIIZ(style, "style");
        int[] iArr = C86170Xrq.LIZ;
        if (iArr[style.ordinal()] == 1) {
            LJIIJJI = KL2.LJIIJJI(this) - ((int) KL2.LIZJ(this, 96.0f));
        } else {
            LJIIJJI = (KL2.LJIIJJI(this) * 3) / 5;
        }
        float f = LJIIJJI;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight());
        } else {
            createBitmap = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f / createBitmap.getWidth(), f / createBitmap.getHeight());
        Bitmap it = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
        int i2 = iArr[style.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                o.LJIIIIZZ(it, "it");
                float width = (it.getWidth() / 2) - KL2.LIZJ(this, 1.0f);
                output = Bitmap.createBitmap(it.getWidth(), it.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(output);
                canvas.drawColor(0);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, it.getWidth(), it.getHeight());
                paint.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                float f2 = 2;
                canvas.drawCircle(it.getWidth() / f2, it.getHeight() / f2, it.getWidth() / f2, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(it, rect, rect, paint);
                canvas.drawColor(0);
                Paint paint2 = new Paint();
                paint2.setColor(-1);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                paint2.setStrokeWidth(KL2.LIZJ(this, 2.0f));
                paint2.setAntiAlias(true);
                canvas.drawCircle(it.getWidth() / f2, it.getHeight() / f2, width, paint2);
            } else {
                throw new C162476Zf();
            }
        } else {
            o.LJIIIIZZ(it, "it");
            float LIZJ = KL2.LIZJ(this, 32.0f);
            output = Bitmap.createBitmap(it.getWidth(), it.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(output);
            Paint paint3 = new Paint();
            Rect rect2 = new Rect(0, 0, it.getWidth(), it.getHeight());
            paint3.setAntiAlias(true);
            canvas2.drawARGB(0, 0, 0, 0);
            canvas2.drawRoundRect(0.0f, 0.0f, it.getWidth(), it.getHeight(), LIZJ, LIZJ, paint3);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(it, rect2, rect2, paint3);
            canvas2.drawColor(0);
            o.LJIIIIZZ(output, "output");
        }
        if (output == null) {
            output = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            o.LJIIIIZZ(output, "createBitmap(\n          …nfig.ARGB_8888,\n        )");
        }
        int LJIIJJI2 = KL2.LJIIJJI(this);
        int LJIIIZ = KL2.LJIIIZ(this);
        Bitmap createBitmap2 = Bitmap.createBitmap(LJIIJJI2, LJIIIZ, Bitmap.Config.ARGB_8888);
        Canvas canvas3 = new Canvas(createBitmap2);
        float f3 = 2;
        canvas3.drawBitmap(output, (LJIIJJI2 / f3) - (output.getWidth() / f3), (LJIIIZ / f3) - (output.getHeight() / f3), (Paint) null);
        canvas3.drawColor(0);
        createBitmap2.setHasAlpha(true);
        int LJIIJJI3 = KL2.LJIIJJI(this);
        int LJIIIZ2 = KL2.LJIIIZ(this);
        Bitmap output2 = Bitmap.createBitmap(LJIIJJI3, LJIIIZ2, Bitmap.Config.ARGB_8888);
        Canvas canvas4 = new Canvas(output2);
        gradientDrawable.setBounds(0, 0, canvas4.getWidth(), canvas4.getHeight());
        gradientDrawable.draw(canvas4);
        canvas4.drawBitmap(output, (LJIIJJI3 / f3) - (output.getWidth() / f3), (LJIIIZ2 / f3) - (output.getHeight() / f3), (Paint) null);
        o.LJIIIIZZ(output2, "output");
        File file = new File(C39579Fg7.LJIIJ("profileHeader"), "profileRoundCrop.png");
        String parent = file.getParent();
        o.LJIIIIZZ(parent, "file.parent");
        String name = file.getName();
        o.LJIIIIZZ(name, "file.name");
        boolean LLILZ = LLILZ(createBitmap2, parent, name);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("saveToFile:");
        String str6 = "null";
        if (!LLILZ) {
            str = "null";
        } else {
            str = file.getAbsolutePath();
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("saveBitmapToSD status: ");
        LIZ2.append(LLILZ);
        LIZ2.append(' ');
        LIZ2.append(file.length());
        C36922EeM.LIZLLL(4, "CropActivity", X1D.LIZIZ(LIZ2));
        if (LLILZ) {
            str2 = file.getAbsolutePath();
        } else {
            str2 = null;
        }
        String str7 = (String) new OSZ(str2, Integer.valueOf(R.string.g5e)).getFirst();
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        this.LJLLLL = str7;
        File file2 = new File(C39579Fg7.LJIIJ("profileHeader"), "profileTransCrop.png");
        String parent2 = file2.getParent();
        o.LJIIIIZZ(parent2, "file.parent");
        String name2 = file2.getName();
        o.LJIIIIZZ(name2, "file.name");
        boolean LLILZ2 = LLILZ(output, parent2, name2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("saveToFile:");
        if (!LLILZ2) {
            str3 = "null";
        } else {
            str3 = file2.getAbsolutePath();
        }
        LIZ3.append(str3);
        X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("saveBitmapToSD status: ");
        LIZ4.append(LLILZ2);
        LIZ4.append(' ');
        LIZ4.append(file2.length());
        C36922EeM.LIZLLL(4, "CropActivity", X1D.LIZIZ(LIZ4));
        if (LLILZ2) {
            str4 = file2.getAbsolutePath();
        } else {
            str4 = null;
        }
        String str9 = (String) new OSZ(str4, Integer.valueOf(R.string.g5e)).getFirst();
        if (str9 == null) {
            str9 = "";
        }
        this.LJLLLLLL = str9;
        File file3 = new File(C39579Fg7.LJIIJ("profileHeader"), "profileCoverWithGradient.png");
        String parent3 = file3.getParent();
        o.LJIIIIZZ(parent3, "file.parent");
        String name3 = file3.getName();
        o.LJIIIIZZ(name3, "file.name");
        boolean LLILZ3 = LLILZ(output2, parent3, name3);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("saveToFile:");
        if (LLILZ3) {
            str6 = file3.getAbsolutePath();
        }
        LIZ5.append(str6);
        X1D.LIZIZ(LIZ5);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("saveBitmapToSD status: ");
        LIZ6.append(LLILZ3);
        LIZ6.append(' ');
        LIZ6.append(file3.length());
        C36922EeM.LIZLLL(4, "CropActivity", X1D.LIZIZ(LIZ6));
        if (LLILZ3) {
            str5 = file3.getAbsolutePath();
            i = R.string.g5e;
        } else {
            i = R.string.g5e;
            str5 = null;
        }
        String str10 = (String) new OSZ(str5, Integer.valueOf(i)).getFirst();
        if (str10 != null) {
            str8 = str10;
        }
        this.LJLZ = str8;
        output.recycle();
        createBitmap2.recycle();
        output2.recycle();
    }

    public final boolean LLILZ(Bitmap bitmap, String str, String str2) {
        if (!o.LJ("mounted", C16880lQ.LLLLLLLZIL())) {
            LLILLJJLI(this, bitmap, null, "not mounted", null, 10);
            C36922EeM.LIZLLL(6, "saveBitmapToSD", "not mounted");
            return false;
        }
        File file = new File(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("saveBitmapToSD current available size: ");
        LIZ.append(C39687Fhr.LJ(C39849FkT.LIZ()));
        C221018lt.LJFF("CropActivity", X1D.LIZIZ(LIZ));
        if (file.getFreeSpace() == 0) {
            C221018lt.LJFF("test_clean", "saveBitmapToSD directory free space");
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("saveBitmapToSD directory no free： ");
            LIZ2.append(C39687Fhr.LJ(C39849FkT.LIZ()));
            C221018lt.LJFF("test_clean", X1D.LIZIZ(LIZ2));
        }
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("mkdirs canRead: ");
            LIZ3.append(file.canRead());
            LIZ3.append(" canWrite: ");
            LIZ3.append(file.canWrite());
            LIZ3.append(" freeSpace: ");
            LIZ3.append(file.getFreeSpace());
            LLILLJJLI(this, bitmap, X1D.LIZIZ(LIZ3), null, null, 12);
            C36922EeM.LIZLLL(6, "saveBitmapToSD", "mkdirs fails");
            return false;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(file.getPath());
        LIZ4.append('/');
        LIZ4.append(str2);
        File file2 = new File(X1D.LIZIZ(LIZ4));
        if (file2.getFreeSpace() == 0) {
            C221018lt.LJFF("test_clean", "saveBitmapToSD file free space");
        } else {
            C221018lt.LJFF("test_clean", "saveBitmapToSD file no free");
        }
        try {
            if (!file2.exists() && !file2.createNewFile()) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("createNewFile canRead: ");
                LIZ5.append(file2.canRead());
                LIZ5.append(" canWrite: ");
                LIZ5.append(file2.canWrite());
                LIZ5.append(" freeSpace: ");
                LIZ5.append(file2.getFreeSpace());
                LLILLJJLI(this, bitmap, X1D.LIZIZ(LIZ5), null, null, 12);
                C36922EeM.LIZLLL(6, "saveBitmapToSD", "createNewFile fails");
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                try {
                    boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    if (!compress) {
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("compressResult freeSpace: ");
                        LIZ6.append(file2.getFreeSpace());
                        LLILLJJLI(this, bitmap, X1D.LIZIZ(LIZ6), null, null, 12);
                        C36922EeM.LIZLLL(6, "saveBitmapToSD", "compress fails");
                    }
                    fileOutputStream.flush();
                    return compress;
                } catch (Exception e) {
                    C36922EeM.LIZ(e);
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("e current availableStorageSize: ");
                    LIZ7.append(C39687Fhr.LJ(C39849FkT.LIZ()));
                    C221018lt.LJFF("CropActivity", X1D.LIZIZ(LIZ7));
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append("compressResult Exception freeSpace: ");
                    LIZ8.append(file2.getFreeSpace());
                    String LIZIZ = X1D.LIZIZ(LIZ8);
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("compressResult Exception ");
                    LIZ9.append(LLIIIJ(e));
                    LLILLJJLI(this, bitmap, LIZIZ, null, X1D.LIZIZ(LIZ9), 4);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e2) {
                        C36922EeM.LIZ(e2);
                        StringBuilder LIZ10 = X1D.LIZ();
                        LIZ10.append("fileOutputStream close Exception freeSpace: ");
                        LIZ10.append(file2.getFreeSpace());
                        String LIZIZ2 = X1D.LIZIZ(LIZ10);
                        StringBuilder LIZ11 = X1D.LIZ();
                        LIZ11.append("fileOutputStream close Exception ");
                        LIZ11.append(LLIIIJ(e2));
                        LLILLJJLI(this, bitmap, LIZIZ2, null, X1D.LIZIZ(LIZ11), 4);
                    }
                    return false;
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Exception e3) {
                    C36922EeM.LIZ(e3);
                    StringBuilder LIZ12 = X1D.LIZ();
                    LIZ12.append("fileOutputStream close Exception freeSpace: ");
                    LIZ12.append(file2.getFreeSpace());
                    StringBuilder LIZ13 = X1D.LIZ();
                    LIZ13.append("fileOutputStream close Exception ");
                    LIZ13.append(LLIIIJ(e3));
                    LLILLJJLI(this, bitmap, X1D.LIZIZ(LIZ12), null, X1D.LIZIZ(LIZ13), 4);
                }
            }
        } catch (Exception e4) {
            C36922EeM.LIZ(e4);
            StringBuilder LIZ14 = X1D.LIZ();
            LIZ14.append("createNewFile Exception canRead: ");
            LIZ14.append(file2.canRead());
            LIZ14.append(" canWrite: ");
            LIZ14.append(file2.canWrite());
            LIZ14.append(" freeSpace: ");
            LIZ14.append(file2.getFreeSpace());
            String LIZIZ3 = X1D.LIZIZ(LIZ14);
            StringBuilder LIZ15 = X1D.LIZ();
            LIZ15.append("createNewFile Exception ");
            LIZ15.append(LLIIIJ(e4));
            LLILLJJLI(this, bitmap, LIZIZ3, null, X1D.LIZIZ(LIZ15), 4);
            return false;
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 9) {
            LLIL(intent);
            if (LLILIL()) {
                C78250UnO c78250UnO = C78250UnO.LIZ;
                Application context = C39849FkT.LIZ();
                c78250UnO.getClass();
                o.LJIIIZ(context, "context");
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C238089Wa(context, null), 2);
                SmartRoute buildRoute = SmartRouter.buildRoute(this, "//main");
                buildRoute.addFlags(536870912);
                buildRoute.addFlags(67108864);
                buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_TAB");
                buildRoute.open();
            }
        }
    }

    public static void LLILLJJLI(CropActivity cropActivity, Bitmap bitmap, String fileMsg, String mediaMountedMsg, String exceptionMsg, int i) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        String bitmapMsg = "";
        if ((i & 2) != 0) {
            fileMsg = "";
        }
        if ((i & 4) != 0) {
            mediaMountedMsg = "";
        }
        if ((i & 8) != 0) {
            exceptionMsg = "";
        }
        cropActivity.getClass();
        if (bitmap != null) {
            bitmapMsg = "width: " + bitmap.getWidth() + " height: " + bitmap.getHeight() + " config: " + bitmap.getConfig() + " byteCount: " + bitmap.getByteCount() + " allocationByteCount: " + bitmap.getAllocationByteCount() + " density: " + bitmap.getDensity() + " generationId: " + bitmap.getGenerationId() + " isMutable: " + bitmap.isMutable() + " isPremultiplied: " + bitmap.isPremultiplied() + " isRecycled: " + bitmap.isRecycled() + " rowBytes: " + bitmap.getRowBytes() + " ninePatchChunk: " + bitmap.getNinePatchChunk();
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("bitmapMsg: ", bitmapMsg, " fileMsg: ", fileMsg, " mediaMountedMsg: ");
        LIZLLL.append(mediaMountedMsg);
        LIZLLL.append(" exceptionMsg: ");
        LIZLLL.append(exceptionMsg);
        C221018lt.LIZIZ("saveBitmapToSD", X1D.LIZIZ(LIZLLL));
        o.LJIIIZ(bitmapMsg, "bitmapMsg");
        o.LJIIIZ(fileMsg, "fileMsg");
        o.LJIIIZ(mediaMountedMsg, "mediaMountedMsg");
        o.LJIIIZ(exceptionMsg, "exceptionMsg");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("bitmap_msg", bitmapMsg);
        c188727au.LJIIIZ("file_msg", fileMsg);
        c188727au.LJIIIZ("media_mounted_msg", mediaMountedMsg);
        c188727au.LJIIIZ("exception", exceptionMsg);
        c188727au.LJFF(Boolean.TRUE, "hasClean");
        FMX.LJIIL("crop_fail", c188727au.LIZ);
    }
}
