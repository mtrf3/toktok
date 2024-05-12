package X;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InlineLink;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lfg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54840Lfg implements InterfaceC48038ItG, InterfaceC57325Mef, InterfaceC62484Ofg, C0K7, InterfaceC39656FhM, InterfaceC54844Lfk, InterfaceC54858Lfy {
    public static final C54840Lfg LJLIL = new C54840Lfg();
    public static final C54840Lfg LJLILLLLZI = new C54840Lfg();
    public static C54840Lfg LJLJI;

    @Override // X.InterfaceC39656FhM
    public void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        LJIJI(classLoader, set);
    }

    @Override // X.InterfaceC62484Ofg
    public void LJII() {
    }

    @Override // X.InterfaceC62484Ofg
    public boolean LJIIZILJ() {
        INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createINetworkStandardUIServicebyMonsterPlugin, "get().getService(INetwor…ardUIService::class.java)");
        return createINetworkStandardUIServicebyMonsterPlugin.getNetworkStateForSharePanel() instanceof InterfaceC84473Tf;
    }

    @Override // X.InterfaceC62484Ofg
    public void LJIJ() {
    }

    public boolean LJIJJLI() {
        return false;
    }

    public boolean LJIL() {
        return false;
    }

    public String LJJLIIIJLJLI() {
        return "";
    }

    public long LJJLIL() {
        return -1L;
    }

    public boolean LJLI() {
        return false;
    }

    public static C54840Lfg LJJ() {
        C54840Lfg c54840Lfg = LJLJI;
        if (c54840Lfg != null) {
            return c54840Lfg;
        }
        return new C54840Lfg(0);
    }

    @Override // X.InterfaceC62484Ofg
    public boolean LJIILJJIL() {
        return o.LJ(EF7.LJIILIIL, "local_test");
    }

    public static int LJJI() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "audio_codec_buffer_stack_size", true);
    }

    public static int LJJIFFI() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "audio_filter_stack_size", true);
    }

    public static int LJJIII() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "disable_player_logv2_async", true);
    }

    public static int LJJIIJ() {
        if (C88408Ymq.LIZIZ()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "enable_player_log", true);
    }

    public static int LJJIIJZLJL() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 1, "player_dash_403_fallback", true);
    }

    public static int LJJIIZ() {
        if (C88408Ymq.LIZJ()) {
            return 409600;
        }
        return C00F.LIZ(31744, 409600, "player_dash_audio_range", true);
    }

    public static int LJJIIZI() {
        if (C88408Ymq.LIZJ()) {
            return 10000;
        }
        return C00F.LIZ(31744, 10000, "player_dash_audio_time_range", true);
    }

    public static int LJJIJ() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_dash_hijack_backup_dns", true);
    }

    public static int LJJIJIIJI() {
        if (C88408Ymq.LIZJ()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_dash_enable_hijack", true);
    }

    public static int LJJIJIIJIL() {
        if (C88408Ymq.LIZJ()) {
            return 2;
        }
        return C00F.LIZ(31744, 2, "player_dash_hijack_main_dns", true);
    }

    public static int LJJIJIL() {
        if (C88408Ymq.LIZJ()) {
            return 2;
        }
        return C00F.LIZ(31744, 0, "player_dash_range_mode", true);
    }

    public static int LJJIJL() {
        if (C88408Ymq.LIZJ()) {
            return 1048576;
        }
        return C00F.LIZ(31744, 1048576, "player_dash_video_range", true);
    }

    public static int LJJIJLIJ() {
        if (C88408Ymq.LIZJ()) {
            return 5000;
        }
        return C00F.LIZ(31744, 5000, "player_dash_video_time_range", true);
    }

    public static int LJJIL() {
        if (C88408Ymq.LIZLLL()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_enable_native_thread_pool", true);
    }

    public static int LJJIZ() {
        if (C88408Ymq.LIZLLL()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_enable_seek_end", true);
    }

    public static int LJJJ() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_mp4_bash_range_mode", true);
    }

    public static int LJJJI() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_mp4_bash_video_range", true);
    }

    public static int LJJJIL() {
        if (C88408Ymq.LIZJ()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_skip_find_stream_info", true);
    }

    public static int LJJJJ() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_enable_stop_async", true);
    }

    public static int LJJJJI() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 2, "player_dash_read_mode", true);
    }

    public static int LJJJJIZL() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_enable_bash_mp4", true);
    }

    public static int LJJJJJ() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_enable_debug_log", true);
    }

    public static int LJJJJJL() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_enable_hardware_decode_skip_nonref", true);
    }

    public static int LJJJJL() {
        if (C88408Ymq.LIZLLL()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_engine_use_ttnet", true);
    }

    public static int LJJJJLI() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_force_close_codec", false);
    }

    public static int LJJJJLL() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_mp4_bash_read_mode", true);
    }

    public static int LJJJJZ() {
        if (C88408Ymq.LIZLLL()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_use_v2_report_block", true);
    }

    public static int LJJJJZI() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_vendor_frc_level", true);
    }

    public static int LJJJLIIL() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_enable_heart_beat", true);
    }

    public static int LJJJLL() {
        if (C88408Ymq.LIZLLL()) {
            return 300;
        }
        return C00F.LIZ(31744, 300, "player_enable_heart_beat_interval", true);
    }

    public static int LJJJLZIJ() {
        if (C88408Ymq.LIZIZ()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_enable_opt_subload_time", true);
    }

    public static int LJJJZ() {
        if (C88408Ymq.LIZIZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_feed_packet_unitil_empty", true);
    }

    public static int LJJL() {
        if (C88408Ymq.LIZIZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "file_play_no_buffering", true);
    }

    public static int LJJLI() {
        if (C88408Ymq.LIZIZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_mtkhip_skip_adaptive", true);
    }

    public static int LJJLIIIIJ() {
        if (C88408Ymq.LIZIZ()) {
            return 5000;
        }
        return C00F.LIZ(31744, 5000, "player_max_buffer_time", true);
    }

    public static int LJJLIIIJ() {
        if (C88408Ymq.LIZIZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "no_buffering_update", true);
    }

    public static int LJJLIIIJILLIZJL() {
        if (C88408Ymq.LIZLLL()) {
            return 60;
        }
        return C00F.LIZ(31744, 60, "player_option_abr_cache", true);
    }

    public static int LJJLIIIJJI() {
        if (C88408Ymq.LIZIZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_position_update_interval", true);
    }

    public static int LJJLIIIJJIZ() {
        if (C88408Ymq.LIZIZ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_pre_render_buffering_update", true);
    }

    public static int LJJLIIIJL() {
        if (C88408Ymq.LIZIZ()) {
            return 90;
        }
        return C00F.LIZ(31744, 90, "player_pre_render_buffering_update_percentage", true);
    }

    public static int LJJLIIJ() {
        if (C88408Ymq.LIZJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "ttplayer_is_ipc", true);
    }

    public static int LJJLJ() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "videocache_loader_type", true);
    }

    public static int LJJLJLI() {
        if (C88408Ymq.LIZLLL()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "video_codec_buffer_stack_size", true);
    }

    @Override // X.InterfaceC62484Ofg
    public Activity LIZ() {
        return C84763XOl.LJIIIIZZ();
    }

    @Override // X.InterfaceC62484Ofg
    public T06 LIZIZ() {
        return C84763XOl.LIZLLL();
    }

    public long LJJII() {
        return System.currentTimeMillis();
    }

    @Override // X.InterfaceC62484Ofg
    public Context getApplicationContext() {
        return EF7.LIZIZ();
    }

    public /* synthetic */ C54840Lfg() {
    }

    @Override // X.InterfaceC62484Ofg
    public void LJFF() {
    }

    @Override // X.InterfaceC62484Ofg
    public void isDebug() {
    }

    public /* synthetic */ C54840Lfg(int i) {
    }

    public static final boolean LJJLL(AnonymousClass852 anonymousClass852) {
        if (anonymousClass852 instanceof InterfaceC2057885u) {
            return true;
        }
        if (!(anonymousClass852 instanceof C85E)) {
            return false;
        }
        List<AnonymousClass852<C85M>> list = ((C85E) anonymousClass852).LJIIIIZZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AnonymousClass852<C85M> anonymousClass8522 : list) {
                if ((anonymousClass8522 instanceof C85E) && LJJLL(anonymousClass8522)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJZ(Aweme aweme) {
        VideoControl videoControl;
        if (ONM.LJI(aweme) || C72083SQt.LJLI(aweme) || C72083SQt.LJL(aweme) || C72083SQt.LJLIL(aweme)) {
            return false;
        }
        if ((aweme != null && ((aweme.getAwemeRawAd() != null && aweme.isAd()) || aweme.isLive())) || C224868s6.LIZLLL(aweme)) {
            return false;
        }
        if (!LAI.LIZ() && (LAI.LIZ() || aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.draftProgressBar == 0)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJZZI(Aweme aweme) {
        VideoControl videoControl;
        if (aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.showProgressBar == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJJZZIII(Fragment fragment) {
        if (fragment instanceof InterfaceC40408FtU) {
            InterfaceC40408FtU interfaceC40408FtU = (InterfaceC40408FtU) fragment;
            if (o.LJ("FeedFollowFragment", interfaceC40408FtU.og()) || o.LJ("FeedRecommendFragment", interfaceC40408FtU.og()) || o.LJ("FeedLearnFragment", interfaceC40408FtU.og()) || o.LJ("FeedPopularFragment", interfaceC40408FtU.og()) || o.LJ("NearByFragment", interfaceC40408FtU.og()) || o.LJ("SocialFriendsFeedFragment", interfaceC40408FtU.og()) || LO7.LIZIZ.G1(interfaceC40408FtU.og())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.o.LJ("homepage_nearby", r2) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJL(java.lang.String r2) {
        /*
            java.lang.String r0 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "homepage_follow"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "homepage_learn"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "homepage_friends"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "homepage_popular"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L3c
            X.LO7 r1 = X.LO7.LIZIZ
            if (r2 != 0) goto L48
            java.lang.String r0 = ""
        L2e:
            boolean r0 = r1.J1(r0)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "homepage_nearby"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L46
        L3c:
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            boolean r0 = r0 instanceof X.InterfaceC55058LjC
            if (r0 == 0) goto L46
            r0 = 1
        L45:
            return r0
        L46:
            r0 = 0
            goto L45
        L48:
            r0 = r2
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54840Lfg.LJL(java.lang.String):boolean");
    }

    @Override // X.InterfaceC62484Ofg
    public int LIZJ(C25600zU c25600zU) {
        if (AnonymousClass636.LJIILJJIL(c25600zU)) {
            return R.style.ux;
        }
        return R.style.ul;
    }

    @Override // X.InterfaceC62484Ofg
    public void LJ(Activity activity) {
        INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createINetworkStandardUIServicebyMonsterPlugin, "get().getService(INetwor…ardUIService::class.java)");
        createINetworkStandardUIServicebyMonsterPlugin.showNetworkToast(activity, createINetworkStandardUIServicebyMonsterPlugin.getNetworkStateForSharePanel(), "");
    }

    @Override // X.InterfaceC57325Mef
    public MusicDetail LJI(Object obj) {
        C54843Lfj a = (C54843Lfj) obj;
        o.LJIIIZ(a, "a");
        return a.LIZ;
    }

    @Override // X.InterfaceC62484Ofg
    public boolean LJIIIIZZ(String str) {
        if (o.LJ(str, "aweme") || o.LJ(str, "aweme_photo") || o.LJ(str, "now_post") || o.LJ(str, "now_video") || o.LJ(str, "now_post_memory")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62484Ofg
    public boolean LJIIIZ(BaseSharePackage baseSharePackage) {
        String str;
        String str2 = null;
        if (baseSharePackage != null) {
            str = baseSharePackage.itemType;
        } else {
            str = null;
        }
        if (o.LJ(str, "live") && o.LJ(baseSharePackage.extras.getString("enter_from"), "feed_live_long_press")) {
            return true;
        }
        ArrayList arrayList = (ArrayList) C109254Qn.LIZJ.getValue();
        if (baseSharePackage != null) {
            str2 = baseSharePackage.itemType;
        }
        return ORZ.LJLJJI(str2, arrayList);
    }

    @Override // X.InterfaceC62484Ofg
    public boolean LJIIJ(BaseSharePackage baseSharePackage) {
        return C109254Qn.LIZIZ(baseSharePackage);
    }

    @Override // X.InterfaceC62484Ofg
    public String LJIIJJI(BaseSharePackage baseSharePackage) {
        String str;
        int num;
        java.util.Map<String, EnumC62617Ohp> map = C62616Oho.LIZ;
        if (baseSharePackage == null || (str = baseSharePackage.itemType) == null) {
            str = "";
        }
        EnumC62617Ohp enumC62617Ohp = map.get(str);
        if (enumC62617Ohp != null) {
            num = enumC62617Ohp.getNum();
        } else {
            num = EnumC62617Ohp.SHARE_DEFAULT.getNum();
        }
        return String.valueOf(num);
    }

    @Override // X.InterfaceC62484Ofg
    public boolean LJIIL(BaseSharePackage baseSharePackage) {
        String str;
        if (baseSharePackage != null) {
            str = baseSharePackage.itemType;
        } else {
            str = null;
        }
        if (!o.LJ(str, "aweme")) {
            return false;
        }
        if (baseSharePackage != null && baseSharePackage.LJIIJ()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57325Mef
    public Object LJIILIIL(Object obj) {
        MusicDetail b = (MusicDetail) obj;
        o.LJIIIZ(b, "b");
        return new C54843Lfj(b);
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object list) {
        o.LJIIIZ(list, "list");
        return new OSZ(list, C73536StY.LJLIL);
    }

    @Override // X.InterfaceC54858Lfy
    public /* bridge */ /* synthetic */ void run(Object obj) {
    }

    public static void LJIJI(ClassLoader classLoader, java.util.Set set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            if (valueOf.length() != 0) {
                "Adding native library parent directory: ".concat(valueOf);
            }
            hashSet.add(file.getParentFile());
        }
        C40657FxV LIZLLL = C40654FxS.LIZLLL(File.class, "nativeLibraryDirectories", new C40657FxV(Object.class, classLoader, C40654FxS.LJIIIZ(classLoader, "pathList")).LIZ());
        hashSet.removeAll(Arrays.asList((Object[]) LIZLLL.LIZ()));
        synchronized (C37111EhP.class) {
            hashSet.size();
            LIZLLL.LIZLLL(hashSet);
        }
    }

    public static final void LJLIIL(int i, View view) {
        o.LJIIIZ(view, "<this>");
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static Spanned LJJLIIIJLLLLLLLZ(TextWithInlineLink textWithInlineLink, Context context, C2TV c2tv, int i) {
        C72062SPy styledTuxLinkText;
        if ((i & 2) != 0) {
            styledTuxLinkText = new C72062SPy();
            styledTuxLinkText.LJ(1);
            styledTuxLinkText.LIZ = false;
            styledTuxLinkText.LIZIZ(43);
        } else {
            styledTuxLinkText = null;
        }
        if ((i & 4) != 0) {
            c2tv = null;
        }
        o.LJIIIZ(context, "context");
        o.LJIIIZ(styledTuxLinkText, "styledTuxLinkText");
        ArrayList arrayList = new ArrayList();
        List<InlineLink> links = textWithInlineLink.getLinks();
        if (links != null) {
            for (InlineLink inlineLink : links) {
                styledTuxLinkText.LIZLLL(inlineLink.getText());
                styledTuxLinkText.LJFF = new AqS98S0300000_9(context, (Context) inlineLink, (InlineLink) c2tv, (InterfaceC88472Yns<? super String, C76800UCe>) 22);
                arrayList.add(styledTuxLinkText.LIZ(context));
            }
        }
        String text = textWithInlineLink.getText();
        if (text == null) {
            text = "";
        }
        Spannable[] spannableArr = (Spannable[]) arrayList.toArray(new Spannable[0]);
        return C8G2.LIZ(text, (Spannable[]) Arrays.copyOf(spannableArr, spannableArr.length));
    }

    public static final void LJLIIIL(AnonymousClass852 anonymousClass852, int i, int i2, InterfaceC88472Yns interfaceC88472Yns) {
        TextExtraStruct textExtraStruct;
        List<Object> list = anonymousClass852.LJII;
        list.clear();
        C85M c85m = anonymousClass852.LJI;
        if (c85m != null) {
            textExtraStruct = c85m.LIZ;
        } else {
            textExtraStruct = null;
        }
        C2055484w c2055484w = new C2055484w(0.75f, i, textExtraStruct);
        c2055484w.LJLJJI = interfaceC88472Yns;
        list.add(c2055484w);
        list.add(new T5U(i2, true));
    }

    @Override // X.InterfaceC39656FhM
    public boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return LJIJJ(classLoader, file, file2, z, new C46104I7o(), "zip", new C61576OEq());
    }

    public static final void LJLIL(View view, int i, int i2, int i3, int i4) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (o.LJ(layoutParams, layoutParams2)) {
            layoutParams.width = i2;
            layoutParams.height = i;
            layoutParams2.gravity = i4;
            layoutParams2.bottomMargin = i3;
        } else {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            if (o.LJ(layoutParams, layoutParams3)) {
                layoutParams.width = i2;
                layoutParams.height = i;
                if ((i4 & 80) != 0) {
                    layoutParams3.addRule(12);
                }
                if ((i4 & 1) != 0) {
                    layoutParams3.addRule(14);
                }
                layoutParams2.bottomMargin = i3;
            } else {
                layoutParams.width = i2;
                layoutParams.height = i;
                layoutParams2.bottomMargin = i3;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static boolean LJIJJ(ClassLoader classLoader, File file, File file2, boolean z, ORL orl, String str, InterfaceC54842Lfi interfaceC54842Lfi) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object LIZ = new C40657FxV(Object.class, classLoader, C40654FxS.LJIIIZ(classLoader, "pathList")).LIZ();
        C40657FxV LIZLLL = C40654FxS.LIZLLL(Object.class, "dexElements", LIZ);
        List asList = Arrays.asList((Object[]) LIZLLL.LIZ());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add(new C40657FxV(File.class, obj, C40654FxS.LJIIIZ(obj, str)).LIZ());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !interfaceC54842Lfi.LIZ(LIZ, file2, file)) {
            String valueOf = String.valueOf(file2.getPath());
            if (valueOf.length() != 0) {
                "Should be optimized ".concat(valueOf);
            }
            return false;
        }
        LIZLLL.LIZJ(Arrays.asList(orl.LJFF(LIZ, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        C39658FhO c39658FhO = new C39658FhO("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C36662EaA.LIZ(c39658FhO, (Throwable) ListProtector.get(arrayList, i));
        }
        C40654FxS.LIZLLL(IOException.class, "dexElementsSuppressedExceptions", LIZ).LIZJ(arrayList);
        throw c39658FhO;
    }
}
