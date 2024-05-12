package Y;

import X.AbstractC188397aN;
import X.AnonymousClass894;
import X.C04330Ez;
import X.C16880lQ;
import X.C1792171p;
import X.C1792271q;
import X.C1794972r;
import X.C32151Nz;
import X.C53946LFe;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C7DC;
import X.C7MY;
import X.C80261Vej;
import X.C8ID;
import X.HG3;
import X.O6R;
import X.SY4;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.gift.model.CPCPromptData;
import com.ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResult;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public class AObserverS35S0400000_3 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS35S0400000_3 aObserverS35S0400000_3, Object obj) {
        GiftResult giftResult;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        GiftResult giftPageList;
        List<GiftPage> giftPageList2;
        GiftResult giftResult2;
        List<GiftPage> list;
        final String string;
        GiftResult giftPageList3;
        List<GiftPage> giftPageList4;
        GiftPage giftPage;
        List<GiftPage> giftPageList5;
        GiftResponse giftResponse = (GiftResponse) obj;
        C1792171p c1792171p = (C1792171p) aObserverS35S0400000_3.l0;
        c1792171p.LJI = new C7DC(c1792171p.LIZ, c1792171p.LIZJ, c1792171p.LIZLLL, (C8ID) aObserverS35S0400000_3.l1, c1792171p.LJIIJ, c1792171p.LJFF);
        C1794972r c1794972r = (C1794972r) aObserverS35S0400000_3.l2;
        C7DC c7dc = ((C1792171p) aObserverS35S0400000_3.l0).LJI;
        ViewGroup.LayoutParams layoutParams = null;
        if (c7dc != null) {
            c1794972r.setAdapter(c7dc);
            C7DC c7dc2 = ((C1792171p) aObserverS35S0400000_3.l0).LJI;
            if (c7dc2 != null) {
                if (giftResponse != null) {
                    giftResult = giftResponse.getGiftPageList();
                } else {
                    giftResult = null;
                }
                ((ArrayList) c7dc2.LJLJLJ).clear();
                c7dc2.notifyDataSetChanged();
                if (giftResult != null && (giftPageList5 = giftResult.getGiftPageList()) != null) {
                    ((ArrayList) c7dc2.LJLJLJ).addAll(giftPageList5);
                }
                c7dc2.LJLJJL.setVisibility(8);
                C7DC c7dc3 = ((C1792171p) aObserverS35S0400000_3.l0).LJI;
                if (c7dc3 != null) {
                    c7dc3.notifyDataSetChanged();
                    ((C1792171p) aObserverS35S0400000_3.l0).LIZLLL.nv0();
                    User curUser = HG3.LJIILL().getCurUser();
                    o.LJII(curUser, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                    boolean z = true;
                    if (curUser.getGiftBagStatus() == 1) {
                        C1792171p c1792171p2 = (C1792171p) aObserverS35S0400000_3.l0;
                        if (giftResponse != null) {
                            giftResult2 = giftResponse.getGiftPageList();
                        } else {
                            giftResult2 = null;
                        }
                        c1792171p2.getClass();
                        if (giftResult2 != null) {
                            list = giftResult2.getGiftPageList();
                        } else {
                            list = null;
                        }
                        o.LJI(list);
                        Iterator<GiftPage> it = list.iterator();
                        final int i = 0;
                        while (true) {
                            if (it.hasNext()) {
                                int i2 = i + 1;
                                if (it.next().getGiftPageType() == 3) {
                                    break;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = 0;
                                break;
                            }
                        }
                        if (giftResponse == null || (giftPageList3 = giftResponse.getGiftPageList()) == null || (giftPageList4 = giftPageList3.getGiftPageList()) == null || (giftPage = (GiftPage) ListProtector.get(giftPageList4, i)) == null || (string = giftPage.getPageName()) == null) {
                            string = C16880lQ.LLLLLILLIL(((C1792171p) aObserverS35S0400000_3.l0).LIZJ).getString(R.string.cc5);
                            o.LJIIIIZZ(string, "context.applicationConte…R.string.bonusgift_title)");
                        }
                        ((C80261Vej) aObserverS35S0400000_3.l3).postDelayed(new ARunnableS7S0101000_3(i, (C1794972r) aObserverS35S0400000_3.l2, 16), 500L);
                        final C80261Vej c80261Vej = (C80261Vej) aObserverS35S0400000_3.l3;
                        final C1792171p c1792171p3 = (C1792171p) aObserverS35S0400000_3.l0;
                        c80261Vej.post(new Runnable() { // from class: X.4YH
                            public final void LIZ() {
                                C1792171p c1792171p4 = C1792171p.this;
                                int i3 = i;
                                C80261Vej c80261Vej2 = c80261Vej;
                                String str = string;
                                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.p3, C16880lQ.LLZIL(c1792171p4.LIZJ), null);
                                o.LJII(LLLZIIL, "null cannot be cast to non-null type android.widget.LinearLayout");
                                View findViewById = LLLZIIL.findViewById(R.id.ani);
                                o.LJII(findViewById, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                                ((TextView) findViewById).setText(str);
                                View findViewById2 = LLLZIIL.findViewById(R.id.anh);
                                o.LJII(findViewById2, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
                                TuxIconView tuxIconView = (TuxIconView) findViewById2;
                                C78856UxA tabAt = c80261Vej2.getTabAt(i3);
                                if (tabAt != null) {
                                    tabAt.LIZLLL(LLLZIIL);
                                }
                                C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(c1792171p4, 256));
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
                    C1792171p c1792171p4 = (C1792171p) aObserverS35S0400000_3.l0;
                    if (giftResponse == null || (giftPageList = giftResponse.getGiftPageList()) == null || (giftPageList2 = giftPageList.getGiftPageList()) == null || giftPageList2.size() != 1) {
                        z = false;
                    }
                    C80261Vej c80261Vej2 = (C80261Vej) aObserverS35S0400000_3.l3;
                    if (z) {
                        if (c1792171p4.LJFF) {
                            View view2 = c1792171p4.LJII;
                            if (view2 != null) {
                                view = view2.findViewById(R.id.dvm);
                            } else {
                                view = null;
                            }
                            if ((view instanceof C1794972r) && view != null) {
                                layoutParams = view.getLayoutParams();
                            }
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                marginLayoutParams.topMargin = C7MY.LIZIZ(40);
                            }
                        }
                        c80261Vej2.setVisibility(8);
                        return;
                    }
                    if (c1792171p4.LJFF) {
                        c80261Vej2.getLayoutParams().height = C7MY.LIZIZ(56);
                    }
                    c80261Vej2.setVisibility(0);
                    return;
                }
                o.LJIJI("adapter");
                throw null;
            }
            o.LJIJI("adapter");
            throw null;
        }
        o.LJIJI("adapter");
        throw null;
    }

    public static final void onChanged$1(AObserverS35S0400000_3 aObserverS35S0400000_3, Object obj) {
        C73305Spp c73305Spp;
        GiftResult giftPageList;
        List<GiftPage> giftPageList2;
        int LIZIZ;
        View view;
        View view2;
        TextView textView;
        View findViewById;
        C73305Spp c73305Spp2;
        C73305Spp c73305Spp3;
        View findViewById2;
        GiftResponse giftResponse = (GiftResponse) obj;
        if (giftResponse == null) {
            View view3 = ((C1792171p) aObserverS35S0400000_3.l0).LJII;
            if (view3 != null && (findViewById2 = view3.findViewById(R.id.dtx)) != null) {
                findViewById2.setVisibility(4);
            }
            View view4 = ((C1792171p) aObserverS35S0400000_3.l0).LJII;
            if (view4 != null && (c73305Spp3 = (C73305Spp) view4.findViewById(R.id.kf_)) != null) {
                c73305Spp3.setVisibility(0);
            }
            View view5 = ((C1792171p) aObserverS35S0400000_3.l0).LJII;
            if (view5 != null && (c73305Spp2 = (C73305Spp) view5.findViewById(R.id.kf_)) != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJIIJJI(c73306Spq, new AqS153S0100000_3((C1792171p) aObserverS35S0400000_3.l0, 1733));
                c73305Spp2.setStatus(c73306Spq);
                return;
            }
            return;
        }
        View view6 = ((C1792171p) aObserverS35S0400000_3.l0).LJII;
        if (view6 != null) {
            c73305Spp = (C73305Spp) view6.findViewById(R.id.kf_);
        } else {
            c73305Spp = null;
        }
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        View view7 = ((C1792171p) aObserverS35S0400000_3.l0).LJII;
        if (view7 != null && (findViewById = view7.findViewById(R.id.dtx)) != null) {
            findViewById.setVisibility(0);
        }
        final C1792171p c1792171p = (C1792171p) aObserverS35S0400000_3.l0;
        CPCPromptData cpcPromptData = giftResponse.getCpcPromptData();
        if (cpcPromptData != null) {
            View view8 = c1792171p.LJII;
            if (view8 != null) {
                view = view8.findViewById(R.id.n5s);
            } else {
                view = null;
            }
            View view9 = c1792171p.LJII;
            if (view9 != null) {
                view2 = view9.findViewById(R.id.dvh);
            } else {
                view2 = null;
            }
            if (!c1792171p.LJIIIIZZ) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Keva.getRepo("vg_cpc_prompt").getLong("last_cpc_prompt_time", 0L);
                if (elapsedRealtime - j > cpcPromptData.getNextPromptInterval() * 1000 || j == 0) {
                    c1792171p.LJIIIIZZ = true;
                } else {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                }
            }
            View view10 = c1792171p.LJII;
            if (view10 != null) {
                textView = (TextView) view10.findViewById(R.id.n5s);
            } else {
                textView = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(cpcPromptData.getPromptText());
            LIZ.append(' ');
            LIZ.append(cpcPromptData.getRedirectLinkText());
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            final int LIZIZ3 = C04330Ez.LIZIZ(c1792171p.LIZJ, R.color.c7);
            final int LIZIZ4 = C04330Ez.LIZIZ(c1792171p.LIZJ, R.color.c7);
            AbstractC188397aN abstractC188397aN = new AbstractC188397aN(LIZIZ3, LIZIZ4) { // from class: X.7aO
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view11) {
                    o.LJIIIZ(view11, "view");
                    String uriSettingString = (String) LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL().LIZJ("", "live_gift_cpc_faq_url");
                    o.LJIIIIZZ(uriSettingString, "uriSettingString");
                    C1792171p c1792171p2 = c1792171p;
                    LiveOuterService.LJJJLL().LJJIJIL().LJJJIL(c1792171p2.LIZJ, UriProtector.parse(uriSettingString));
                }

                @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    super.updateDrawState(ds);
                    T5S t5s = new T5S();
                    t5s.LIZ(82);
                    ds.setTypeface(t5s.getTypeface());
                    ds.setUnderlineText(false);
                }
            };
            int LJJLIIIJL = s.LJJLIIIJL(LIZIZ2, cpcPromptData.getRedirectLinkText(), 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZIZ2);
            spannableStringBuilder.setSpan(abstractC188397aN, LJJLIIIJL, cpcPromptData.getRedirectLinkText().length() + LJJLIIIJL, 34);
            if (textView != null) {
                textView.setHighlightColor(C04330Ez.LIZIZ(c1792171p.LIZJ, R.color.cz));
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(AnonymousClass894.LIZ());
            }
            if (view != null) {
                view.setVisibility(0);
            }
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else {
            c1792171p.getClass();
        }
        GiftResponse value = ((C1792171p) aObserverS35S0400000_3.l0).LIZLLL.lv0().getValue();
        if (value != null && (giftPageList = value.getGiftPageList()) != null && (giftPageList2 = giftPageList.getGiftPageList()) != null && (!giftPageList2.isEmpty())) {
            if (giftPageList2.size() > 1) {
                ((C80261Vej) aObserverS35S0400000_3.l1).setVisibility(0);
            }
            C1792171p c1792171p2 = (C1792171p) aObserverS35S0400000_3.l0;
            C1794972r c1794972r = (C1794972r) aObserverS35S0400000_3.l2;
            if (c1792171p2.LJFF) {
                ViewGroup.LayoutParams layoutParams = c1794972r.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (c1792171p2.LJI != null) {
                    if (C1792271q.LIZ()) {
                        LIZIZ = C7MY.LIZIZ(436);
                    } else {
                        LIZIZ = C7MY.LIZIZ(306);
                    }
                    marginLayoutParams.height = LIZIZ;
                    int i = (int) (C53946LFe.LIZJ(c1792171p2.LIZJ, null).LIZJ * 0.6d);
                    if (marginLayoutParams.height > i) {
                        marginLayoutParams.height = i;
                    }
                    marginLayoutParams.width = -1;
                    marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                    marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                    c1794972r.setLayoutParams(marginLayoutParams);
                } else {
                    o.LJIJI("adapter");
                    throw null;
                }
            }
            ((C1794972r) aObserverS35S0400000_3.l2).setVisibility(0);
            ((C8ID) aObserverS35S0400000_3.l3).setVisibility(8);
            return;
        }
        ((C1794972r) aObserverS35S0400000_3.l2).setVisibility(8);
        ((C8ID) aObserverS35S0400000_3.l3).setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$2(Y.AObserverS35S0400000_3 r8, java.lang.Object r9) {
        /*
            java.lang.Long r9 = (java.lang.Long) r9
            java.lang.Object r0 = r8.l0
            X.71p r0 = (X.C1792171p) r0
            com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel r0 = r0.LIZLLL
            androidx.lifecycle.MutableLiveData r0 = r0.jv0()
            java.lang.Object r0 = r0.getValue()
            r3 = 0
            java.lang.String r4 = "it"
            if (r0 == 0) goto L37
            java.lang.Object r0 = r8.l0
            X.71p r0 = (X.C1792171p) r0
            com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel r0 = r0.LIZLLL
            androidx.lifecycle.MutableLiveData r0 = r0.jv0()
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.comment.gift.model.GiftStruct r0 = (com.ss.android.ugc.aweme.comment.gift.model.GiftStruct) r0
            if (r0 == 0) goto Lbb
            int r0 = r0.getDiamondCount()
        L2b:
            long r1 = (long) r0
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r4)
            long r5 = r9.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L94
        L37:
            java.lang.Object r0 = r8.l1
            X.SY4 r0 = (X.SY4) r0
            r0.setEnabled(r3)
            java.lang.Object r1 = r8.l1
            X.SY4 r1 = (X.SY4) r1
            r0 = 2131231205(0x7f0801e5, float:1.8078484E38)
            r1.setBackgroundResource(r0)
            java.lang.Object r2 = r8.l1
            X.SY4 r2 = (X.SY4) r2
            java.lang.Object r0 = r8.l0
            X.71p r0 = (X.C1792171p) r0
            X.1qj r1 = r0.LIZJ
            r0 = 2131099729(0x7f060051, float:1.781182E38)
            int r0 = X.C04330Ez.LIZIZ(r1, r0)
            r2.setTextColor(r0)
        L5c:
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r4)
            long r6 = r9.longValue()
            r4 = -9223372036854775808
            r1 = 8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L85
            java.lang.Object r0 = r8.l2
            X.8ID r0 = (X.C8ID) r0
            r0.setVisibility(r1)
            java.lang.Object r0 = r8.l3
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r3)
            java.lang.Object r1 = r8.l3
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r1.setText(r0)
        L84:
            return
        L85:
            java.lang.Object r0 = r8.l2
            X.8ID r0 = (X.C8ID) r0
            r0.setVisibility(r3)
            java.lang.Object r0 = r8.l3
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r1)
            goto L84
        L94:
            java.lang.Object r1 = r8.l1
            X.SY4 r1 = (X.SY4) r1
            r0 = 1
            r1.setEnabled(r0)
            java.lang.Object r1 = r8.l1
            X.SY4 r1 = (X.SY4) r1
            r0 = 2131231204(0x7f0801e4, float:1.8078482E38)
            r1.setBackgroundResource(r0)
            java.lang.Object r2 = r8.l1
            X.SY4 r2 = (X.SY4) r2
            java.lang.Object r0 = r8.l0
            X.71p r0 = (X.C1792171p) r0
            X.1qj r1 = r0.LIZJ
            r0 = 2131099681(0x7f060021, float:1.7811722E38)
            int r0 = X.C04330Ez.LIZIZ(r1, r0)
            r2.setTextColor(r0)
            goto L5c
        Lbb:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS35S0400000_3.onChanged$2(Y.AObserverS35S0400000_3, java.lang.Object):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS35S0400000_3(X.C8ID r2, X.C80261Vej r3, X.C1792171p r4, X.C1794972r r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r5
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r5
            r0.l3 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS35S0400000_3.<init>(X.8ID, X.Vej, X.71p, X.72r, int):void");
    }

    public AObserverS35S0400000_3(C1792171p c1792171p, SY4 sy4, C8ID c8id, TextView textView, int i) {
        this.$t = i;
        this.l0 = c1792171p;
        this.l1 = sy4;
        this.l2 = c8id;
        this.l3 = textView;
    }
}
