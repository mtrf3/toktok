package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C188627ak;
import X.C188727au;
import X.C1DH;
import X.C2053083y;
import X.C2058986f;
import X.C2059286i;
import X.C2059386j;
import X.C2059486k;
import X.C2059586l;
import X.C2059686m;
import X.C2060386t;
import X.C212428Vi;
import X.C214348b8;
import X.C221108m2;
import X.C2304092m;
import X.C2K0;
import X.C32151Nz;
import X.C3C8;
import X.C47261Igj;
import X.C48236IwS;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C56331M8x;
import X.C5H3;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C79045V0n;
import X.C7MY;
import X.C86B;
import X.C86C;
import X.C87026YDm;
import X.C8MM;
import X.C8T7;
import X.C8VV;
import X.C8YN;
import X.C99W;
import X.C9T4;
import X.DT6;
import X.FMX;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.O6R;
import X.T28;
import X.TBT;
import X.ViewOnTouchListenerC2059986p;
import X.ViewOnTouchListenerC2065588t;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS7S0101000_3;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class VideoAuthorInfoRelationAssem extends BaseCellSlotComponent implements InteractInfoAuthorInfoAbility, ComponentPriorityProtocol, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILII;
    public TuxTextView LLFII;
    public TuxTextView LLFZ;
    public View LLI;
    public View LLIFFJFJJ;
    public TuxTextView LLII;
    public C188627ak LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public final HashMap<String, String> LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final InterfaceC115514g7 LLIIL;
    public final C5H3 LLIILII;
    public final C5H3 LLIILZL;
    public final C62822Ol8 LLIIZ;
    public final VideoAuthorInfoRelationAssem$descExpandModeProtocol$1 LLIL;

    static {
        TBT tbt = new TBT(VideoAuthorInfoRelationAssem.class, "authorInfoVM", "getAuthorInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/videoauthorinfo/VideoAuthorInfoVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLILII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.adf;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_author";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1293470206) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.InteractInfoAuthorInfoAbility
    public final int qj0() {
        int[] iArr = new int[2];
        getContainerView().getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem$descExpandModeProtocol$1] */
    public VideoAuthorInfoRelationAssem() {
        new LinkedHashMap();
        this.LLIIIILZ = "";
        this.LLIIIJ = "low_interest";
        this.LLIIIL = new HashMap<>();
        this.LLIIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 387));
        this.LLIIJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 388));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoAuthorInfoVM.class);
        this.LLIIL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 389), null, C2059486k.INSTANCE, null, null);
        this.LLIILII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C2059586l.INSTANCE);
        this.LLIILZL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C2059686m.INSTANCE);
        this.LLIIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 386));
        this.LLIL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem$descExpandModeProtocol$1
            public int LJLIL = 8;

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
                if (this.LJLIL == 0) {
                    View view = VideoAuthorInfoRelationAssem.this.LLIFFJFJJ;
                    if (view != null) {
                        view.setVisibility(0);
                    } else {
                        o.LJIJI("socialTaggedLayout");
                        throw null;
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = VideoAuthorInfoRelationAssem.this;
                if (videoAuthorInfoRelationAssem.LLFFF == 0) {
                    videoAuthorInfoRelationAssem.Y3().setVisibility(0);
                    View view = VideoAuthorInfoRelationAssem.this.LLIFFJFJJ;
                    if (view != null) {
                        if (view.getVisibility() == 0) {
                            this.LJLIL = 0;
                            View view2 = VideoAuthorInfoRelationAssem.this.LLIFFJFJJ;
                            if (view2 != null) {
                                view2.setVisibility(8);
                                return;
                            } else {
                                o.LJIJI("socialTaggedLayout");
                                throw null;
                            }
                        }
                        return;
                    }
                    o.LJIJI("socialTaggedLayout");
                    throw null;
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.InteractInfoAuthorInfoAbility
    public final boolean Ho0() {
        if (this.LLFII != null) {
            return true;
        }
        return false;
    }

    public final VideoAuthorInfoVM q4() {
        return (VideoAuthorInfoVM) this.LLIIL.LIZ(this, LLILII[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        q4().LJLL.LIZIZ(VideoAuthorInfoVM.LJLLI[0], null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLIL));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        String str2;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        z4(aweme);
        int i = 1;
        boolean z = !TextUtils.isEmpty(C56331M8x.LJ(item.getAweme(), item.mEventType));
        String str3 = item.mEventType;
        Aweme aweme2 = item.getAweme();
        if (aweme2 == null) {
            return;
        }
        boolean LJIIL = C48236IwS.LJIIL(aweme2.getAid());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LIZLLL(LJIIL ? 1 : 0, "cache");
        if (z) {
            i = 0;
        } else if (aweme2.getAuthor() == null) {
            i = 2;
        } else {
            User author = aweme2.getAuthor();
            String str4 = null;
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            if (C2060386t.LIZ(str)) {
                i = 3;
            } else {
                User author2 = aweme2.getAuthor();
                if (author2 != null) {
                    str2 = author2.getNickname();
                } else {
                    str2 = null;
                }
                if (C2060386t.LIZ(str2)) {
                    i = 4;
                } else {
                    User author3 = aweme2.getAuthor();
                    if (author3 != null) {
                        str4 = author3.getUniqueId();
                    }
                    if (C2060386t.LIZ(str4)) {
                        i = 5;
                    }
                }
            }
        }
        c188727au.LIZLLL(i, "status");
        FMX.LJIIL("nickname_show", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_component_clickable", new AqS169S0100000_3(this, 216));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        Number valueOf;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.mem);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_post_time)");
        this.LLFZ = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.title)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.LLFII = tuxTextView;
        DT6.LJLIL.LJLIL(tuxTextView);
        if (C63081OpJ.LLJJJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            TuxTextView tuxTextView2 = this.LLFII;
            if (tuxTextView2 != null) {
                tuxTextView2.setOnTouchListener(new ViewOnTouchListenerC2065588t());
            } else {
                o.LJIJI("titleView");
                throw null;
            }
        } else {
            TuxTextView tuxTextView3 = this.LLFII;
            if (tuxTextView3 != null) {
                tuxTextView3.setOnTouchListener(new ViewOnTouchListenerC2059986p());
            } else {
                o.LJIJI("titleView");
                throw null;
            }
        }
        TuxTextView tuxTextView4 = this.LLFII;
        if (tuxTextView4 != null) {
            C16880lQ.LJJJJI(tuxTextView4, new ACListenerS23S0100000_3(this, 74));
            View findViewById3 = view.findViewById(R.id.j7n);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.root_layout)");
            this.LLI = findViewById3;
            View findViewById4 = view.findViewById(R.id.k6h);
            o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.social_tagged_desc)");
            this.LLII = (TuxTextView) findViewById4;
            GradientDrawable LIZIZ = T28.LIZIZ(1);
            int LIZIZ2 = C7MY.LIZIZ(1);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            LIZIZ.setStroke(LIZIZ2, AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            LIZIZ.setColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context2));
            View findViewById5 = view.findViewById(R.id.k6g);
            C188627ak c188627ak = (C188627ak) findViewById5;
            c188627ak.setSocialVideoTag(true);
            c188627ak.LIZJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            o.LJIIIIZZ(findViewById5, "view.findViewById<Mutual…e(18.dp, 12.dp)\n        }");
            this.LLIIII = (C188627ak) findViewById5;
            View findViewById6 = view.findViewById(R.id.k6i);
            if (C99W.LIZ) {
                valueOf = 4;
            } else {
                valueOf = Float.valueOf(2.0f);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(valueOf));
            Context context3 = view.getContext();
            o.LJIIIIZZ(context3, "view.context");
            if (C87026YDm.LIZIZ()) {
                i = R.attr.d1;
            } else {
                i = R.attr.dg;
            }
            Integer LJI = C79045V0n.LJI(i, context3);
            if (LJI != null) {
                gradientDrawable.setColor(LJI.intValue());
            }
            findViewById6.setBackground(gradientDrawable);
            this.LLIFFJFJJ = findViewById6;
            View view2 = this.LLI;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 75), view2);
                C8YN.LJIILJJIL(this, (AssemViewModel) this.LLIILII.getValue(), new TBT() { // from class: X.86q
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C8UB) obj).LJLLLL;
                    }
                }, null, C86B.LJLIL, 6);
                if (C51029K0z.LJIILLIIL(this) != null && C9T4.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                    C8YN.LJII(this, (AssemViewModel) this.LLIILII.getValue(), new TBT() { // from class: X.86r
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C8UB) obj).LLI;
                        }
                    }, null, new AqS185S0100000_3(this, 195), 6);
                }
                C8YN.LJII(this, (AssemViewModel) this.LLIILZL.getValue(), new TBT() { // from class: X.86n
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C82B) obj).LJLIL;
                    }
                }, null, C86C.LJLIL, 6);
                C8YN.LJII(this, q4(), new TBT() { // from class: X.86H
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C86D) obj).LJLIL;
                    }
                }, null, new AqS185S0100000_3(this, 194), 6);
                C8YN.LJII(this, q4(), new TBT() { // from class: X.86E
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Integer.valueOf(((C86D) obj).LJLILLLLZI);
                    }
                }, null, C2059386j.LJLIL, 6);
                C8YN.LJII(this, q4(), new TBT() { // from class: X.86F
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C86D) obj).LJLJI;
                    }
                }, null, C2059286i.LJLIL, 6);
                C8YN.LJII(this, q4(), new TBT() { // from class: X.86I
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C86D) obj).LJLJJI;
                    }
                }, null, C2058986f.LJLIL, 6);
                C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 75));
                if (C2304092m.LIZ() && !C55723Ltv.LIZIZ.LJIJ().LJIJ(C212428Vi.LIZLLL(this))) {
                    C8VV.LIZLLL(this, new AqS134S0200000_3(this, view, 86));
                    return;
                }
                return;
            }
            o.LJIJI("rootLayout");
            throw null;
        }
        o.LJIJI("titleView");
        throw null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoAuthorInfoVM q4 = q4();
        q4.LJLL.LIZIZ(VideoAuthorInfoVM.LJLLI[0], getContext());
    }

    public final void r4(int i) {
        getContainerView().post(new ARunnableS7S0101000_3(i, this, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0237, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z4(com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem.z4(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        C2053083y.LIZ(ins, win);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        if (r5 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
    
        if (r5 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u4(com.bytedance.tux.input.TuxTextView r19, java.lang.CharSequence r20) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem.u4(com.bytedance.tux.input.TuxTextView, java.lang.CharSequence):void");
    }
}
