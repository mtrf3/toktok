package X;

import Y.ACListenerS29S0100000_9;
import Y.AObserverS65S0300000_4;
import Y.IDComparatorS37S0000000_9;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notification.view.GuideOutPushSwitchCell;
import com.ss.android.ugc.aweme.notification.vm.GuideUserSwitchVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.McD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC57173McD extends LinearLayout implements View.OnClickListener, InterfaceC80183Cs {
    public final GuideOutPushParam LJLIL;
    public final java.util.Set<String> LJLILLLLZI;
    public C106784Ha LJLJI;
    public C72433Sbl LJLJJI;
    public C72433Sbl LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public TuxIconView LJLJLLL;
    public TuxIconView LJLL;
    public TuxTextView LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public PushSettings LJLZ;
    public int LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public List<String> LL;
    public final java.util.Map<Integer, View> LLD;

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LLD;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC80183Cs
    public final void Y8(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public final void LIZLLL() {
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", this.LJLIL.enterFrom);
        c188727au.LJI("trigger", this.LJLIL.trigger);
        c188727au.LJI("to_status", "on");
        LIZJ(c188727au, this.LJZL);
        FMX.LJIIL("click_push_permission", c188727au.LIZ);
    }

    public final List<String> getInteractionItems() {
        List<String> list = this.LL;
        if (list != null) {
            return list;
        }
        o.LJIJI("interactionItems");
        throw null;
    }

    private final void setSettingList(PushSettings pushSettings) {
        int i;
        this.LJLZ = pushSettings;
        ArrayList arrayList = new ArrayList();
        if (pushSettings.diggPush == 0) {
            String string = getContext().getString(R.string.r0v);
            o.LJIIIIZZ(string, "context.getString(R.stri…push_notifications_likes)");
            this.LJLILLLLZI.add("digg_push");
            arrayList.add(new C57175McF(this.LJLIL, string, "digg_push"));
        }
        if (pushSettings.commentPush == 0) {
            String string2 = getContext().getString(R.string.r0r);
            o.LJIIIIZZ(string2, "context.getString(R.stri…h_notifications_comments)");
            this.LJLILLLLZI.add("comment_push");
            arrayList.add(new C57175McF(this.LJLIL, string2, "comment_push"));
        }
        if (pushSettings.followPush == 0) {
            String string3 = getContext().getString(R.string.r0t);
            o.LJIIIIZZ(string3, "context.getString(R.stri…_notifications_followers)");
            this.LJLILLLLZI.add("follow_push");
            arrayList.add(new C57175McF(this.LJLIL, string3, "follow_push"));
        }
        if (pushSettings.mentionPush == 0) {
            Context context = getContext();
            int LIZIZ = C7F0.LIZIZ();
            if (1 <= LIZIZ && LIZIZ < 5) {
                i = R.string.i2n;
            } else {
                i = R.string.r0y;
            }
            String string4 = context.getString(i);
            o.LJIIIIZZ(string4, "context.getString(if (ha…h_notifications_mentions)");
            this.LJLILLLLZI.add("mention_push");
            arrayList.add(new C57175McF(this.LJLIL, string4, "mention_push"));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            C106784Ha c106784Ha = this.LJLJI;
            if (c106784Ha != null) {
                c106784Ha.getState().LJFF();
                C106784Ha c106784Ha2 = this.LJLJI;
                if (c106784Ha2 != null) {
                    c106784Ha2.getState().LJ(arrayList2);
                    return;
                } else {
                    o.LJIJI("powerList");
                    throw null;
                }
            }
            o.LJIJI("powerList");
            throw null;
        }
    }

    @Override // X.InterfaceC80183Cs
    public final void LIZ(List<IMContact> list) {
        int size = ((ArrayList) list).size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            IMContact iMContact = (IMContact) ORZ.LJLLLLLL(i, list);
            if (iMContact instanceof IMUser) {
                if (!z) {
                    C72433Sbl c72433Sbl = this.LJLJJI;
                    if (c72433Sbl != null) {
                        C78765Uvh.LJFF(c72433Sbl, iMContact.getDisplayAvatar());
                        z = true;
                    } else {
                        o.LJIJI("headAvatar1");
                        throw null;
                    }
                } else {
                    C72433Sbl c72433Sbl2 = this.LJLJJL;
                    if (c72433Sbl2 != null) {
                        C78765Uvh.LJFF(c72433Sbl2, iMContact.getDisplayAvatar());
                        return;
                    } else {
                        o.LJIJI("headAvatar2");
                        throw null;
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        if (v.getContext() == null) {
            return;
        }
        int id = v.getId();
        if (id == R.id.b20) {
            String str = this.LJLIL.panelType;
            switch (str.hashCode()) {
                case -1039745817:
                    if (str.equals("normal")) {
                        C40322Fs6.LIZLLL(getContext());
                        break;
                    }
                    break;
                case -868304044:
                    if (str.equals("toggle")) {
                        Iterator<String> it = this.LJLILLLLZI.iterator();
                        while (it.hasNext()) {
                            AbstractC73638SvC.LJI(new C57177McH(it.next())).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new InterfaceC64592gB() { // from class: X.9F5
                                @Override // X.InterfaceC64592gB
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                }
                            }, new II2());
                        }
                        break;
                    }
                    break;
                case -600094315:
                    if (str.equals("friends")) {
                        C40322Fs6.LIZLLL(getContext());
                        AbstractC73638SvC.LJI(new C57176McG(this)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(C57178McI.LJLIL, C57180McK.LJLIL);
                        break;
                    }
                    break;
                case 1844104722:
                    if (str.equals("interaction")) {
                        C40322Fs6.LIZLLL(getContext());
                        break;
                    }
                    break;
            }
            ASQ.LIZLLL(this, C57183McN.LIZ);
            return;
        }
        if (id == R.id.b1z) {
            ASQ.LIZLLL(this, ASX.LIZ);
            return;
        }
        String str2 = "1";
        if (id == R.id.c9d) {
            boolean z = !this.LJLLLL;
            this.LJLLLL = z;
            this.LJLLLLLL = true;
            if (z) {
                TuxTextView tuxTextView = this.LJLLI;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                } else {
                    o.LJIJI("panelDesc");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView2 = this.LJLLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                } else {
                    o.LJIJI("panelDesc");
                    throw null;
                }
            }
            if (!this.LJLLLL) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LJFF(this, "expand_push_description", str2, null, null, 12);
            return;
        }
        if (id == R.id.dog) {
            ((C63044Ooi) LIZIZ(R.id.d0l)).setChecked(false);
            this.LJZ = 1;
            if (!this.LJLLLLLL) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LJFF(this, "change_push_scope_permission", str2, null, "friends", 4);
            return;
        }
        if (id == R.id.d0l) {
            ((C63044Ooi) LIZIZ(R.id.dog)).setChecked(false);
            this.LJZ = 0;
            if (!this.LJLLLLLL) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LJFF(this, "change_push_scope_permission", str2, null, "everyone", 4);
            return;
        }
        if (id == R.id.b6w) {
            if (this.LJZL) {
                return;
            }
            ((C63044Ooi) LIZIZ(R.id.a0t)).setChecked(false);
            this.LJZL = true;
            LIZLLL();
            return;
        }
        if (id == R.id.a0t) {
            if (!this.LJZL) {
                return;
            }
            ((C63044Ooi) LIZIZ(R.id.b6w)).setChecked(false);
            this.LJZL = false;
            LIZLLL();
            return;
        }
        if (id == R.id.b6t) {
            if (LIZIZ(R.id.b6s).getVisibility() == 8) {
                LIZIZ(R.id.b6s).setVisibility(0);
                LJ("1", true);
            } else {
                LIZIZ(R.id.b6s).setVisibility(8);
                LJ(CardStruct.IStatusCode.DEFAULT, true);
            }
            LIZIZ(R.id.a0r).setVisibility(8);
            return;
        }
        if (id != R.id.a0s) {
            return;
        }
        if (LIZIZ(R.id.a0r).getVisibility() == 8) {
            LIZIZ(R.id.a0r).setVisibility(0);
            LJ("1", false);
        } else {
            LIZIZ(R.id.a0r).setVisibility(8);
            LJ(CardStruct.IStatusCode.DEFAULT, false);
        }
        LIZIZ(R.id.b6s).setVisibility(8);
    }

    public final void setData(List<C57175McF> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C57175McF c57175McF : list) {
            arrayList.add(new C57175McF(c57175McF.LJLIL, c57175McF.LJLILLLLZI, c57175McF.LJLJI));
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        C106784Ha c106784Ha = this.LJLJI;
        if (c106784Ha != null) {
            c106784Ha.getState().LJFF();
            C106784Ha c106784Ha2 = this.LJLJI;
            if (c106784Ha2 != null) {
                c106784Ha2.getState().LJ(arrayList);
                return;
            } else {
                o.LJIJI("powerList");
                throw null;
            }
        }
        o.LJIJI("powerList");
        throw null;
    }

    public final void setInteractionItems(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LL = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC57173McD(Context context, GuideOutPushParam param) {
        super(context, null, 0);
        String str;
        String str2;
        List<String> urlList;
        List<String> urlList2;
        String str3;
        List<String> urlList3;
        LifecycleOwner LIZIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        this.LLD = new LinkedHashMap();
        this.LJLIL = param;
        this.LJLILLLLZI = new LinkedHashSet();
        this.LJZ = 1;
        this.LJZL = true;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.rv, C16880lQ.LLZIL(getContext()), this);
        SY4 sy4 = (SY4) LLLZIIL.findViewById(R.id.b20);
        C16880lQ.LJJIZ((SY4) LIZIZ(R.id.b1z), this);
        C16880lQ.LJJIZ((SY4) LIZIZ(R.id.b20), this);
        C16880lQ.LJJJJ((C63044Ooi) LIZIZ(R.id.dog), this);
        C16880lQ.LJJJJ((C63044Ooi) LIZIZ(R.id.d0l), this);
        C16880lQ.LJJJJ((C63044Ooi) LIZIZ(R.id.a0t), this);
        C16880lQ.LJJJ((TuxIconView) LIZIZ(R.id.a0s), this);
        C16880lQ.LJJJJ((C63044Ooi) LIZIZ(R.id.b6w), this);
        C16880lQ.LJJJ((TuxIconView) LIZIZ(R.id.b6t), this);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.rx, null, false);
        TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.c9d);
        C16880lQ.LJJJ(tuxIconView, this);
        View findViewById = LLLLIILL.findViewById(R.id.e3f);
        o.LJIIIIZZ(findViewById, "userPanelView.findViewById(R.id.head_user1)");
        this.LJLJJI = (C72433Sbl) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.e3g);
        o.LJIIIIZZ(findViewById2, "userPanelView.findViewById(R.id.head_user2)");
        this.LJLJJL = (C72433Sbl) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.n00);
        o.LJIIIIZZ(findViewById3, "userPanelView.findViewBy…R.id.user_panel_layout_2)");
        this.LJLJJLL = findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.e3d);
        o.LJIIIIZZ(findViewById4, "userPanelView.findViewById(R.id.head_tt_icon)");
        this.LJLJL = findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.e3e);
        o.LJIIIIZZ(findViewById5, "userPanelView.findViewBy…(R.id.head_tt_icon_small)");
        this.LJLJLJ = findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.myv);
        o.LJIIIIZZ(findViewById6, "userPanelView.findViewById(R.id.user_gender_1)");
        this.LJLJLLL = (TuxIconView) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.myw);
        o.LJIIIIZZ(findViewById7, "userPanelView.findViewById(R.id.user_gender_2)");
        this.LJLL = (TuxIconView) findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.mzx);
        o.LJIIIIZZ(findViewById8, "userPanelView.findViewBy…R.id.user_panel_backgrd1)");
        this.LJLLJ = findViewById8;
        View findViewById9 = LLLLIILL.findViewById(R.id.aey);
        o.LJIIIIZZ(findViewById9, "userPanelView.findViewById(R.id.back_panel)");
        this.LJLLILLLL = findViewById9;
        TuxIconView tuxIconView2 = (TuxIconView) LLLLIILL.findViewById(R.id.bfw);
        TextView panelTitle = (TextView) LLLLIILL.findViewById(R.id.e1n);
        View findViewById10 = LLLLIILL.findViewById(R.id.e1k);
        o.LJIIIIZZ(findViewById10, "userPanelView.findViewBy…d.guide_user_description)");
        this.LJLLI = (TuxTextView) findViewById10;
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.e1m);
        View findViewById11 = LLLZIIL.findViewById(R.id.em1);
        o.LJIIIIZZ(findViewById11, "rootView.findViewById(R.…fo_panel_and_switch_list)");
        this.LJLJI = (C106784Ha) findViewById11;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
        if (LJJIFFI != null && (LIZIZ = C57434MgQ.LIZIZ(LJJIFFI)) != null) {
            C106784Ha c106784Ha = this.LJLJI;
            if (c106784Ha != null) {
                c106784Ha.setLifecycleOwner(LIZIZ);
            } else {
                o.LJIJI("powerList");
                throw null;
            }
        }
        C106784Ha c106784Ha2 = this.LJLJI;
        if (c106784Ha2 != null) {
            c106784Ha2.LLLF.LJZL(GuideOutPushSwitchCell.class);
            C106784Ha c106784Ha3 = this.LJLJI;
            if (c106784Ha3 != null) {
                c106784Ha3.LJLJL(0, LLLLIILL);
                if (o.LJ(param.panelType, "interaction")) {
                    if (o.LJ(param.trigger, "follow")) {
                        List LLILII = ORZ.LLILII(new IDComparatorS37S0000000_9(4), IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIILLIIL());
                        String str4 = param.avatar;
                        if (str4 != null) {
                            C72433Sbl c72433Sbl = this.LJLJJI;
                            if (c72433Sbl != null) {
                                C78765Uvh.LJIIIZ(c72433Sbl, str4, -1, -1);
                                if (true ^ LLILII.isEmpty()) {
                                    C72433Sbl c72433Sbl2 = this.LJLJJL;
                                    if (c72433Sbl2 != null) {
                                        UrlModel displayAvatar = ((IMContact) ListProtector.get(LLILII, 0)).getDisplayAvatar();
                                        if (displayAvatar != null && (urlList3 = displayAvatar.getUrlList()) != null) {
                                            str3 = (String) ORZ.LJLLLL(urlList3);
                                        } else {
                                            str3 = null;
                                        }
                                        C78765Uvh.LJIIIZ(c72433Sbl2, str3, -1, -1);
                                    } else {
                                        o.LJIJI("headAvatar2");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("headAvatar1");
                                throw null;
                            }
                        } else if (!LLILII.isEmpty()) {
                            C72433Sbl c72433Sbl3 = this.LJLJJI;
                            if (c72433Sbl3 != null) {
                                UrlModel displayAvatar2 = ((IMContact) ListProtector.get(LLILII, 0)).getDisplayAvatar();
                                if (displayAvatar2 != null && (urlList2 = displayAvatar2.getUrlList()) != null) {
                                    str = (String) ORZ.LJLLLL(urlList2);
                                } else {
                                    str = null;
                                }
                                C78765Uvh.LJIIIZ(c72433Sbl3, str, -1, -1);
                                if (LLILII.size() > 1) {
                                    C72433Sbl c72433Sbl4 = this.LJLJJL;
                                    if (c72433Sbl4 != null) {
                                        UrlModel displayAvatar3 = ((IMContact) ListProtector.get(LLILII, 1)).getDisplayAvatar();
                                        if (displayAvatar3 != null && (urlList = displayAvatar3.getUrlList()) != null) {
                                            str2 = (String) ORZ.LJLLLL(urlList);
                                        } else {
                                            str2 = null;
                                        }
                                        C78765Uvh.LJIIIZ(c72433Sbl4, str2, -1, -1);
                                    } else {
                                        o.LJIJI("headAvatar2");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("headAvatar1");
                                throw null;
                            }
                        }
                    } else {
                        InterfaceC98123tA relationService = IMService.createIIMServicebyMonsterPlugin(false).getRelationService();
                        C57174McE c57174McE = new C57174McE(this);
                        C83093Nx c83093Nx = new C83093Nx();
                        c83093Nx.LIZJ = true;
                        relationService.LIZLLL(c57174McE, c83093Nx, true ^ o.LJ(param.trigger, "in_app_share"));
                    }
                } else {
                    InterfaceC98123tA relationService2 = IMService.createIIMServicebyMonsterPlugin(false).getRelationService();
                    C83093Nx c83093Nx2 = new C83093Nx();
                    c83093Nx2.LIZJ = true;
                    relationService2.LJII(2, this, c83093Nx2);
                }
                if (o.LJ("dm", param.trigger)) {
                    tuxIconView2.setVisibility(0);
                    TuxIconView tuxIconView3 = this.LJLJLLL;
                    if (tuxIconView3 != null) {
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_color_paperplane_circle;
                        tuxIconView3.setTuxIcon(c2068389v);
                        TuxIconView tuxIconView4 = this.LJLL;
                        if (tuxIconView4 != null) {
                            C2068389v c2068389v2 = new C2068389v();
                            c2068389v2.LIZ = R.raw.icon_color_paperplane_circle;
                            tuxIconView4.setTuxIcon(c2068389v2);
                            panelTitle.setText(R.string.er6);
                            C16880lQ.LJJJ(tuxIconView2, new ACListenerS29S0100000_9(this, 117));
                        } else {
                            o.LJIJI("userGender2");
                            throw null;
                        }
                    } else {
                        o.LJIJI("userGender1");
                        throw null;
                    }
                }
                String str5 = param.panelType;
                switch (str5.hashCode()) {
                    case -1039745817:
                        if (!str5.equals("normal")) {
                            return;
                        }
                        TuxTextView tuxTextView = this.LJLLI;
                        if (tuxTextView != null) {
                            tuxTextView.setText(R.string.t6e);
                            return;
                        } else {
                            o.LJIJI("panelDesc");
                            throw null;
                        }
                    case -868304044:
                        if (!str5.equals("toggle")) {
                            return;
                        }
                        textView.setText(R.string.t6o);
                        tuxIconView.setVisibility(8);
                        TuxTextView tuxTextView2 = this.LJLLI;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setVisibility(8);
                            textView.setVisibility(0);
                            Context context3 = getContext();
                            o.LJIIIIZZ(context3, "context");
                            ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context3);
                            if (LJJIFFI2 == null) {
                                return;
                            }
                            GuideUserSwitchVM guideUserSwitchVM = (GuideUserSwitchVM) ViewModelProviders.of(LJJIFFI2).get(GuideUserSwitchVM.class);
                            if (guideUserSwitchVM != null) {
                                guideUserSwitchVM.LJLIL.observe(LJJIFFI2, new AObserverS65S0300000_4(this, sy4, LJJIFFI2, 1));
                                PushSettings LJ = C85940Xo8.LIZIZ.LJ();
                                if (LJ == null) {
                                    return;
                                }
                                setSettingList(LJ);
                                return;
                            }
                            o.LJIJI("switchVM");
                            throw null;
                        }
                        o.LJIJI("panelDesc");
                        throw null;
                    case -600094315:
                        if (!str5.equals("friends")) {
                            return;
                        }
                        panelTitle.setText(R.string.t6m);
                        TuxTextView tuxTextView3 = this.LJLLI;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(R.string.t6j);
                            LIZIZ(R.id.doh).setVisibility(0);
                            LIZIZ(R.id.d0m).setVisibility(0);
                            return;
                        }
                        o.LJIJI("panelDesc");
                        throw null;
                    case 1844104722:
                        if (!str5.equals("interaction")) {
                            return;
                        }
                        o.LJIIIIZZ(panelTitle, "panelTitle");
                        tuxIconView.setVisibility(8);
                        ((TextView) LIZIZ(R.id.b1z)).setText(R.string.t5m);
                        ((TextView) LIZIZ(R.id.b20)).setText(R.string.t5l);
                        if (!C2307993z.LIZ()) {
                            return;
                        }
                        TuxTextView tuxTextView4 = this.LJLLI;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setVisibility(0);
                            LIZIZ(R.id.heb).setVisibility(8);
                            String str6 = param.trigger;
                            int hashCode = str6.hashCode();
                            if (hashCode != -1268958287) {
                                if (hashCode != -431564597) {
                                    if (hashCode != 925887911 || !str6.equals("in_app_share")) {
                                        return;
                                    }
                                    panelTitle.setText(R.string.t61);
                                    TuxTextView tuxTextView5 = this.LJLLI;
                                    if (tuxTextView5 != null) {
                                        tuxTextView5.setText(R.string.t5w);
                                        return;
                                    } else {
                                        o.LJIJI("panelDesc");
                                        throw null;
                                    }
                                }
                                if (!str6.equals("enter_homepage_friends")) {
                                    return;
                                }
                                panelTitle.setText(R.string.t60);
                                TuxTextView tuxTextView6 = this.LJLLI;
                                if (tuxTextView6 != null) {
                                    tuxTextView6.setText(R.string.t5w);
                                    return;
                                } else {
                                    o.LJIJI("panelDesc");
                                    throw null;
                                }
                            }
                            if (!str6.equals("follow")) {
                                return;
                            }
                            panelTitle.setText(R.string.t5z);
                            TuxTextView tuxTextView7 = this.LJLLI;
                            if (tuxTextView7 != null) {
                                tuxTextView7.setText(R.string.t5w);
                                return;
                            } else {
                                o.LJIJI("panelDesc");
                                throw null;
                            }
                        }
                        o.LJIJI("panelDesc");
                        throw null;
                    default:
                        return;
                }
            }
            o.LJIJI("powerList");
            throw null;
        }
        o.LJIJI("powerList");
        throw null;
    }

    public final void LIZJ(C188727au c188727au, boolean z) {
        String str = this.LJLIL.trigger;
        int hashCode = str.hashCode();
        String str2 = "all_notifications";
        if (hashCode != -1268958287) {
            if (hashCode != -431564597) {
                if (hashCode != 925887911 || !str.equals("in_app_share")) {
                    return;
                }
                if (z) {
                    str2 = "messages_and_interactions";
                }
                c188727au.LJI("personal_sub_type", str2);
                return;
            }
            if (!str.equals("enter_homepage_friends")) {
                return;
            }
            if (z) {
                str2 = "video_suggestions_and_interactions";
            }
            c188727au.LJI("personal_sub_type", str2);
            return;
        }
        if (!str.equals("follow")) {
            return;
        }
        if (z) {
            str2 = "video_suggestions";
        }
        c188727au.LJI("personal_sub_type", str2);
    }

    public final void LJ(String str, boolean z) {
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", this.LJLIL.enterFrom);
        c188727au.LJI("trigger", this.LJLIL.trigger);
        c188727au.LJI("pop_up_type", "personalized");
        c188727au.LJI("is_expand", str);
        LIZJ(c188727au, z);
        FMX.LJIIL("expand_sub_push_description", c188727au.LIZ);
    }

    public static void LJFF(ViewOnClickListenerC57173McD viewOnClickListenerC57173McD, String str, String str2, String str3, String str4, int i) {
        boolean z;
        String str5 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        viewOnClickListenerC57173McD.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJI("enter_from", viewOnClickListenerC57173McD.LJLIL.enterFrom);
        if (C78857UxB.LJJJIL(viewOnClickListenerC57173McD.LJLIL.enterMethod)) {
            c188727au.LJI("enter_method", viewOnClickListenerC57173McD.LJLIL.enterMethod);
        }
        c188727au.LJI("trigger", viewOnClickListenerC57173McD.LJLIL.trigger);
        c188727au.LJI("pop_up_type", viewOnClickListenerC57173McD.LJLIL.panelType);
        StringBuilder sb = new StringBuilder();
        String str6 = viewOnClickListenerC57173McD.LJLIL.panelType;
        if (o.LJ(str6, "friends")) {
            str5 = viewOnClickListenerC57173McD.LJZ == 1 ? "friends" : "everyone";
        } else if (o.LJ(str6, "toggle")) {
            PushSettings pushSettings = viewOnClickListenerC57173McD.LJLZ;
            if (pushSettings != null && pushSettings.diggPush == 0) {
                sb.append("likes");
            }
            if (sb.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append(",");
            }
            PushSettings pushSettings2 = viewOnClickListenerC57173McD.LJLZ;
            if (pushSettings2 != null && pushSettings2.commentPush == 0) {
                sb.append("comments");
            }
            if (sb.length() > 0) {
                sb.append(",");
            }
            PushSettings pushSettings3 = viewOnClickListenerC57173McD.LJLZ;
            if (pushSettings3 != null && pushSettings3.followPush == 0) {
                sb.append("new_followers");
            }
            if (sb.length() > 0) {
                sb.append(",");
            }
            PushSettings pushSettings4 = viewOnClickListenerC57173McD.LJLZ;
            if (pushSettings4 != null && pushSettings4.mentionPush == 0) {
                sb.append("mentions");
            }
        }
        if (o.LJ(viewOnClickListenerC57173McD.LJLIL.trigger, "dm")) {
            c188727au.LIZLLL(viewOnClickListenerC57173McD.LJZI ? 1 : 0, "is_dm_first");
        }
        if (str3 != null) {
            c188727au.LJI("action_type", str3);
        }
        if (str5 != null) {
            c188727au.LJI("push_scope", str5);
        }
        if (str2 != null) {
            c188727au.LJI("is_expand", str2);
        }
        if (str4 != null) {
            c188727au.LJI("to_status", str4);
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
