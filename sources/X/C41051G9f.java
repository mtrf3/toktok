package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionBiz;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.editpost.SceneWrapperFragment;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.zhiliaoapp.musically.R;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import o53.IDdS474S0100000_7;

/* renamed from: X.G9f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41051G9f extends WM7 implements G6K, GAK {
    public View LJLIL;
    public GQ5 LJLILLLLZI;
    public C41485GPx LJLJI;
    public LinearLayout LJLJJI;
    public RelativeLayout LJLJJL;
    public View LJLJJLL;
    public C42796Gqu LJLJL;
    public C164096cH LJLJLJ;
    public TuxTextView LJLJLLL;
    public View LJLL;
    public TuxTextView LJLLI;
    public GSR LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxTextView LJLLL;
    public ViewGroup LJLLLL;
    public IAZ LJLLLLLL;
    public AnonymousClass377 LJLZ;
    public VideoPublishEditModel LJZ;
    public VideoCoverBitmapHolder LJZI;
    public boolean LJZL;
    public View LLD;
    public int LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public HashMap<Integer, Boolean> LLI;
    public List<C15070iV<Class<?>, IAVPublishExtension<?>>> LLII;
    public View LLIIII;
    public GS5 LLIIIILZ;
    public C188627ak LLIIIJ;
    public View LLIIIL;
    public SceneWrapperFragment LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public final C62822Ol8 LLIIL;
    public A90 LLIILII;
    public float LLIILZL;
    public GBX LL = GBX.NO_CLICK;
    public final boolean LLFZ = C58B.LIZ();
    public final C62822Ol8 LLIFFJFJJ = C221108m2.LIZIZ(GA1.LJLIL);

    public static void LLJJI(A90 a90) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingProgressHUD", "show", a90, new Object[0], "void", new C65300Pk0(false, "()V", "-502432091263910621")).LIZ) {
            return;
        }
        a90.show();
    }

    @Override // X.GAK
    public final void LLIL() {
    }

    @Override // X.G6K
    public final LifecycleOwner getLifeCycleOwner() {
        return this;
    }

    @Override // X.G6K
    public final ActivityC45651qj LLII() {
        Activity activity = this.mActivity;
        if (activity instanceof ActivityC45651qj) {
            return (ActivityC45651qj) activity;
        }
        return null;
    }

    public final void LLJILJILJ() {
        ArrayList<InteractionTagUserInfo> arrayList;
        if (this.LLIIIJ != null) {
            VideoPublishEditModel videoPublishEditModel = this.LJZ;
            if (videoPublishEditModel == null) {
                return;
            }
            if (videoPublishEditModel.tagUserList != null) {
                ArrayList arrayList2 = new ArrayList();
                VideoPublishEditModel videoPublishEditModel2 = this.LJZ;
                if (videoPublishEditModel2 != null && (arrayList = videoPublishEditModel2.tagUserList) != null) {
                    Iterator<InteractionTagUserInfo> it = arrayList.iterator();
                    while (it.hasNext()) {
                        InteractionTagUserInfo userInfo = it.next();
                        o.LJIIIIZZ(userInfo, "userInfo");
                        arrayList2.add(InteractionTagInfoKt.toMutualUser(userInfo));
                    }
                    if (arrayList2.size() > 0) {
                        C188627ak c188627ak = this.LLIIIJ;
                        if (c188627ak != null) {
                            c188627ak.setVisibility(0);
                            C188627ak c188627ak2 = this.LLIIIJ;
                            if (c188627ak2 != null) {
                                c188627ak2.LIZ(new MutualStruct(0, arrayList2.size(), arrayList2, 0), 4);
                                return;
                            } else {
                                o.LJIJI("socialTaggedView");
                                throw null;
                            }
                        }
                        o.LJIJI("socialTaggedView");
                        throw null;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C188627ak c188627ak3 = this.LLIIIJ;
            if (c188627ak3 != null) {
                c188627ak3.setVisibility(8);
                return;
            } else {
                o.LJIJI("socialTaggedView");
                throw null;
            }
        }
        o.LJIJI("socialTaggedView");
        throw null;
    }

    public final INetworkStateService LLJJIII() {
        return (INetworkStateService) this.LLIFFJFJJ.getValue();
    }

    public final DialogC25756A8y LLJJIJI() {
        return (DialogC25756A8y) this.LLIIL.getValue();
    }

    public final void LLJJJ() {
        String str;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        List<PhotoModeImageUrlModel> imageList;
        Activity activity = this.mActivity;
        if (activity != null) {
            LLJJ(activity);
        }
        GVN gvn = G9Z.LIZ;
        if (gvn == null || (str = gvn.LIZ) == null || (videoPublishEditModel = this.LJZ) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (editPostModel = creativeModel.editPostModel) == null || (imageList = editPostModel.getImageList()) == null) {
            return;
        }
        GMN gmn = new GMN(str);
        C41067G9v c41067G9v = new C41067G9v(this);
        C76732zl c76732zl = new C76732zl();
        C76732zl c76732zl2 = new C76732zl();
        long currentTimeMillis = System.currentTimeMillis();
        C76732zl c76732zl3 = new C76732zl();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        XKX.LIZLLL(gmn.LIZ, null, null, new GLX(imageList, c76732zl2, c76732zl, c41067G9v, gmn, c76732zl3, c68322mC, currentTimeMillis, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r1 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJIL() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41051G9f.LLJJJIL():void");
    }

    public final void LLJLILLLLZIIL() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        if (this.LLFII) {
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            VideoPublishEditModel videoPublishEditModel = this.LJZ;
            if (videoPublishEditModel != null) {
                C6XZ.LIZ(requireActivity, videoPublishEditModel);
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ChooseCoverActivity.LLILIL(activity, this.LJZ);
    }

    public final void LLJLL() {
        String str;
        Activity activity = this.mActivity;
        if (activity == null || !C48203Ivv.LJ(activity) || LLJJIII().isFakeNetwork()) {
            return;
        }
        A90 a90 = this.LLIILII;
        if (a90 != null) {
            LLJJI(a90);
            return;
        }
        Activity activity2 = this.mActivity;
        if (activity2 != null) {
            A90 a902 = new A90(activity2);
            Activity activity3 = this.mActivity;
            if (activity3 != null) {
                str = activity3.getString(R.string.rjz);
            } else {
                str = null;
            }
            a902.LIZJ(str);
            a902.LIZLLL(this.LLIILZL);
            a902.LIZIZ(false);
            a902.LIZ(true);
            LLJJI(a902);
            this.LLIILII = a902;
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLJLLIL() {
        if (this.LLFII) {
            if (!this.LLIIJLIL) {
                LLJJJ();
                return;
            }
            return;
        }
        Activity activity = this.mActivity;
        if (activity != null) {
            LLJJ(activity);
        }
        if (GMQ.LJ || GMQ.LJFF) {
            return;
        }
        GMQ.LJFF = true;
        X5R x5r = GMQ.LIZ;
        if (x5r == null) {
            return;
        }
        x5r.LIZJ();
    }

    public C41051G9f() {
        C60903NvH.LJIIJJI().getRegionService();
        Boolean LIZIZ = C44296Ha0.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getAPI().regionService.isInTikTokRegion");
        LIZIZ.booleanValue();
        this.LLIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 15));
    }

    @Override // X.WM7
    public final void onDestroyView() {
        ActivityC45651qj activityC45651qj;
        Fragment LJJJI;
        super.onDestroyView();
        Activity activity = this.mActivity;
        if ((activity instanceof EditPostedVideoPublishActivity) && (activityC45651qj = (ActivityC45651qj) activity) != null && (LJJJI = activityC45651qj.getSupportFragmentManager().LJJJI(R.id.dm7)) != null) {
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJI(LJJJI);
            c1b3.LJIILJJIL();
        }
        List<C15070iV<Class<?>, IAVPublishExtension<?>>> list = this.LLII;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) ((C15070iV) it.next()).LIZIZ;
                if (iAVPublishExtension != null) {
                    iAVPublishExtension.onDestroy();
                }
            }
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        View view = this.LLIIII;
        if (view != null) {
            view.setVisibility(8);
            List<C15070iV<Class<?>, IAVPublishExtension<?>>> list = this.LLII;
            if (list != null) {
                Iterator<C15070iV<Class<?>, IAVPublishExtension<?>>> it = list.iterator();
                while (it.hasNext()) {
                    IAVPublishExtension<?> iAVPublishExtension = it.next().LIZIZ;
                    if (iAVPublishExtension != null) {
                        iAVPublishExtension.onResume();
                    }
                }
            }
            GSR gsr = this.LJLLILLLL;
            if (gsr != null) {
                if (gsr.hasFocus()) {
                    GSR gsr2 = this.LJLLILLLL;
                    if (gsr2 != null) {
                        AYA.LIZJ(0, gsr2);
                    } else {
                        o.LJIJI("mentionEditText");
                        throw null;
                    }
                }
                GS5 gs5 = this.LLIIIILZ;
                if (gs5 != null) {
                    gs5.LJI();
                    return;
                } else {
                    o.LJIJI("imageHeaderModule");
                    throw null;
                }
            }
            o.LJIJI("mentionEditText");
            throw null;
        }
        o.LJIJI("interceptView");
        throw null;
    }

    @Override // X.G6K
    public final Fragment getFragment() {
        return this.LLIIIZ;
    }

    @Override // X.G6K
    public final String LJJLI(int i) {
        String string = getString(i);
        o.LJIIIIZZ(string, "getString(resId)");
        return string;
    }

    public final void LLJJ(Activity activity) {
        if (!C48203Ivv.LJ(activity)) {
            C24540xm.LIZ(R.string.fql, activity, 2022);
        } else if (LLJJIII().isWeakNetwork()) {
            C24540xm.LIZ(R.string.fqq, activity, 2022);
        } else {
            if (!LLJJIII().isFakeNetwork()) {
                return;
            }
            C24540xm.LIZ(R.string.fqi, activity, 2022);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLIL(boolean r28) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41051G9f.LLJLIL(boolean):void");
    }

    public static boolean LLJJJJ(EditPostPermission editPostPermission, List list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((EnumC41099GBb) it.next()).getValue()));
        }
        List<EditPostBizPermissionStruct> bizPermission = editPostPermission.getBizPermission();
        if (bizPermission == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (EditPostBizPermissionStruct editPostBizPermissionStruct : bizPermission) {
            if (arrayList.contains(Integer.valueOf(editPostBizPermissionStruct.getBizType()))) {
                arrayList2.add(editPostBizPermissionStruct);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((EditPostBizPermissionStruct) it2.next()).getBizStatus() != EnumC41101GBd.SHOW.getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LLJILJIL(C164096cH c164096cH, UrlModel urlModel) {
        if (urlModel != null) {
            c164096cH.getHeight();
            C78764Uvg.LJIIIIZZ(c164096cH, urlModel, null, null, new IDdS474S0100000_7(this, 0));
        }
    }

    public final void LLJJIJIIJIL(Integer num, boolean z) {
        boolean z2;
        AnonymousClass377 anonymousClass377 = this.LJLZ;
        if (anonymousClass377 != null) {
            if (!z) {
                z2 = true;
            } else {
                z2 = false;
            }
            anonymousClass377.setInterceptTouchEvent(z2);
            if (z) {
                AnonymousClass377 anonymousClass3772 = this.LJLZ;
                if (anonymousClass3772 != null) {
                    anonymousClass3772.setAlpha(1.0f);
                    AnonymousClass377 anonymousClass3773 = this.LJLZ;
                    if (anonymousClass3773 != null) {
                        anonymousClass3773.setOnClickListener(new ViewOnClickListenerC13880ga(null));
                        return;
                    } else {
                        o.LJIJI("editContainerParent");
                        throw null;
                    }
                }
                o.LJIJI("editContainerParent");
                throw null;
            }
            AnonymousClass377 anonymousClass3774 = this.LJLZ;
            if (anonymousClass3774 != null) {
                anonymousClass3774.setAlpha(0.34f);
                AnonymousClass377 anonymousClass3775 = this.LJLZ;
                if (anonymousClass3775 != null) {
                    C146035oF.LIZJ(anonymousClass3775, new AqS154S0200000_7(this, num, 5));
                    return;
                } else {
                    o.LJIJI("editContainerParent");
                    throw null;
                }
            }
            o.LJIJI("editContainerParent");
            throw null;
        }
        o.LJIJI("editContainerParent");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:498:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJIL(android.view.View r35, android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 2525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41051G9f.LLJJIJIL(android.view.View, android.os.Bundle):void");
    }

    public final void LLJJL(CaptionStruct captionStruct, String str) {
        boolean z;
        List<Utterance> list;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !C44687HgJ.LIZIZ(str)) {
            C43045Guv.LIZLLL(new AqS157S0100000_7(this, 5), 0L);
            return;
        }
        try {
            CaptionStruct captionStruct2 = (CaptionStruct) new Gson().LJ(new FileReader(str), CaptionStruct.class);
            if (captionStruct2 != null) {
                list = captionStruct2.getUtterances();
            } else {
                list = null;
            }
            captionStruct.setUtterances(list);
        } catch (Exception unused) {
            C43045Guv.LIZLLL(new AqS157S0100000_7(this, 5), 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJLIIIJLLLLLLLZ(int r14, android.view.View r15) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41051G9f.LLJJLIIIJLLLLLLLZ(int, android.view.View):void");
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        String str;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        Long valueOf;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        EditPostPermission editPostPermission;
        List<EditPostBizPermissionStruct> bizPermission;
        EditPostBizPermissionStruct editPostBizPermissionStruct;
        AVPublishExtensionVisible aVPublishExtensionVisible;
        boolean z;
        VideoPublishEditModel videoPublishEditModel2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AutoTransition autoTransition = new AutoTransition();
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.getWindow().setSharedElementReenterTransition(autoTransition);
            activity.getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        C41315GJj.LIZ(view);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            videoPublishEditModel = (VideoPublishEditModel) bundle2.getSerializable("args");
        } else {
            videoPublishEditModel = null;
        }
        this.LJZ = videoPublishEditModel;
        Activity activity2 = this.mActivity;
        if (activity2 != null && activity2.getIntent() != null && (videoPublishEditModel2 = this.LJZ) != null) {
            Activity activity3 = this.mActivity;
            if (activity3 != null) {
                Parcelable parcelableExtra = activity3.getIntent().getParcelableExtra("creative_model");
                if (parcelableExtra != null) {
                    videoPublishEditModel2.creativeModel = (CreativeModel) parcelableExtra;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        AVPublishContentType contentType = AVPublishContentType.Video;
        o.LJIIIZ(contentType, "contentType");
        ArrayList arrayList = new ArrayList();
        int i = C40952G5k.LIZ[contentType.ordinal()];
        if (i == 1 || i == 2) {
            if (C211898Th.LIZ()) {
                C51556KLg.LIZ.getClass();
                C15070iV<Class<?>, IAVPublishExtension<?>> LJJIFFI = C51556KLg.LIZ().LJJIFFI(AVPublishPageScene.EDIT_POST);
                if (LJJIFFI != null) {
                    arrayList.add(LJJIFFI);
                }
            }
            this.LLII = arrayList;
            C60903NvH.LJIIJJI().LJIJ();
            VideoPublishEditModel videoPublishEditModel3 = this.LJZ;
            if (videoPublishEditModel3 != null) {
                this.LLFFF = C79004UzY.LJJIJ(videoPublishEditModel3);
                VideoPublishEditModel videoPublishEditModel4 = this.LJZ;
                if (videoPublishEditModel4 != null) {
                    this.LLFII = H7R.LJJJJL(videoPublishEditModel4);
                    try {
                        LLJJIJIL(view, bundle);
                        C162696a1.LIZ(this.mActivity);
                        C42796Gqu c42796Gqu = this.LJLJL;
                        if (c42796Gqu != null) {
                            SceneWrapperFragment sceneWrapperFragment = this.LLIIIZ;
                            boolean z2 = this.LLFII;
                            VideoPublishEditModel videoPublishEditModel5 = this.LJZ;
                            if (videoPublishEditModel5 != null) {
                                GHY LIZ = GHX.LIZ(videoPublishEditModel5);
                                VideoPublishEditModel videoPublishEditModel6 = this.LJZ;
                                if (videoPublishEditModel6 != null) {
                                    c42796Gqu.LJFF(sceneWrapperFragment, z2, LIZ, videoPublishEditModel6.creationMode);
                                    VideoPublishEditModel videoPublishEditModel7 = this.LJZ;
                                    if (videoPublishEditModel7 != null && (creativeModel2 = videoPublishEditModel7.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null && (editPostPermission = editPostModel2.getEditPostPermission()) != null && (bizPermission = editPostPermission.getBizPermission()) != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (EditPostBizPermissionStruct editPostBizPermissionStruct2 : bizPermission) {
                                            if (editPostBizPermissionStruct2.getBizType() < EnumC41099GBb.POI.getValue()) {
                                                arrayList2.add(editPostBizPermissionStruct2);
                                            }
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            if (!arrayList2.isEmpty()) {
                                                Iterator it = arrayList2.iterator();
                                                while (it.hasNext()) {
                                                    if (((EditPostBizPermissionStruct) it.next()).getBizStatus() != EnumC41101GBd.SHOW.getValue()) {
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                            }
                                            z = true;
                                            LLJJIJIIJIL(Integer.valueOf(((EditPostBizPermissionStruct) ListProtector.get(arrayList2, 0)).getBizStatus()), z);
                                        } else {
                                            LLJJIJIIJIL(null, false);
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Iterator<EditPostBizPermissionStruct> it2 = bizPermission.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                editPostBizPermissionStruct = it2.next();
                                                if (editPostBizPermissionStruct.getBizType() == EnumC41099GBb.POI.getValue()) {
                                                    break;
                                                }
                                            } else {
                                                editPostBizPermissionStruct = null;
                                                break;
                                            }
                                        }
                                        EditPostBizPermissionStruct editPostBizPermissionStruct3 = editPostBizPermissionStruct;
                                        if (editPostBizPermissionStruct3 != null) {
                                            int bizStatus = editPostBizPermissionStruct3.getBizStatus();
                                            C51556KLg.LIZ.getClass();
                                            if (!C51556KLg.LIZ().LJJLIIIJJI()) {
                                                aVPublishExtensionVisible = AVPublishExtensionVisible.GONE;
                                            } else if (bizStatus == EnumC41101GBd.SHOW.getValue()) {
                                                aVPublishExtensionVisible = AVPublishExtensionVisible.VISIBLE;
                                            } else if (bizStatus == EnumC41101GBd.NO_SHOW.getValue()) {
                                                aVPublishExtensionVisible = AVPublishExtensionVisible.GONE;
                                            } else {
                                                aVPublishExtensionVisible = AVPublishExtensionVisible.GRAY;
                                            }
                                            linkedHashMap.put(AVPublishExtensionBiz.POI, aVPublishExtensionVisible);
                                        } else {
                                            linkedHashMap.put(AVPublishExtensionBiz.POI, AVPublishExtensionVisible.GONE);
                                        }
                                        List<C15070iV<Class<?>, IAVPublishExtension<?>>> list = this.LLII;
                                        if (list != null) {
                                            Iterator it3 = ((ArrayList) list).iterator();
                                            while (it3.hasNext()) {
                                                IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) ((C15070iV) it3.next()).LIZIZ;
                                                if (iAVPublishExtension != null) {
                                                    iAVPublishExtension.onExtensionEnable(linkedHashMap);
                                                }
                                            }
                                        }
                                    }
                                    C145995oB c145995oB = new C145995oB();
                                    GVN gvn = G9Z.LIZ;
                                    if (gvn == null || (str = gvn.LIZJ) == null) {
                                        str = "";
                                    }
                                    c145995oB.LJI("enter_from", str);
                                    G9Z.LIZIZ(c145995oB);
                                    VideoPublishEditModel videoPublishEditModel8 = this.LJZ;
                                    if (videoPublishEditModel8 != null && (creativeModel = videoPublishEditModel8.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null && (valueOf = Long.valueOf(editPostModel.getAwemeCreateTime())) != null) {
                                        c145995oB.LIZIZ(C44432HcC.LJ(valueOf.longValue()), "after_post_days");
                                        FMX.LJIIL("enter_video_edit_after_post", c145995oB.LIZ);
                                        return;
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        o.LJIJI("hashTagsModule");
                        throw null;
                    } catch (Exception e) {
                        C41859Gbn LIZIZ = C1I0.LIZIZ();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("init failed, stacktrace: ");
                        LIZ2.append(android.util.Log.getStackTraceString(e));
                        LIZIZ.LJ("PostPageInit", X1D.LIZIZ(LIZ2));
                        if (C19N.LJ("edit_post_crash_fix", false)) {
                            Activity activity4 = this.mActivity;
                            if (activity4 != null) {
                                activity4.finish();
                                return;
                            }
                            return;
                        }
                        throw e;
                    }
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("unknown type: ");
        LIZ3.append(contentType.getContentType());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZ = FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cck, viewGroup, false, "inflater.inflate(R.layou…ublish, container, false)");
        this.LJLIL = LIZ;
        return LIZ;
    }
}
