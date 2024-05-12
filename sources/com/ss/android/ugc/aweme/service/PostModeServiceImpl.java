package com.ss.android.ugc.aweme.service;

import X.AV1;
import X.ActivityC86117Xqz;
import X.C201417vN;
import X.C201427vO;
import X.C2045481a;
import X.C2053384b;
import X.C207248Bk;
import X.C207268Bm;
import X.C207298Bp;
import X.C207318Br;
import X.C207338Bt;
import X.C207358Bv;
import X.C207378Bx;
import X.C207398Bz;
import X.C211258Qv;
import X.C222588oQ;
import X.C38995FSd;
import X.C3C8;
import X.C40517FvF;
import X.C53326KwM;
import X.C58096Mr6;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78726Uv4;
import X.C82Z;
import X.C84763XOl;
import X.C84V;
import X.C86T;
import X.C8C1;
import X.C8NW;
import X.EnumC207218Bh;
import X.InterfaceC207258Bl;
import X.InterfaceC65350Pko;
import X.JHC;
import X.JHD;
import X.KL0;
import X.LFH;
import X.OUP;
import Y.ARunnableS0S1401000_1;
import Y.ARunnableS17S1000000_13;
import Y.ARunnableS1S0202000_3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity;
import com.ss.android.ugc.aweme.ui.feed.BottomPhotosDotIndicatorAssem;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoModeVideoTagTrigger;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder;
import com.ss.android.ugc.aweme.ui.feed.TopPhotosDotIndicatorAssem;
import com.ss.android.ugc.aweme.ui.util.PhotoModeIconAssem;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeServiceImpl implements IPostModeService {
    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZLLL() {
        return C65352Pkq.LIZ(PhotoModeIconAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LJIIJJI() {
        return C65352Pkq.LIZ(FeedPhotoModeVideoTagTrigger.class);
    }

    public static IPostModeService LJJIIJ() {
        Object LIZ = C58096Mr6.LIZ(IPostModeService.class, false);
        if (LIZ != null) {
            return (IPostModeService) LIZ;
        }
        if (C58096Mr6.h5 == null) {
            synchronized (IPostModeService.class) {
                if (C58096Mr6.h5 == null) {
                    C58096Mr6.h5 = new PostModeServiceImpl();
                }
            }
        }
        return C58096Mr6.h5;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJ() {
        if (((Boolean) C207378Bx.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Integer LJFF() {
        String str = (String) C207298Bp.LIZ.getValue();
        if (str != null) {
            switch (str.hashCode()) {
                case -730098288:
                    if (str.equals("photoMode_fyp_anchor1")) {
                        return Integer.valueOf(R.string.jka);
                    }
                    break;
                case -730098287:
                    if (str.equals("photoMode_fyp_anchor2")) {
                        return Integer.valueOf(R.string.jkb);
                    }
                    break;
                case -730098286:
                    if (str.equals("photoMode_fyp_anchor3")) {
                        return Integer.valueOf(R.string.jkc);
                    }
                    break;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIIJ() {
        if (((Number) C207358Bv.LIZ.getValue()).intValue() != 1 || LFH.LIZIZ.LIZLLL().block().LJFF()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIFFI() {
        if (((Number) C207338Bt.LIZ.getValue()).intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final float LJJIII() {
        return (float) ((Number) C84V.LIZIZ.getValue()).doubleValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIILJJIL() {
        return C86T.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJJLI() {
        return C84763XOl.LJIIIIZZ() instanceof PostModeDetailActivity;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IPhotoModeLogUtil LJIIIZ() {
        return C2045481a.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LIZ(String str) {
        C38995FSd.LIZJ().execute(new ARunnableS17S1000000_13(str, 1));
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZIZ(EnumC207218Bh type) {
        Class cls;
        o.LJIIIZ(type, "type");
        if (EnumC207218Bh.TYPE_BOTTOM_AREA == type) {
            cls = BottomPhotosDotIndicatorAssem.class;
        } else {
            cls = TopPhotosDotIndicatorAssem.class;
        }
        return C65352Pkq.LIZ(cls);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final JHD LIZJ(JHC jhc) {
        if (jhc == null) {
            return null;
        }
        return new C207268Bm(jhc);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC207258Bl LJI(ViewGroup viewGroup) {
        TuxIconView tuxIconView;
        if (viewGroup != null && (tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.ho_)) != null) {
            C62822Ol8 c62822Ol8 = C207338Bt.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
                return new C207248Bk(viewGroup, tuxIconView);
            }
            return new InterfaceC207258Bl() { // from class: X.8Bi
                @Override // X.InterfaceC207258Bl
                public final void LIZ(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC207258Bl
                public final void LIZJ(String reason) {
                    o.LJIIIZ(reason, "reason");
                }

                @Override // X.InterfaceC207258Bl
                public final void LJ(String reason) {
                    o.LJIIIZ(reason, "reason");
                }

                @Override // X.InterfaceC207258Bl
                public final void LIZIZ(Aweme aweme) {
                    o.LJIIIZ(aweme, "aweme");
                    LIZLLL(aweme.isPhotoMode());
                }

                @Override // X.InterfaceC207258Bl
                public final void LIZLLL(boolean z) {
                    if (z) {
                        LIZJ(EnumC207238Bj.NOT_PHOTO_MODE.getValue());
                    } else {
                        LJ(EnumC207238Bj.NOT_PHOTO_MODE.getValue());
                    }
                }
            };
        }
        throw new Resources.NotFoundException("Container does not contain photo mode icon");
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final String LJIIL(String str) {
        return C78726Uv4.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIILLIIL(Aweme aweme) {
        if (aweme == null || !OUP.LJJIII(aweme) || !LJIIJ() || aweme.isAd()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJIIZILJ(Object params) {
        o.LJIIIZ(params, "params");
        return new FeedPhotosViewHolder((C222588oQ) params);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJI(Aweme aweme) {
        if (OUP.LJJIII(aweme) && !aweme.isAd() && !C61447O9r.LJIIIZ && ((Boolean) C8C1.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author != null && ((C53326KwM.LIZ() || C211258Qv.LIZ()) && !AV1.LJIJ(author))) || !OUP.LJJIII(aweme) || !((Boolean) C207318Br.LIZ.getValue()).booleanValue() || aweme.getReplaceRecTagByRepost()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJI(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        Map<String, Object> postExtraMap;
        PhotoModeImageInfo photoModeImageInfo2;
        Map<String, Object> postExtraMap2;
        if (aweme == null || !aweme.isPhotoMode() || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (postExtraMap = photoModeImageInfo.getPostExtraMap()) == null || !postExtraMap.containsKey("photo_cover_shrink") || (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) == null || (postExtraMap2 = photoModeImageInfo2.getPostExtraMap()) == null || !o.LJ(postExtraMap2.get("photo_cover_shrink"), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final View LJJII(View view) {
        return view.findViewById(R.id.hoc);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LJIILIIL(Context context, Aweme aweme) {
        return C2053384b.LIZ(context, aweme).getLineCount();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIJJ(String sharedVMKey, C201427vO c201427vO) {
        o.LJIIIZ(sharedVMKey, "sharedVMKey");
        if (((Boolean) C207398Bz.LIZ.getValue()).booleanValue()) {
            C201417vN.LIZIZ(sharedVMKey, c201427vO, "aweme://post_mode_detail");
        } else {
            C201417vN.LIZIZ(sharedVMKey, c201427vO, "aweme://postdetail");
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIJ(int i, Context context, List list) {
        if (context == null) {
            return;
        }
        C38995FSd.LJ().schedule(new ARunnableS1S0202000_3(i, context, list, 1), 1000L, TimeUnit.MILLISECONDS);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJII(int i, int i2, Context context, List list) {
        if (context == null) {
            return;
        }
        C38995FSd.LJ().schedule(new ARunnableS1S0202000_3(i2, i, context, list, 0), 1000L, TimeUnit.MILLISECONDS);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIIIIZZ(Context context, Aweme aweme, C40517FvF c40517FvF, KL0 priority) {
        o.LJIIIZ(priority, "priority");
        if (context == null || aweme == null) {
            return;
        }
        C8NW.LIZJ.LIZJ(context, aweme, c40517FvF, priority);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJ(final Activity activity, final int i, Object obj, Object obj2) {
        FeedItemList feedItemList;
        FeedItemList feedItemList2;
        List<Aweme> items;
        Iterator<Aweme> it;
        if (activity == null || !(activity instanceof ActivityC86117Xqz)) {
            return;
        }
        if (obj instanceof FeedItemList) {
            feedItemList = (FeedItemList) obj;
        } else {
            feedItemList = null;
        }
        if (obj2 instanceof FeedItemList) {
            feedItemList2 = (FeedItemList) obj2;
        } else {
            feedItemList2 = null;
        }
        if (C82Z.LIZ || feedItemList2 == null) {
            return;
        }
        List<Aweme> items2 = feedItemList2.getItems();
        final int i2 = 0;
        if (items2 == null || items2.isEmpty() || feedItemList2 == null || (items = feedItemList2.getItems()) == null || (it = items.iterator()) == null) {
            return;
        }
        while (true) {
            if (it.hasNext()) {
                Aweme next = it.next();
                if (next != null && next.isPhotoMode()) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i == 1 && i2 <= 1) {
            return;
        }
        if (feedItemList != null && feedItemList.getItems() != null && i != 1) {
            i2 += feedItemList.getItems().size();
        }
        C82Z.LIZ = true;
        C38995FSd.LIZIZ().execute(new Runnable() { // from class: X.8Er
            public final void LIZ() {
                SoftReference<C53790L9e> softReference = new SoftReference<>(new C53790L9e(activity));
                C82Z.LIZJ = softReference;
                C53790L9e c53790L9e = softReference.get();
                if (c53790L9e != null) {
                    C208108Es c208108Es = new C208108Es(c53790L9e);
                    c208108Es.LIZ(R.layout.c2e, 3);
                    c53790L9e.LIZJ(c208108Es, 3000L);
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "homepage_hot");
                c188727au.LIZLLL(i, "event_type");
                c188727au.LIZLLL(i2, "current_index");
                FMX.LJIIL("photomode_preload_trigger", c188727au.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIILL(View view, View view2, Aweme aweme, String str, AqS169S0100000_3 aqS169S0100000_3) {
        if (LJIL(aweme)) {
            if (view2 == null) {
                C38995FSd.LIZJ().execute(new ARunnableS0S1401000_1(view, this, aweme, str, aqS169S0100000_3, 0));
                return;
            } else {
                view2.setVisibility(0);
                return;
            }
        }
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }
}
