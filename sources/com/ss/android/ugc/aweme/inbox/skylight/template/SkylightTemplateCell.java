package com.ss.android.ugc.aweme.inbox.skylight.template;

import X.C113554cx;
import X.C115974gr;
import X.C115984gs;
import X.C116014gv;
import X.C116094h3;
import X.C16880lQ;
import X.C62562cu;
import X.C6ZT;
import X.C71799SFv;
import X.C78939UyV;
import X.C90193gN;
import X.EnumC116054gz;
import X.InterfaceC116004gu;
import X.J7H;
import X.L9F;
import X.OSZ;
import X.W5F;
import X.W5U;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.TemplateData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SkylightTemplateCell extends SkylightBaseTemplateCell<C116094h3> implements View.OnClickListener {
    public static final Map<Integer, InterfaceC116004gu> LJLLI = C113554cx.LJJL(new OSZ(1, new InterfaceC116004gu() { // from class: X.4gq
        @Override // X.InterfaceC116004gu
        public final void LIZ(C115974gr c115974gr) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        
            if (r3 == null) goto L23;
         */
        @Override // X.InterfaceC116004gu
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean LIZIZ(X.C115984gs r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData r0 = r10.LJLIL
                com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData r0 = r0.getCustomBizData()
                if (r0 == 0) goto La8
                com.ss.android.ugc.aweme.profile.model.User r8 = r0.getUser()
                if (r8 == 0) goto La8
                X.Ol8 r0 = X.L2R.LIZLLL
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r7 = 0
                java.lang.String r6 = "notification_page"
                java.lang.String r5 = "inbox_top"
                if (r0 == 0) goto Lae
                X.7au r4 = new X.7au
                r4.<init>()
                java.lang.String r0 = "enter_from"
                r4.LJIIIZ(r0, r6)
                java.lang.String r0 = "enter_method"
                r4.LJIIIZ(r0, r5)
                java.lang.String r1 = r8.getUid()
                java.lang.String r0 = "to_user_id"
                r4.LJIIIZ(r0, r1)
                X.Yp3 r3 = X.C88545Yp3.LIZIZ
                java.lang.String r2 = ""
                if (r3 == 0) goto L45
                java.lang.String r1 = r3.LJ()
                if (r1 != 0) goto L48
            L45:
                r1 = r2
                if (r3 == 0) goto Lac
            L48:
                boolean r0 = r3.isConnected()
            L4c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r4.LJFF(r0, r1)
                if (r3 == 0) goto L5b
                java.lang.String r1 = r3.LIZIZ()
                if (r1 != 0) goto L5e
            L5b:
                r1 = r2
                if (r3 == 0) goto L64
            L5e:
                java.lang.String r0 = r3.LJIILJJIL()
                if (r0 != 0) goto Laa
            L64:
                r4.LJIIIZ(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
                java.lang.String r0 = "enter_personal_detail"
                X.FMX.LJIIL(r0, r1)
                android.view.View r0 = r10.LJLILLLLZI
                android.content.Context r2 = r0.getContext()
                java.lang.StringBuilder r1 = X.X1D.LIZ()
                java.lang.String r0 = "aweme://user/profile//"
                r1.append(r0)
                java.lang.String r0 = r8.getUid()
                r1.append(r0)
                java.lang.String r0 = X.X1D.LIZIZ(r1)
                com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r2, r0)
                r0.open()
            L8f:
                com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r7)
                X.3wU r1 = r0.getActivityStatusAccuracyAnalysis()
                X.4b2 r0 = X.EnumC112364b2.INBOX_TOP
                java.lang.String r2 = r0.getValue()
                r3 = 0
                java.lang.String r4 = r8.getUid()
                r5 = 0
                java.lang.String r6 = "type_click"
                X.C100193wV.LIZIZ(r1, r2, r3, r4, r5, r6)
            La8:
                r0 = 1
                return r0
            Laa:
                r2 = r0
                goto L64
            Lac:
                r0 = 0
                goto L4c
            Lae:
                com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService.createIIMServicebyMonsterPlugin(r7)
                X.3uH r3 = r0.getImChatService()
                X.3tv r2 = new X.3tv
                android.view.View r0 = r10.LJLILLLLZI
                android.content.Context r1 = r0.getContext()
                com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.ss.android.ugc.aweme.im.service.model.IMUser.fromUser(r8)
                r2.<init>(r1, r0)
                r2.setEnterMethodForMob(r5)
                r2.setEnterFromForMob(r6)
                r3.LJFF(r2)
                goto L8f
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C115964gq.LIZIZ(X.4gs):boolean");
        }

        @Override // X.InterfaceC116004gu
        public final void LIZJ(C115974gr c115974gr, View view) {
            CustomBizData customBizData;
            User user;
            view.setTag(R.id.eg1, null);
            SkylightData skylightData = c115974gr.LIZ;
            if (skylightData != null && (customBizData = skylightData.getCustomBizData()) != null && (user = customBizData.getUser()) != null) {
                C112244aq.LIZ(view, user.getUid(), Boolean.FALSE);
            }
        }
    }), new OSZ(101, new InterfaceC116004gu() { // from class: X.4gt
        @Override // X.InterfaceC116004gu
        public final void LIZ(C115974gr c115974gr) {
        }

        @Override // X.InterfaceC116004gu
        public final boolean LIZIZ(C115984gs c115984gs) {
            return false;
        }

        @Override // X.InterfaceC116004gu
        public final void LIZJ(C115974gr c115974gr, View view) {
        }
    }));
    public C71799SFv LJLJLJ;
    public TuxTextView LJLJLLL;
    public ImageView LJLL;

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell
    public final int M() {
        return R.layout.tv;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell
    public final int P() {
        return R.layout.tw;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell
    public final void onAttach() {
        InterfaceC116004gu interfaceC116004gu = LJLLI.get(Integer.valueOf(N().getBizType()));
        if (interfaceC116004gu != null) {
            interfaceC116004gu.LIZ(new C115974gr(N()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar_iv)");
        this.LJLJLJ = (C71799SFv) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name_tv)");
        this.LJLJLLL = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.afu);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.badge_iv)");
        this.LJLL = (ImageView) findViewById3;
    }

    @Override // com.ss.android.ugc.aweme.inbox.skylight.SkylightBaseTemplateCell
    public final void L(C116094h3 t) {
        Integer valueOf;
        W5F LJII;
        o.LJIIIZ(t, "t");
        C16880lQ.LJIIJ(this, this.itemView);
        C71799SFv c71799SFv = this.LJLJLJ;
        if (c71799SFv != null) {
            C16880lQ.LJJIL(c71799SFv, this);
            TuxTextView tuxTextView = this.LJLJLLL;
            if (tuxTextView != null) {
                C16880lQ.LJJJJI(tuxTextView, this);
                ImageView imageView = this.LJLL;
                if (imageView != null) {
                    C16880lQ.LJIILLIIL(imageView, this);
                    ImageView imageView2 = this.LJLL;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                        C116014gv c116014gv = new C116014gv(this.LJLJJI);
                        TemplateData templateData = this.LJLJJI;
                        if (templateData != null && (valueOf = Integer.valueOf(templateData.getUiType())) != null) {
                            if (valueOf.intValue() == 1) {
                                T(c116014gv);
                                U(c116014gv);
                            } else if (valueOf.intValue() == 5) {
                                T(c116014gv);
                                U(c116014gv);
                                Object obj = c116014gv.LIZIZ;
                                if (obj != null) {
                                    ImageView imageView3 = this.LJLL;
                                    if (imageView3 != null) {
                                        imageView3.setVisibility(0);
                                        if (obj instanceof Integer) {
                                            LJII = W5U.LJ(((Number) obj).intValue());
                                        } else if (obj instanceof File) {
                                            LJII = W5U.LJI((File) obj);
                                            o.LJIIIIZZ(LJII, "load(obj)");
                                        } else if (obj instanceof String) {
                                            LJII = W5U.LJIIIIZZ((String) obj);
                                            o.LJIIIIZZ(LJII, "load(obj)");
                                        } else if (obj instanceof Uri) {
                                            LJII = W5U.LJFF((Uri) obj);
                                        } else if (obj instanceof C62562cu) {
                                            LJII = W5U.LJIIIZ((C62562cu) obj);
                                        } else if (obj instanceof UrlModel) {
                                            LJII = W5U.LJII(C78939UyV.LJ((UrlModel) obj));
                                        } else {
                                            LJII = W5U.LJII(obj);
                                        }
                                        LJII.LJIILIIL(J7H.LIZ(100));
                                        ImageView imageView4 = this.LJLL;
                                        if (imageView4 != null) {
                                            LJII.LJJIIJZLJL = imageView4;
                                            L9F.LIZ(LJII, null, "Skylight");
                                        } else {
                                            o.LJIJI("badgeView");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("badgeView");
                                        throw null;
                                    }
                                }
                                if (C90193gN.LIZ()) {
                                    ImageView imageView5 = this.LJLL;
                                    if (imageView5 != null) {
                                        imageView5.setTranslationX(-4.0f);
                                    } else {
                                        o.LJIJI("badgeView");
                                        throw null;
                                    }
                                } else {
                                    ImageView imageView6 = this.LJLL;
                                    if (imageView6 != null) {
                                        imageView6.setTranslationX(4.0f);
                                    } else {
                                        o.LJIJI("badgeView");
                                        throw null;
                                    }
                                }
                            }
                        }
                        InterfaceC116004gu interfaceC116004gu = LJLLI.get(Integer.valueOf(N().getBizType()));
                        if (interfaceC116004gu != null) {
                            C115974gr c115974gr = new C115974gr(N());
                            View itemView = this.itemView;
                            o.LJIIIIZZ(itemView, "itemView");
                            interfaceC116004gu.LIZJ(c115974gr, itemView);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("badgeView");
                    throw null;
                }
                o.LJIJI("badgeView");
                throw null;
            }
            o.LJIJI("userName");
            throw null;
        }
        o.LJIJI("avatarView");
        throw null;
    }

    public final void T(C116014gv c116014gv) {
        Object obj = c116014gv.LIZ;
        if (obj != null) {
            if (obj instanceof UrlModel) {
                C71799SFv c71799SFv = this.LJLJLJ;
                if (c71799SFv != null) {
                    C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ((UrlModel) obj), null, false, null, 126);
                    return;
                } else {
                    o.LJIJI("avatarView");
                    throw null;
                }
            }
            C71799SFv c71799SFv2 = this.LJLJLJ;
            if (c71799SFv2 != null) {
                C71799SFv.LJIIJ(c71799SFv2, obj, null, false, null, 126);
            } else {
                o.LJIJI("avatarView");
                throw null;
            }
        }
    }

    public final void U(C116014gv c116014gv) {
        Object obj = c116014gv.LIZJ;
        if (obj != null) {
            if (obj instanceof Integer) {
                TuxTextView tuxTextView = this.LJLJLLL;
                if (tuxTextView != null) {
                    tuxTextView.setText(this.itemView.getContext().getString(((Number) obj).intValue()));
                    return;
                } else {
                    o.LJIJI("userName");
                    throw null;
                }
            }
            if (!(obj instanceof String)) {
                return;
            }
            TuxTextView tuxTextView2 = this.LJLJLLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText((CharSequence) obj);
            } else {
                o.LJIJI("userName");
                throw null;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        TemplateData templateData;
        String schemaUrl;
        o.LJIIIZ(v, "v");
        if (C6ZT.LIZ(v)) {
            return;
        }
        SkylightBaseTemplateCell.Q(this, EnumC116054gz.CLICK);
        C115984gs c115984gs = new C115984gs(N(), v);
        InterfaceC116004gu interfaceC116004gu = LJLLI.get(Integer.valueOf(N().getBizType()));
        if ((interfaceC116004gu == null || !interfaceC116004gu.LIZIZ(c115984gs)) && (templateData = this.LJLJJI) != null && (schemaUrl = templateData.getSchemaUrl()) != null) {
            SmartRouter.buildRoute(this.itemView.getContext(), schemaUrl).open();
        }
    }
}
