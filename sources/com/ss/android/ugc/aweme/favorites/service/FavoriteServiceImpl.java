package com.ss.android.ugc.aweme.favorites.service;

import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C00F;
import X.C16970lZ;
import X.C191937g5;
import X.C192307gg;
import X.C193027hq;
import X.C193497ib;
import X.C193507ic;
import X.C193577ij;
import X.C193627io;
import X.C2U8;
import X.C47261Igj;
import X.C58096Mr6;
import X.C61878OQg;
import X.C72818Shy;
import X.C76052yf;
import X.C7ZB;
import X.C7ZC;
import X.HG3;
import X.HT0;
import X.InterfaceC62486Ofi;
import X.M8L;
import X.OSJ;
import X.RBX;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.experiment.DiscoverCollectTemplateConfig;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragment;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentOtherProfile;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.favorites.business.collection.ChangePrivacyAbility;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.DeleteAbility;
import com.ss.android.ugc.aweme.favorites.business.collection.ReNameAbility;
import com.ss.android.ugc.aweme.favorites.business.collection.VideoCollectionApi;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionRouteInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FavoriteServiceImpl implements IFavoriteService {
    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIIL() {
        int i = -1;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("settings_has_ever_shown_favorite_notice", -1);
        } catch (Throwable unused) {
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJII(HT0.class);
    }

    public static IFavoriteService LJIJJLI() {
        Object LIZ = C58096Mr6.LIZ(IFavoriteService.class, false);
        if (LIZ != null) {
            return (IFavoriteService) LIZ;
        }
        if (C58096Mr6.y0 == null) {
            synchronized (IFavoriteService.class) {
                if (C58096Mr6.y0 == null) {
                    C58096Mr6.y0 = new FavoriteServiceImpl();
                }
            }
        }
        return C58096Mr6.y0;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LIZ() {
        if (C00F.LIZ(31744, 0, "public_favorite_list_out_app_share", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final long LIZIZ() {
        int LIZ = C00F.LIZ(31744, 1, "coll_view_preload", true);
        if (LIZ != 3) {
            if (LIZ != 4) {
                if (LIZ != 5) {
                    return 0L;
                }
                return 2000L;
            }
            return 500L;
        }
        return 1000L;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final MusicCollectionRouteInterceptor LIZLLL() {
        return new MusicCollectionRouteInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJ() {
        if (C00F.LIZ(31744, 0, "favorite_notify_for_creator_side", true) != 0) {
            if (C00F.LIZ(31744, 0, "favorite_notify_for_creator_side", true) != 2) {
                return false;
            }
            return true;
        }
        if (C00F.LIZ(31744, 1, "favorite_notify_for_consumption_side", true) != 2 && C00F.LIZ(31744, 1, "favorite_notify_for_consumption_side", true) != 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIIIZ() {
        if (C00F.LIZ(31744, 0, "favorite_reverse", false) == 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7ZB] */
    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C7ZB LJIIJ() {
        return new InterfaceC62486Ofi() { // from class: X.7ZB
            @Override // X.InterfaceC62486Ofi
            public final void LJ() {
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJFF() {
                return R.raw.icon_2pt_pen;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJIJ() {
                return R.raw.icon_2pt_pen;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJJI() {
                return true;
            }

            @Override // X.InterfaceC62486Ofi
            public final String LJJIFFI() {
                return "";
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJJII() {
                return R.string.r6y;
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJJIIJZLJL() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC62486Ofi
            public final String key() {
                return "rename_video_collection";
            }

            @Override // X.InterfaceC62486Ofi
            public final int LIZ() {
                return C62485Ofh.LIZIZ();
            }

            @Override // X.InterfaceC62486Ofi
            public final EnumC41317GJl LJIILIIL() {
                return EnumC41317GJl.ShareButton;
            }

            @Override // X.InterfaceC62486Ofi
            public final EnumC26273ASv LJIILLIIL() {
                return EnumC26273ASv.NORMAL;
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJIIIZ(TextView textView) {
                C62485Ofh.LJ(this, textView);
            }

            @Override // X.InterfaceC62486Ofi
            public final void onClick(View view) {
                o.LJIIIZ(view, "view");
            }

            @Override // X.InterfaceC62486Ofi
            public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
            }

            @Override // X.InterfaceC62486Ofi
            public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                InterfaceC55235Lm3 LIZJ;
                ReNameAbility reNameAbility;
                o.LJIIIZ(context, "context");
                o.LJIIIZ(sharePackage, "sharePackage");
                Fragment LJIILLIIL = C79004UzY.LJIILLIIL(context, C65352Pkq.LIZ(CollectionContentFragment.class));
                if (LJIILLIIL != null && (LIZJ = C55230Lly.LIZJ(LJIILLIIL, null)) != null && (reNameAbility = (ReNameAbility) C55096Ljo.LIZ(LIZJ, ReNameAbility.class, null)) != null) {
                    reNameAbility.Ni0();
                }
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                C62485Ofh.LIZJ(context, baseSharePackage, this);
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJIIZILJ(ImageView imageView, View view, int i) {
                C62485Ofh.LIZLLL(imageView, view);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7ZC] */
    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C7ZC LJIILIIL() {
        return new InterfaceC62486Ofi() { // from class: X.7ZC
            @Override // X.InterfaceC62486Ofi
            public final void LJ() {
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJFF() {
                return R.raw.icon_2pt_trash_bin;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJI() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJIJ() {
                return R.raw.icon_2pt_trash_bin;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJJI() {
                return true;
            }

            @Override // X.InterfaceC62486Ofi
            public final String LJJIFFI() {
                return "";
            }

            @Override // X.InterfaceC62486Ofi
            public final int LJJII() {
                return R.string.gbj;
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean LJJIIJZLJL() {
                return false;
            }

            @Override // X.InterfaceC62486Ofi
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC62486Ofi
            public final String key() {
                return "delete_video_collection";
            }

            @Override // X.InterfaceC62486Ofi
            public final int LIZ() {
                return C62485Ofh.LIZIZ();
            }

            @Override // X.InterfaceC62486Ofi
            public final EnumC41317GJl LJIILIIL() {
                return EnumC41317GJl.ShareButton;
            }

            @Override // X.InterfaceC62486Ofi
            public final EnumC26273ASv LJIILLIIL() {
                return EnumC26273ASv.NORMAL;
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJIIIZ(TextView textView) {
                C62485Ofh.LJ(this, textView);
            }

            @Override // X.InterfaceC62486Ofi
            public final void onClick(View view) {
                o.LJIIIZ(view, "view");
            }

            @Override // X.InterfaceC62486Ofi
            public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
            }

            @Override // X.InterfaceC62486Ofi
            public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                InterfaceC55235Lm3 LIZJ;
                DeleteAbility deleteAbility;
                o.LJIIIZ(context, "context");
                o.LJIIIZ(sharePackage, "sharePackage");
                Fragment LJIILLIIL = C79004UzY.LJIILLIIL(context, C65352Pkq.LIZ(CollectionContentFragment.class));
                if (LJIILLIIL != null && (LIZJ = C55230Lly.LIZJ(LJIILLIIL, null)) != null && (deleteAbility = (DeleteAbility) C55096Ljo.LIZ(LIZJ, DeleteAbility.class, null)) != null) {
                    deleteAbility.Ip();
                }
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                C62485Ofh.LIZJ(context, baseSharePackage, this);
            }

            @Override // X.InterfaceC62486Ofi
            public final void LJIIZILJ(ImageView imageView, View view, int i) {
                C62485Ofh.LIZLLL(imageView, view);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIILL() {
        if (C00F.LIZ(31744, 1, "favorite_notify_for_consumption_side", true) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final String LJIIZILJ() {
        DiscoverCollectTemplateConfig.LIZ.getClass();
        DiscoverCollectTemplateConfig.Config config = (DiscoverCollectTemplateConfig.Config) SettingsManager.LIZLLL().LJIIIIZZ("discovery_collect_template", DiscoverCollectTemplateConfig.Config.class, null);
        if (config == null) {
            config = new DiscoverCollectTemplateConfig.Config(null, null);
        }
        String str = config.hashtagCdnUrl;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIJ() {
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "video_creation_finish_event"));
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJFF() {
        if (C193497ib.LIZ() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final int LJI() {
        int LIZ = C193497ib.LIZ();
        if (1 > LIZ || LIZ >= 10) {
            return 0;
        }
        return ((LIZ - 1) % 3) + 1;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final boolean LJIJJ() {
        int LIZ = C193497ib.LIZ();
        if (7 <= LIZ && LIZ < 10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.7ij] */
    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final C193577ij LJII(final C193627io c193627io) {
        if (C192307gg.LIZ()) {
            return new InterfaceC62486Ofi(c193627io) { // from class: X.7ij
                public final C193627io LJLIL;
                public final String LJLILLLLZI = "need_reopen_panel";

                @Override // X.InterfaceC62486Ofi
                public final void LJ() {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJI() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String LJJIFFI() {
                    return "";
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean LJJIIJZLJL() {
                    return false;
                }

                @Override // X.InterfaceC62486Ofi
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC62486Ofi
                public final String key() {
                    return "privacy_setting";
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJFF() {
                    if (this.LJLIL.LJFF) {
                        return R.raw.icon_2pt_unlock;
                    }
                    return R.raw.icon_2pt_lock;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJJII() {
                    if (this.LJLIL.LJFF) {
                        return R.string.dgt;
                    }
                    return R.string.dgu;
                }

                @Override // X.InterfaceC62486Ofi
                public final int LIZ() {
                    return C62485Ofh.LIZIZ();
                }

                @Override // X.InterfaceC62486Ofi
                public final int LJIJ() {
                    return LJFF();
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC41317GJl LJIILIIL() {
                    return EnumC41317GJl.ShareButton;
                }

                @Override // X.InterfaceC62486Ofi
                public final EnumC26273ASv LJIILLIIL() {
                    return EnumC26273ASv.NORMAL;
                }

                {
                    this.LJLIL = c193627io;
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIIZ(TextView textView) {
                    C62485Ofh.LJ(this, textView);
                }

                @Override // X.InterfaceC62486Ofi
                public final void onClick(View view) {
                    o.LJIIIZ(view, "view");
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
                    ChangePrivacyAbility changePrivacyAbility;
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(sharePackage, "sharePackage");
                    FMX.LJIIL("click_make_public", C113554cx.LJJLIIIIJ(new OSZ("collection_id", this.LJLIL.LIZ), new OSZ("collection_name", this.LJLIL.LIZJ), new OSZ("enter_from", this.LJLIL.LJII)));
                    InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) C221108m2.LIZIZ(new AqS153S0100000_3(context, 271)).getValue();
                    if (interfaceC55235Lm3 != null && (changePrivacyAbility = (ChangePrivacyAbility) C55096Ljo.LIZ(interfaceC55235Lm3, ChangePrivacyAbility.class, null)) != null) {
                        boolean z = sharePackage.extras.getBoolean(this.LJLILLLLZI, false);
                        sharePackage.extras.putBoolean(this.LJLILLLLZI, false);
                        changePrivacyAbility.Gs0(z);
                    }
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
                    C62485Ofh.LIZJ(context, baseSharePackage, this);
                }

                @Override // X.InterfaceC62486Ofi
                public final void LJIIZILJ(ImageView imageView, View view, int i) {
                    C62485Ofh.LIZLLL(imageView, view);
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIIJJI(String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        C2U8.LIZ(new C191937g5(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, 510, null), null));
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIILJJIL(Context context) {
        if (C193507ic.LIZ()) {
            C16970lZ.LJ(R.layout.av1, context);
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final AmeBaseFragment LJIIIIZZ(User user, boolean z) {
        String str;
        if (user != null) {
            String secUid = user.getSecUid();
            IAccountUserService LJIILL = HG3.LJIILL();
            if (LJIILL != null) {
                str = ((RBX) LJIILL).getCurSecUserId();
            } else {
                str = null;
            }
            if (!o.LJ(secUid, str)) {
                FavoritesFragmentOtherProfile favoritesFragmentOtherProfile = new FavoritesFragmentOtherProfile();
                Bundle bundle = new Bundle();
                bundle.putString("ownerUid", user.getUid());
                bundle.putString("ownerName", user.getNickname());
                favoritesFragmentOtherProfile.setArguments(bundle);
                return favoritesFragmentOtherProfile;
            }
        }
        if (C00F.LIZ(31744, 0, "favorite_fragment_power_viewpager", true) > 0) {
            return new FavoritesFragmentV2(Boolean.valueOf(z));
        }
        return new FavoritesFragment(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final OSJ LJIJI(long j, String collectionId) {
        int i;
        Object obj;
        boolean z;
        Long l;
        Boolean bool;
        o.LJIIIZ(collectionId, "collectionId");
        try {
            VideoCollectionApi.LIZ.getClass();
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String API_URL_PREFIX_SI = Api.LIZ;
            o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
            VideoCollectionApi videoCollectionApi = (VideoCollectionApi) LIZLLL.create(API_URL_PREFIX_SI).create(VideoCollectionApi.class);
            long j2 = 0;
            if (j == 0) {
                i = 1;
            } else {
                i = 2;
            }
            CollectionContentResponse collectionContentResponse = videoCollectionApi.syncCollectionContent(collectionId, j, 30, i).execute().LIZIZ;
            M8L.LIZJ("/tiktok/collection/item_archive/item/list/v1", "net", collectionContentResponse);
            if (collectionContentResponse == null || (obj = collectionContentResponse.items) == null) {
                obj = C61878OQg.INSTANCE;
            }
            if (collectionContentResponse == null || (bool = collectionContentResponse.hasMore) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (collectionContentResponse != null && (l = collectionContentResponse.maxCursor) != null) {
                j2 = l.longValue();
            }
            return new OSJ(obj, valueOf, Long.valueOf(j2));
        } catch (Throwable th) {
            M8L.LIZIZ("/tiktok/collection/item_archive/item/list/v1", th);
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LIZJ(ActivityC45651qj activity, String awemeId, String enterFrom) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(enterFrom, "enterFrom");
        C193027hq c193027hq = new C193027hq(activity, awemeId, enterFrom);
        View findViewById = c193027hq.LJLIL.getWindow().getDecorView().findViewById(R.id.ncx);
        if (findViewById == null) {
            return;
        }
        c193027hq.LIZIZ(findViewById);
    }

    @Override // com.ss.android.ugc.aweme.favorites.service.IFavoriteService
    public final void LJIILLIIL(ActivityC45651qj activity, String awemeId, String enterFrom, View contentView) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(contentView, "contentView");
        new C193027hq(activity, awemeId, enterFrom).LIZIZ(contentView);
    }
}
