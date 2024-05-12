package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.expriements.VideoVisibilityPermissionBatchManagementExp;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountConfig;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.DisclosureAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SNn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71999SNn extends AbstractC65781Prl implements InterfaceC65784Pro<TPSCPageBuildConfigs> {
    public static final C71999SNn LJLIL = new C71999SNn();

    public C71999SNn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TPSCPageBuildConfigs invoke() {
        int i;
        String str;
        boolean z;
        String str2;
        VideoVisibilityPermissionBatchManagementExp.VideoVisibilityPermissionBatchManagementConfig LIZ;
        Integer valueOf = Integer.valueOf(R.string.qm);
        GroupTitleAdapterConfigs[] groupTitleAdapterConfigsArr = new GroupTitleAdapterConfigs[2];
        Parcelable[] parcelableArr = new Parcelable[7];
        parcelableArr[0] = new PrivateAccountConfig();
        parcelableArr[1] = new PrivacySettingsAdapterConfigs("activity_status", null);
        parcelableArr[2] = new PrivacySettingsAdapterConfigs("nearby", null);
        parcelableArr[3] = new PrivacySettingsAdapterConfigs("sug_item", null);
        Integer LIZLLL = UTK.LIZIZ.LIZLLL(EnumC77147UPn.MLBB).LIZLLL();
        if (LIZLLL != null && LIZLLL.intValue() != SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue()) {
            LIZLLL.intValue();
            i = R.string.i6u;
        } else {
            i = R.string.vg;
        }
        parcelableArr[4] = new DisclosureAdapterConfigs(i, null, null, "//setting/findcontact", null, false, null, 118);
        Integer valueOf2 = Integer.valueOf(R.string.hw4);
        C62717OjR c62717OjR = C62717OjR.LJLIL;
        C85296Xdk.LIZ.getClass();
        parcelableArr[5] = new DisclosureAdapterConfigs(R.string.ozc, valueOf2, null, "aweme://location_services/setting", c62717OjR, !C85296Xdk.LJFF(), C46436IKi.LJLIL, 4);
        VideoVisibilityPermissionBatchManagementExp.LIZ.getClass();
        VideoVisibilityPermissionBatchManagementExp.VideoVisibilityPermissionBatchManagementConfig LIZ2 = VideoVisibilityPermissionBatchManagementExp.LIZ();
        if (LIZ2 == null || (str = LIZ2.schema) == null) {
            str = "aweme://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fpns_product_poseidon%2Fvideo_permission_batch_management.html%3Fuse_spark%3D1%26hide_nav_bar%3D1%26show_loading%3D1%26should_full_screen%3D1";
        }
        VideoVisibilityPermissionBatchManagementExp.VideoVisibilityPermissionBatchManagementConfig LIZ3 = VideoVisibilityPermissionBatchManagementExp.LIZ();
        if (LIZ3 != null && LIZ3.enable) {
            VideoVisibilityPermissionBatchManagementExp.VideoVisibilityPermissionBatchManagementConfig LIZ4 = VideoVisibilityPermissionBatchManagementExp.LIZ();
            if (LIZ4 != null) {
                str2 = LIZ4.schema;
            } else {
                str2 = null;
            }
            if (C78685UuP.LJJJZ(str2) && (LIZ = VideoVisibilityPermissionBatchManagementExp.LIZ()) != null && LIZ.entrypoint == 1) {
                z = true;
                parcelableArr[6] = new DisclosureAdapterConfigs(R.string.tm0, null, null, str, null, z, C2LO.LJLIL, 22);
                groupTitleAdapterConfigsArr[0] = new GroupTitleAdapterConfigs(R.string.r07, C47261Igj.LJJIJIIJI(parcelableArr), 0, 10);
                int LIZIZ = C7MY.LIZIZ(8);
                Bundle bundle = new Bundle();
                bundle.putBoolean("hasVideoTag", C7F0.LIZJ());
                Bundle LIZ5 = C0JT.LIZ("show_icon", true, "delete_associated_duet_stitch_experiment", true);
                LIZ5.putBoolean("enableStitch", AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableStitch());
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("hideWhoCanSeeMyLikeListItem", C86034Xpe.LIZIZ.forcedPrivateSettingForLikedVideo());
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("isVideoViewersEnable", CommentServiceImpl.LJJL().LJIIIIZZ());
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("isProfileViewersEnable", Z8A.LIZIZ.isProfileViewersEnable());
                groupTitleAdapterConfigsArr[1] = new GroupTitleAdapterConfigs(R.string.r0u, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("comment_item", C0JT.LIZ("show_icon", true, "contain_comment_filter", true)), new PrivacySettingsAdapterConfigs("TAG_MENTION_ENTRANCE", bundle), new PrivacySettingsAdapterConfigs("chat_entrance", null), new PrivacySettingsAdapterConfigs("story_item", null), new PrivacySettingsAdapterConfigs("duet_item", C0JT.LIZ("show_icon", true, "delete_associated_duet_stitch_experiment", true)), new PrivacySettingsAdapterConfigs("stitch_item", LIZ5), new PrivacySettingsAdapterConfigs("sticker_item", null), new PrivacySettingsAdapterConfigs("downloads_item", null), new PrivacySettingsAdapterConfigs("following_list_item", null), new PrivacySettingsAdapterConfigs("liked_list_item", bundle2), new PrivacySettingsAdapterConfigs("music_collection_item", null), new PrivacySettingsAdapterConfigs("video_view_history_item", bundle3), new PrivacySettingsAdapterConfigs("profile_view_history_item", bundle4), new DisclosureAdapterConfigs(R.string.p96, null, Integer.valueOf(R.raw.icon_block_fill), "//setting/blocklist", null, false, C25936AFw.LJLIL, 50)), LIZIZ, 2);
                return new TPSCPageBuildConfigs(valueOf, (EnumC69896Rbw) null, C47261Igj.LJJIJIIJI(groupTitleAdapterConfigsArr), 5);
            }
        }
        z = false;
        parcelableArr[6] = new DisclosureAdapterConfigs(R.string.tm0, null, null, str, null, z, C2LO.LJLIL, 22);
        groupTitleAdapterConfigsArr[0] = new GroupTitleAdapterConfigs(R.string.r07, C47261Igj.LJJIJIIJI(parcelableArr), 0, 10);
        int LIZIZ2 = C7MY.LIZIZ(8);
        Bundle bundle5 = new Bundle();
        bundle5.putBoolean("hasVideoTag", C7F0.LIZJ());
        Bundle LIZ52 = C0JT.LIZ("show_icon", true, "delete_associated_duet_stitch_experiment", true);
        LIZ52.putBoolean("enableStitch", AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableStitch());
        Bundle bundle22 = new Bundle();
        bundle22.putBoolean("hideWhoCanSeeMyLikeListItem", C86034Xpe.LIZIZ.forcedPrivateSettingForLikedVideo());
        Bundle bundle32 = new Bundle();
        bundle32.putBoolean("isVideoViewersEnable", CommentServiceImpl.LJJL().LJIIIIZZ());
        Bundle bundle42 = new Bundle();
        bundle42.putBoolean("isProfileViewersEnable", Z8A.LIZIZ.isProfileViewersEnable());
        groupTitleAdapterConfigsArr[1] = new GroupTitleAdapterConfigs(R.string.r0u, C47261Igj.LJJIJIIJI(new PrivacySettingsAdapterConfigs("comment_item", C0JT.LIZ("show_icon", true, "contain_comment_filter", true)), new PrivacySettingsAdapterConfigs("TAG_MENTION_ENTRANCE", bundle5), new PrivacySettingsAdapterConfigs("chat_entrance", null), new PrivacySettingsAdapterConfigs("story_item", null), new PrivacySettingsAdapterConfigs("duet_item", C0JT.LIZ("show_icon", true, "delete_associated_duet_stitch_experiment", true)), new PrivacySettingsAdapterConfigs("stitch_item", LIZ52), new PrivacySettingsAdapterConfigs("sticker_item", null), new PrivacySettingsAdapterConfigs("downloads_item", null), new PrivacySettingsAdapterConfigs("following_list_item", null), new PrivacySettingsAdapterConfigs("liked_list_item", bundle22), new PrivacySettingsAdapterConfigs("music_collection_item", null), new PrivacySettingsAdapterConfigs("video_view_history_item", bundle32), new PrivacySettingsAdapterConfigs("profile_view_history_item", bundle42), new DisclosureAdapterConfigs(R.string.p96, null, Integer.valueOf(R.raw.icon_block_fill), "//setting/blocklist", null, false, C25936AFw.LJLIL, 50)), LIZIZ2, 2);
        return new TPSCPageBuildConfigs(valueOf, (EnumC69896Rbw) null, C47261Igj.LJJIJIIJI(groupTitleAdapterConfigsArr), 5);
    }
}
