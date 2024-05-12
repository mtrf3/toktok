package com.ss.android.ugc.now.interaction.ui;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.AnonymousClass730;
import X.AnonymousClass731;
import X.AnonymousClass733;
import X.AnonymousClass739;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C177996yh;
import X.C1794072i;
import X.C1795572x;
import X.C1795672y;
import X.C1795772z;
import X.C184077Kh;
import X.C188727au;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C218478hn;
import X.C220488l2;
import X.C221108m2;
import X.C222578oP;
import X.C26338AVi;
import X.C29S;
import X.C2L4;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C45804HyK;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73A;
import X.C73G;
import X.C76800UCe;
import X.C76965UIn;
import X.C77123UOp;
import X.C78926UyI;
import X.C79045V0n;
import X.C7GI;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EF7;
import X.FMX;
import X.InterfaceC1802075k;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SY9;
import X.SYL;
import X.TBT;
import X.TBW;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.now.interaction.CommentListFragmentScope;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.CommentListVM;
import com.ss.android.ugc.now.interaction.assem.IFakeKeyboardInputAssemAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentListFragment extends AbsFragment implements InterfaceC1802075k, KPL, C2L4 {
    public SYL LJLIL;
    public C73305Spp LJLILLLLZI;
    public LinearLayout LJLJI;
    public ViewGroup LJLJJI;
    public TuxTextView LJLJJL;
    public View LJLJJLL;
    public boolean LJLJL;
    public NowFeedMobHierarchyData LJLJLJ;
    public Aweme LJLJLLL;
    public final C214298b3 LJLL;
    public long LJLLI;
    public final C214298b3 LJLLILLLL;
    public C218478hn LJLLJ;
    public Integer LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public Comment LJLZ;
    public String LJZ;
    public int LJZI;
    public final C62822Ol8 LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();

    @Override // X.InterfaceC1802075k
    public final void ch(AnonymousClass733 container) {
        o.LJIIIZ(container, "container");
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1802075k
    public final void setAid(String str) {
    }

    public CommentListFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CommentListVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1413);
        AnonymousClass730 anonymousClass730 = AnonymousClass730.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), anonymousClass730, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), anonymousClass730, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLL = c214298b3;
        this.LJLLI = -1L;
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowKeyboardVM.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ2, 1414);
        AnonymousClass731 anonymousClass731 = AnonymousClass731.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), anonymousClass731, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, c9be)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), anonymousClass731, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLILLLL = c214298b32;
        this.LJLLL = 0;
        this.LJZL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1415));
    }

    @Override // X.InterfaceC1802075k
    public final String Qf() {
        Aweme aweme;
        AwemeStatistics statistics;
        Aweme aweme2;
        AwemeStatistics statistics2;
        long j = 0;
        if (C7GI.LIZJ(this.LJZI)) {
            Aweme aweme3 = this.LJLJLLL;
            if ((aweme3 == null || !C45804HyK.LJJIZ(aweme3)) && (aweme2 = this.LJLJLLL) != null && (statistics2 = aweme2.getStatistics()) != null) {
                j = statistics2.getCommentCount();
            }
            String LJJIIJ = C77123UOp.LJJIIJ(j);
            o.LJIIIIZZ(LJJIIJ, "getDisplayCount(count)");
            return LJJIIJ;
        }
        Aweme aweme4 = this.LJLJLLL;
        if ((aweme4 == null || !C45804HyK.LJJIZ(aweme4)) && (aweme = this.LJLJLLL) != null && (statistics = aweme.getStatistics()) != null) {
            j = statistics.getCommentCount();
        }
        String quantityString = EF7.LIZIZ().getResources().getQuantityString(R.plurals.j_, (int) j, Long.valueOf(j));
        o.LJIIIIZZ(quantityString, "AppContextManager.getApp…     count,\n            )");
        return quantityString;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CommentListFragmentScope.class);
    }

    public final CommentListVM vl() {
        return (CommentListVM) this.LJLL.getValue();
    }

    public final NowKeyboardVM wl() {
        return (NowKeyboardVM) this.LJLLILLLL.getValue();
    }

    @Override // X.InterfaceC1802075k
    public final SY9 LLLI() {
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        SY9 sy9 = new SY9(context, R.raw.icon_bubble_ellipsis_right);
        Integer LJI = C79045V0n.LJI(R.attr.gx, context);
        if (LJI != null) {
            sy9.LJ(LJI.intValue());
        }
        return sy9;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C73A c73a = vl().LJLJLLL;
        c73a.getClass();
        C10K.LIZJ(new AnonymousClass739(c73a, null));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        vl().LJLJLLL.LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r3.LIZ(r0.intValue()) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xl() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.ui.CommentListFragment.xl():void");
    }

    @Override // X.InterfaceC1802075k
    public final RecyclerView LLIIIZ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC1802075k
    public final void LLJLILLLLZIIL(int i) {
        this.LJZI = i;
    }

    @Override // X.InterfaceC1802075k
    public final void nb(NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        IFakeKeyboardInputAssemAbility iFakeKeyboardInputAssemAbility;
        this.LJLJLJ = nowFeedMobHierarchyData;
        View view = getView();
        if (view != null && (iFakeKeyboardInputAssemAbility = (IFakeKeyboardInputAssemAbility) C55096Ljo.LIZ(C55230Lly.LJ(view), IFakeKeyboardInputAssemAbility.class, null)) != null) {
            iFakeKeyboardInputAssemAbility.LLJJIJI(new C73G(this.LJLJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLZ, this.LJLJLJ, this.LJZ, 64));
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1802075k
    public final void setData(Aweme aweme) {
        this.LJLJLLL = aweme;
        this.LJLLL = Integer.valueOf(aweme.getCommentSetting());
    }

    @Override // X.InterfaceC1802075k
    public final void A7(String str, String str2) {
        String str3;
        Integer num;
        String str4;
        Integer num2;
        String str5;
        String str6;
        long j;
        C177996yh.LIZIZ("CommentListFragment", "onCommentPageDismiss");
        Aweme aweme = this.LJLJLLL;
        if (aweme != null) {
            CommentListVM vl = vl();
            vl.LJLJLLL.LJ = false;
            vl.setStateImmediate(new AqS8S0010000_3(false, 41));
            NowKeyboardVM wl = wl();
            wl.getClass();
            wl.setState(new AqS8S0010000_3(false, 9));
            NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LJLJLJ;
            Integer num3 = null;
            if (nowFeedMobHierarchyData != null) {
                str3 = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                str3 = null;
            }
            String aid = aweme.getAid();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            if (author != null) {
                num = Integer.valueOf(author.getFollowStatus());
            } else {
                num = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str4 = nowPostInfo.getNowMediaType();
            } else {
                str4 = null;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJLLI;
            NowFeedMobHierarchyData nowFeedMobHierarchyData2 = this.LJLJLJ;
            if (nowFeedMobHierarchyData2 != null) {
                num2 = nowFeedMobHierarchyData2.isNowClear();
            } else {
                num2 = null;
            }
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str3);
            c188727au.LJIIIZ("group_id", aid);
            c188727au.LJIIIZ("author_id", authorUid);
            c188727au.LJFF(num, "follow_status");
            c188727au.LJIIIZ("action_type", str);
            c188727au.LJIIIZ("now_type", str4);
            c188727au.LJIIIZ("enter_method", str2);
            c188727au.LJ(currentTimeMillis, "duration");
            c188727au.LJFF(num2, "is_now_clear");
            Object LJII = c220488l2.LJII(aweme, c188727au);
            C222578oP.LIZJ(LJII, aweme, null, null, 14);
            C188727au c188727au2 = (C188727au) LJII;
            if (o.LJ(str3, "homepage_nearby")) {
                HashMap<String, String> hashMap = new HashMap<>();
                NearbyFeedServiceImpl.LJJI().LJII(str3, hashMap, aweme, false);
                if (!hashMap.isEmpty()) {
                    c188727au2.LJII(hashMap);
                }
            }
            FMX.LJIIL("close_comment", c188727au2.LIZ);
            if (C45804HyK.LJJJJ(aweme)) {
                NowFeedMobHierarchyData nowFeedMobHierarchyData3 = this.LJLJLJ;
                if (nowFeedMobHierarchyData3 != null) {
                    str5 = nowFeedMobHierarchyData3.getEnterFrom();
                } else {
                    str5 = null;
                }
                NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                if (nowPostInfo2 != null) {
                    str6 = nowPostInfo2.getNowMediaType();
                } else {
                    str6 = null;
                }
                String aid2 = aweme.getAid();
                String authorUid2 = aweme.getAuthorUid();
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    num3 = Integer.valueOf(author2.getFollowStatus());
                }
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    j = statistics.getPlayCount();
                } else {
                    j = 0;
                }
                C1794072i.LIZIZ(str5, "comment", str2, str6, str, aid2, authorUid2, num3, Long.valueOf(j));
            }
            String aid3 = aweme.getAid();
            o.LJIIIIZZ(aid3, "this.aid");
            Map<String, C1795572x> map = C1795672y.LIZ;
            C1795572x c1795572x = (C1795572x) ((LinkedHashMap) map).get(aid3);
            if (c1795572x != null) {
                long j2 = c1795572x.LJ;
                if (j2 != 0) {
                    String str7 = c1795572x.LJFF;
                    if (str7 == null) {
                        str7 = "";
                    }
                    long j3 = c1795572x.LIZIZ;
                    long j4 = j3 - c1795572x.LIZ;
                    long j5 = c1795572x.LIZJ;
                    long j6 = c1795572x.LIZLLL - j3;
                    C188727au c188727au3 = new C188727au();
                    c188727au3.LJI("enter_method", str7);
                    c188727au3.LJ(j4, "to_show_comment_list_duration");
                    c188727au3.LJ(j5 - j3, "to_request_time");
                    c188727au3.LJ(j6, "to_page_show_duration");
                    c188727au3.LJ(j2 - j5, "request_duration");
                    FMX.LJIIL("now_interaction_panel_first_load_android", c188727au3.LIZ);
                    map.remove(aid3);
                }
            }
            this.LJLLI = -1L;
            C73A c73a = vl().LJLJLLL;
            c73a.getClass();
            C10K.LIZJ(new AnonymousClass739(c73a, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x00fe, code lost:
    
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
    
        r7.LJIIIZ(r1, r0);
        r1 = r8.LJII(r4, r7);
        r3 = null;
        X.C222578oP.LIZJ(r1, r4, null, null, 14);
        r1 = (X.C188727au) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0118, code lost:
    
        if (r6 == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        r1.LIZLLL(r6, "music_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        X.FMX.LJIIL("click_comment_button", r1.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (X.C45804HyK.LJJJJ(r4) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
    
        r0 = r17.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        r6 = r0.getEnterFrom();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
    
        r0 = r4.nowPostInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        if (r0 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013a, code lost:
    
        r9 = r0.getNowMediaType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
    
        r10 = r4.getAid();
        r11 = r4.getAuthorUid();
        r0 = r4.getAuthor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
    
        if (r0 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        r12 = java.lang.Integer.valueOf(r0.getFollowStatus());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
    
        r0 = r4.getStatistics();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
    
        if (r0 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015a, code lost:
    
        r0 = r0.getPlayCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
    
        X.C1794072i.LIZJ(r6, "comment", r5, r9, r10, r11, r12, java.lang.Long.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0260, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0264, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0267, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x026a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0166, code lost:
    
        r1 = r4.getAid();
        kotlin.jvm.internal.o.LJIIIIZZ(r1, "this.aid");
        X.C1795672y.LIZ(r1).LIZLLL = java.lang.System.currentTimeMillis();
     */
    @Override // X.InterfaceC1802075k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(X.ActivityC45651qj r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.ui.CommentListFragment.f0(X.1qj, java.lang.String):void");
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SYL syl;
        C73305Spp c73305Spp;
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view3 = getView();
        ViewGroup viewGroup = null;
        if (view3 != null) {
            syl = (SYL) view3.findViewById(R.id.isf);
        } else {
            syl = null;
        }
        this.LJLIL = syl;
        View view4 = getView();
        if (view4 != null) {
            view4.findViewById(R.id.title);
        }
        View view5 = getView();
        if (view5 != null) {
            c73305Spp = (C73305Spp) view5.findViewById(R.id.blt);
        } else {
            c73305Spp = null;
        }
        this.LJLILLLLZI = c73305Spp;
        View view6 = getView();
        if (view6 != null) {
            linearLayout = (LinearLayout) view6.findViewById(R.id.g77);
        } else {
            linearLayout = null;
        }
        this.LJLJI = linearLayout;
        View view7 = getView();
        if (view7 != null) {
            tuxTextView = (TuxTextView) view7.findViewById(R.id.bje);
        } else {
            tuxTextView = null;
        }
        this.LJLJJL = tuxTextView;
        View view8 = getView();
        if (view8 != null) {
            view2 = view8.findViewById(R.id.bk4);
        } else {
            view2 = null;
        }
        this.LJLJJLL = view2;
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 241));
        View view9 = getView();
        if (view9 != null) {
            viewGroup = (ViewGroup) view9.findViewById(R.id.bk_);
        }
        this.LJLJJI = viewGroup;
        if (C1795772z.LIZ(this.LJLJLLL)) {
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                C26338AVi.LJI(linearLayout2, null, null, null, 0, false, 23);
            }
        } else {
            LinearLayout linearLayout3 = this.LJLJI;
            if (linearLayout3 != null) {
                C26338AVi.LJI(linearLayout3, null, null, null, AnonymousClass391.LIZJ(58), false, 23);
            }
        }
        xl();
        C8YN.LJII(this, wl(), new TBT() { // from class: X.70e
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 208), 4);
        CommentListVM vl = vl();
        vl.LJLJLLL.LJ = true;
        vl.setStateImmediate(new AqS8S0010000_3(true, 41));
        NowKeyboardVM wl = wl();
        wl.getClass();
        wl.setState(new AqS8S0010000_3(true, 9));
        this.LJLLI = System.currentTimeMillis();
        if (mo49getActivity() != null) {
            wl().hv0(this.LJLJLLL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bam, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
