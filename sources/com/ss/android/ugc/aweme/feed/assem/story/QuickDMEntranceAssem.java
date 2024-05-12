package com.ss.android.ugc.aweme.feed.assem.story;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C110614Vt;
import X.C16880lQ;
import X.C214348b8;
import X.C221108m2;
import X.C221578mn;
import X.C221598mp;
import X.C221608mq;
import X.C221618mr;
import X.C221628ms;
import X.C221648mu;
import X.C222578oP;
import X.C2304092m;
import X.C240999d1;
import X.C26338AVi;
import X.C2IP;
import X.C2U8;
import X.C32151Nz;
import X.C45804HyK;
import X.C47261Igj;
import X.C4XV;
import X.C51029K0z;
import X.C5H3;
import X.C61328O5c;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C78939UyV;
import X.C8TC;
import X.C8YN;
import X.C95043oC;
import X.C98823uI;
import X.HG3;
import X.InterfaceC109344Qw;
import X.InterfaceC110994Xf;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.InterfaceC98813uH;
import X.O6R;
import X.RBX;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS42S1100000_3;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class QuickDMEntranceAssem extends BaseCellSlotComponent<QuickDMEntranceAssem> implements InterfaceC110994Xf {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final C62822Ol8 LLI;
    public String LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();

    static {
        TBT tbt = new TBT(QuickDMEntranceAssem.class, "sharerInfoVM", "getSharerInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/sharer/VideoExposeSharerInformationVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bia;
    }

    public QuickDMEntranceAssem() {
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoExposeSharerInformationVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 377), null, C221598mp.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C221608mq.INSTANCE);
        this.LLI = C221108m2.LIZIZ(C221618mr.LJLIL);
    }

    @Override // X.InterfaceC110994Xf
    public final void ob() {
        C2U8.LIZ(new C2IP(true, false));
    }

    public final IIMService q4() {
        return (IIMService) this.LLI.getValue();
    }

    public final VideoExposeSharerInformationVM r4() {
        return (VideoExposeSharerInformationVM) this.LLFII.LIZ(this, LLIIII[0]);
    }

    public final void u4() {
        Aweme aweme;
        User author;
        String str;
        ActivityC45651qj LJJIFFI;
        String str2;
        ActivityC45651qj LJJIFFI2;
        String str3;
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        Context context = getContext();
        View view = null;
        if (context != null) {
            str = context.getString(R.string.en6);
        } else {
            str = null;
        }
        String str4 = "";
        if (C2304092m.LIZ()) {
            Context context2 = getContext();
            if (context2 != null && (LJJIFFI2 = C45804HyK.LJJIFFI(context2)) != null) {
                C8TC c8tc = C8TC.LIZIZ;
                FragmentManager supportFragmentManager = LJJIFFI2.getSupportFragmentManager();
                VideoItemParams videoItemParams2 = (VideoItemParams) C51029K0z.LJIILLIIL(this);
                if (videoItemParams2 != null && (str3 = videoItemParams2.mEventType) != null) {
                    str4 = str3;
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
                View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.il7));
                if (view2 == null) {
                    view2 = getContainerView().findViewById(R.id.il7);
                    if (view2 != null) {
                        linkedHashMap.put(Integer.valueOf(R.id.il7), view2);
                    }
                    c8tc.LIZLLL(null, supportFragmentManager, aweme, author, str4, "feed", ((AppCompatTextView) view).getText().toString(), true, null, null);
                }
                view = view2;
                c8tc.LIZLLL(null, supportFragmentManager, aweme, author, str4, "feed", ((AppCompatTextView) view).getText().toString(), true, null, null);
            }
        } else {
            Context context3 = getContext();
            if (context3 != null && (LJJIFFI = C45804HyK.LJJIFFI(context3)) != null) {
                InterfaceC98813uH imChatService = q4().getImChatService();
                FragmentManager supportFragmentManager2 = LJJIFFI.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager2, "it.supportFragmentManager");
                VideoItemParams videoItemParams3 = (VideoItemParams) C51029K0z.LJIILLIIL(this);
                if (videoItemParams3 != null && (str2 = videoItemParams3.mEventType) != null) {
                    str4 = str2;
                }
                C98823uI.LIZIZ(imChatService, supportFragmentManager2, author, aweme, str4, "feed", true, str, this, 64);
            }
        }
        C222578oP.LJIIIZ(new C221648mu("feed", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAid(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAuthorUid(), String.valueOf(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getAuthor().getFollowStatus())));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        item.getAweme();
        if (!o.LJ(item.mEventType, this.LLIFFJFJJ)) {
            this.LLIFFJFJJ = item.mEventType;
        }
    }

    @Override // X.InterfaceC110994Xf
    public final void Wb(String str) {
        C2U8.LIZ(new C2IP(false, false));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        View quick_reply_box = view.findViewById(R.id.il5);
        o.LJIIIIZZ(quick_reply_box, "quick_reply_box");
        int i = 0;
        C26338AVi.LJI(quick_reply_box, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, false, 29);
        View findViewById = view.findViewById(R.id.il5);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(24);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dm);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        findViewById.setBackground(c110614Vt.LIZ(context));
        if (C2304092m.LIZ()) {
            TextView textView = (TextView) view.findViewById(R.id.il7);
            Context context2 = getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.amt);
            } else {
                str2 = null;
            }
            textView.setHint(str2);
        } else {
            TextView textView2 = (TextView) view.findViewById(R.id.il7);
            Context context3 = getContext();
            if (context3 != null) {
                str = context3.getString(R.string.el1);
            } else {
                str = null;
            }
            textView2.setHint(str);
        }
        C71799SFv initView$lambda$4 = (C71799SFv) view.findViewById(R.id.il6);
        o.LJIIIIZZ(initView$lambda$4, "initView$lambda$4");
        C71799SFv.LJIIJ(initView$lambda$4, C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()), null, false, null, 126);
        C16880lQ.LJJIL(initView$lambda$4, new ACListenerS23S0100000_3(this, 233));
        C16880lQ.LJIJ((RelativeLayout) view.findViewById(R.id.il5), new ACListenerS23S0100000_3(this, 234));
        if (C95043oC.LIZIZ && !C2304092m.LIZ()) {
            Iterator<String> it = C4XV.LIZ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str3 = next;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                break;
                            }
                            Context context4 = getContext();
                            if (context4 != null) {
                                float LJJJJL = C63081OpJ.LJJJJL(context4);
                                Context context5 = getContext();
                                if (context5 != null && C32151Nz.LJJIJIIJI(context5, LJJJJL) <= 360) {
                                    view.findViewById(R.id.bxq).setVisibility(8);
                                    break;
                                }
                            }
                            ((TextView) view.findViewById(R.id.ctw)).setText(str3);
                            ((TuxTextView) view.findViewById(R.id.ctw)).LJJJ(22.0f);
                            C16880lQ.LJIILJJIL((FrameLayout) view.findViewById(R.id.bxq), new ACListenerS42S1100000_3(this, str3, 8));
                        } else {
                            ((TextView) view.findViewById(R.id.ctv)).setText(str3);
                            ((TuxTextView) view.findViewById(R.id.ctv)).LJJJ(22.0f);
                            C16880lQ.LJIILJJIL((FrameLayout) view.findViewById(R.id.bxp), new ACListenerS42S1100000_3(this, str3, 7));
                        }
                    } else {
                        ((TextView) view.findViewById(R.id.ctu)).setText(str3);
                        ((TuxTextView) view.findViewById(R.id.ctu)).LJJJ(22.0f);
                        C16880lQ.LJIILJJIL((FrameLayout) view.findViewById(R.id.bxo), new ACListenerS42S1100000_3(this, str3, 6));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8mo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLLILLLL;
            }
        }, null, C221578mn.LJLIL, 6);
    }

    public final void z4(String str) {
        User author;
        String str2;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        InterfaceC109344Qw shareService = q4().getShareService();
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
        if (videoItemParams == null || (str2 = videoItemParams.mEventType) == null) {
            str2 = "";
        }
        shareService.LJIJI(str, author, aweme, str2, true, "feed", C221628ms.LJLIL);
    }
}
