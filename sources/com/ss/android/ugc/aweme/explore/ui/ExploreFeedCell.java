package com.ss.android.ugc.aweme.explore.ui;

import X.AnonymousClass831;
import X.AnonymousClass832;
import X.AnonymousClass833;
import X.AnonymousClass835;
import X.C16880lQ;
import X.C16950lX;
import X.C1BZ;
import X.C1JX;
import X.C200567u0;
import X.C2050482y;
import X.C2050582z;
import X.C2068389v;
import X.C206918Ad;
import X.C207008Am;
import X.C214298b3;
import X.C227768wm;
import X.C28289B8j;
import X.C32151Nz;
import X.C38995FSd;
import X.C45804HyK;
import X.C53946LFe;
import X.C56331M8x;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77123UOp;
import X.C78939UyV;
import X.C79045V0n;
import X.C7MY;
import X.C8A0;
import X.C8A1;
import X.C8A2;
import X.C8A3;
import X.C8A4;
import X.C8A5;
import X.C8A6;
import X.C8A7;
import X.C8A8;
import X.C8A9;
import X.C8AA;
import X.C8AB;
import X.C8AC;
import X.C8AD;
import X.C8AE;
import X.C8AF;
import X.C8AG;
import X.C8AH;
import X.C8AI;
import X.C8AJ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC206908Ac;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.LFH;
import X.O6R;
import X.OSZ;
import X.SY9;
import X.V8L;
import X.V92;
import X.VA9;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedImpressionManager;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreFeedCell extends PowerCell<C2050482y> implements View.OnTouchListener {
    public static Drawable LJLJL;
    public static SY9 LJLJLJ;
    public final C214298b3 LJLIL;
    public C200567u0 LJLILLLLZI;
    public final int LJLJI;
    public HashMap<String, String> LJLJJI;
    public final InterfaceC206908Ac LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public ExploreFeedCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExploreFeedImpressionManager.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 214);
        C8A7 c8a7 = C8A7.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C8A2.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 204), new AqS153S0100000_3((InterfaceC93923mO) this, 206), C8AI.INSTANCE, c8a7, new AqS153S0100000_3((InterfaceC93923mO) this, 208), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C8A4.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 210), new AqS153S0100000_3((InterfaceC93923mO) this, 205), C8AH.INSTANCE, c8a7, new AqS153S0100000_3((InterfaceC93923mO) this, 207), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C8A3.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 209), new AqS153S0100000_3((InterfaceC93923mO) this, 211), new AqS153S0100000_3((InterfaceC93923mO) this, 212), c8a7, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ExploreFeedListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ2, 213);
        C8A8 c8a8 = C8A8.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            new C214298b3(LIZ2, aqS153S0100000_32, C8A5.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 215), new AqS153S0100000_3((InterfaceC93923mO) this, 216), C8AJ.INSTANCE, c8a8, new AqS153S0100000_3((InterfaceC93923mO) this, 217), 256);
        } else if (o.LJ(c9be, c9be)) {
            new C214298b3(LIZ2, aqS153S0100000_32, C8A6.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 218), new AqS153S0100000_3((InterfaceC93923mO) this, 198), C8AG.INSTANCE, c8a8, new AqS153S0100000_3((InterfaceC93923mO) this, 199), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            new C214298b3(LIZ2, aqS153S0100000_32, C8A1.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 201), new AqS153S0100000_3((InterfaceC93923mO) this, 202), new AqS153S0100000_3((InterfaceC93923mO) this, 203), c8a8, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJI = C7MY.LIZIZ(16);
        this.LJLJJL = LFH.LIZIZ.LIZLLL().LIZ();
    }

    public final String P() {
        int layoutPosition;
        C1BZ c1bz;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C1BZ) && (c1bz = (C1BZ) layoutParams) != null) {
            layoutPosition = c1bz.LIZ();
        } else {
            layoutPosition = getLayoutPosition();
        }
        int LJJIIJ = LFH.LIZIZ.LIZLLL().LIZ().LJJIIJ(2);
        if (LJJIIJ == 2) {
            if (layoutPosition % LJJIIJ == 0) {
                return "left";
            }
            return "right";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(layoutPosition % LJJIIJ);
        LIZ.append('/');
        LIZ.append(LJJIIJ);
        return X1D.LIZIZ(LIZ);
    }

    public final void U() {
        String str;
        Aweme aweme;
        ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LJLIL.getValue();
        C2050482y item = getItem();
        if (item != null && (aweme = item.LJLIL) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(this, 109);
        if (str == null || str.length() == 0 || exploreFeedImpressionManager.LJLJI.contains(str)) {
            return;
        }
        exploreFeedImpressionManager.LJLJI.add(str);
        aqS169S0100000_3.invoke(((LinkedHashMap) exploreFeedImpressionManager.LJLILLLLZI).get(str));
    }

    public final void V() {
        String str;
        Aweme aweme;
        ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LJLIL.getValue();
        C2050482y item = getItem();
        if (item != null && (aweme = item.LJLIL) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 200);
        if (str == null || str.length() == 0 || exploreFeedImpressionManager.LJLIL.contains(str)) {
            return;
        }
        exploreFeedImpressionManager.LJLIL.add(str);
        exploreFeedImpressionManager.LJLILLLLZI.put(str, Long.valueOf(System.currentTimeMillis()));
        aqS153S0100000_3.invoke();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 39), this.itemView);
        _$_findCachedViewById(R.id.mr3).setOnTouchListener(this);
        _$_findCachedViewById(R.id.eiw).setOnTouchListener(this);
        _$_findCachedViewById(R.id.c_v).setOnTouchListener(this);
        this.itemView.setOnTouchListener(this);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.mr3), new ACListenerS23S0100000_3(this, 40));
        C16880lQ.LJJJJL((SmartAvatarImageView) _$_findCachedViewById(R.id.eiw), new ACListenerS23S0100000_3(this, 41));
        this.LJLILLLLZI = new C200567u0(new WeakReference(this.itemView.getContext()), new IDqS428S0100000_3(this, 5));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.c_v), new ACListenerS23S0100000_3(this, 42));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        V();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        U();
    }

    public static int L(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return str.length();
    }

    public static float N(Aweme aweme) {
        boolean z;
        UrlModel cover;
        Float valueOf;
        float f;
        Video video;
        Video video2 = aweme.getVideo();
        if (video2 != null && video2.getWidth() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || ((video = aweme.getVideo()) != null && video.getHeight() == 0)) {
            Video video3 = aweme.getVideo();
            if (video3 != null && (cover = video3.getCover()) != null) {
                valueOf = Float.valueOf((cover.getHeight() * 1.0f) / cover.getWidth());
            }
            valueOf = null;
        } else {
            if (aweme.getVideo() != null) {
                valueOf = Float.valueOf((r2.getHeight() * 1.0f) / r2.getWidth());
            }
            valueOf = null;
        }
        if (valueOf != null) {
            f = valueOf.floatValue();
        } else {
            f = 1.3333334f;
        }
        return Math.min(f, 1.3333334f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x010a, code lost:
    
        if (r9 > (-1)) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.OSZ T(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.ui.ExploreFeedCell.T(com.ss.android.ugc.aweme.feed.model.Aweme):X.OSZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r1 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.String r6) {
        /*
            r5 = this;
            android.view.View r1 = r5.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.content.Context r1 = r1.getContext()
            java.lang.String r0 = "//user/profile"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            X.Mm4 r0 = r5.getItem()
            X.82y r0 = (X.C2050482y) r0
            r3 = 0
            if (r0 == 0) goto Ld4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLIL
            if (r0 == 0) goto Ld4
            java.lang.String r1 = r0.getAuthorUid()
        L22:
            java.lang.String r0 = "uid"
            r2.withParam(r0, r1)
            X.Mm4 r0 = r5.getItem()
            X.82y r0 = (X.C2050482y) r0
            if (r0 == 0) goto Ld1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLIL
            if (r0 == 0) goto Ld1
            java.lang.String r1 = r0.getSecAuthorUid()
        L37:
            java.lang.String r0 = "sec_uid"
            r2.withParam(r0, r1)
            java.lang.String r0 = "enter_from"
            java.lang.String r4 = "homepage_explore"
            r2.withParam(r0, r4)
            java.lang.String r0 = "enter_method"
            r2.withParam(r0, r6)
            java.lang.String r0 = "previous_page"
            r2.withParam(r0, r4)
            java.lang.String r0 = "extra_from_pre_page"
            r2.withParam(r0, r4)
            java.lang.String r0 = "extra_from_event_enter_from"
            r2.withParam(r0, r4)
            X.Mm4 r0 = r5.getItem()
            X.82y r0 = (X.C2050482y) r0
            if (r0 == 0) goto Lcf
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLIL
            if (r0 == 0) goto Lcf
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto Lcf
            int r0 = r0.getCommerceUserLevel()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L71:
            java.lang.String r0 = "profile_enterprise_type"
            r2.withParam(r0, r1)
            X.Mm4 r0 = r5.getItem()
            X.82y r0 = (X.C2050482y) r0
            if (r0 == 0) goto Lcd
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLIL
            if (r0 == 0) goto Lcd
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto Lcd
            java.lang.String r1 = r0.getRequestId()
        L8c:
            java.lang.String r0 = "search_request_id"
            r2.withParam(r0, r1)
            r2.open()
            X.Mm4 r0 = r5.getItem()
            X.82y r0 = (X.C2050482y) r0
            if (r0 == 0) goto Lcb
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.LJLIL
            if (r2 == 0) goto La7
            java.lang.String r1 = r2.getAid()
            if (r1 != 0) goto La9
        La7:
            java.lang.String r1 = ""
        La9:
            java.lang.String r0 = "enter_personal_detail"
            X.C206978Aj.LIZLLL(r0, r1)
            X.8l2 r1 = X.C220488l2.LIZIZ
            X.7ZV r0 = new X.7ZV
            r0.<init>()
            r0.LIZLLL = r4
            r0.LJJLI = r6
            r0.LJJIJ(r2)
            java.lang.Object r1 = r1.LJII(r2, r0)
            r0 = 14
            X.C222578oP.LIZJ(r1, r2, r3, r3, r0)
            X.JHM r1 = (X.JHM) r1
            r1.LJIILIIL()
            return
        Lcb:
            r2 = r3
            goto La7
        Lcd:
            r1 = r3
            goto L8c
        Lcf:
            r1 = r3
            goto L71
        Ld1:
            r1 = r3
            goto L37
        Ld4:
            r1 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.ui.ExploreFeedCell.M(java.lang.String):void");
    }

    public final void Y(Layout layout) {
        HashMap<String, String> hashMap;
        String str;
        String str2;
        String str3;
        int i;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        C8A0 c8a0;
        String Q = Q(layout, ((AppCompatTextView) _$_findCachedViewById(R.id.mqv)).getText().toString());
        C2050482y item = getItem();
        LogPbBean logPbBean = null;
        if (item == null || (aweme4 = item.LJLIL) == null) {
            hashMap = null;
        } else {
            OSZ T = T(aweme4);
            String str4 = (String) T.getFirst();
            if (!TextUtils.isEmpty(str4)) {
                c8a0 = (C8A0) T.getSecond();
            } else {
                c8a0 = C8A0.NONE;
            }
            if (!TextUtils.isEmpty(str4)) {
                str4 = Q(layout, str4);
            }
            hashMap = new HashMap<>();
            hashMap.put("is_description_title", String.valueOf(c8a0.getValue()));
            if (c8a0 == C8A0.DESC || c8a0 == C8A0.TITLE_AND_DESC) {
                hashMap.put("displayed_description_length", String.valueOf(L(str4)));
            }
            if (c8a0 == C8A0.TITLE || c8a0 == C8A0.TITLE_AND_DESC) {
                hashMap.put("displayed_title_length", String.valueOf(L(str4)));
            }
            hashMap.putAll(C227768wm.LJIJJLI(aweme4));
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                aweme4.appendMobParam(entry.getKey(), entry.getValue());
            }
        }
        this.LJLJJI = hashMap;
        String P = P();
        C2050482y item2 = getItem();
        if (item2 != null && (aweme3 = item2.LJLIL) != null) {
            str = aweme3.getAid();
        } else {
            str = null;
        }
        C2050482y item3 = getItem();
        if (item3 != null && (aweme2 = item3.LJLIL) != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        C2050482y item4 = getItem();
        if (item4 != null) {
            str3 = item4.LJLJI;
        } else {
            str3 = null;
        }
        C2050482y item5 = getItem();
        if (item5 != null) {
            logPbBean = item5.LJLJJI;
        }
        C2050482y item6 = getItem();
        if (item6 != null && (aweme = item6.LJLIL) != null) {
            i = aweme.getAwemeType();
        } else {
            i = 0;
        }
        C207008Am.LIZ(new AnonymousClass832(P, str, str2, str3, logPbBean, i, Q, ((AppCompatTextView) _$_findCachedViewById(R.id.mqv)).getText().toString(), this.LJLJJI));
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            View findViewById = itemView.findViewById(i);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void a0(Aweme aweme) {
        long j;
        if (aweme == null) {
            return;
        }
        ((AnonymousClass833) _$_findCachedViewById(R.id.ejj)).setSelected(aweme.isLike());
        TextView textView = (TextView) _$_findCachedViewById(R.id.mr0);
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        boolean LJLJLLL = C63081OpJ.LJLJLLL(aweme);
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!LJLJLLL && j > 0) {
            str = C77123UOp.LJJIIJ(j);
        }
        textView.setText(str);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C2050482y c2050482y) {
        UrlModel cover;
        C2050482y t = c2050482y;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Aweme aweme = t.LJLIL;
        C200567u0 c200567u0 = this.LJLILLLLZI;
        if (c200567u0 != null) {
            c200567u0.LJ(aweme);
            ((ImageView) _$_findCachedViewById(R.id.ejq)).setVisibility(8);
            _$_findCachedViewById(R.id.mqv).setVisibility(8);
            boolean z = AnonymousClass835.LIZ;
            if (!z) {
                ((TextView) _$_findCachedViewById(R.id.mqv)).setText("");
            }
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.ej9).getLayoutParams();
            InterfaceC206908Ac interfaceC206908Ac = this.LJLJJL;
            int i = (C53946LFe.LIZJ(this.itemView.getContext(), null).LIZIZ - (C206918Ad.LJLJJI * 3)) / 2;
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            layoutParams.width = interfaceC206908Ac.LJIIIZ(C45804HyK.LJJIFFI(context), i);
            if (aweme.isPhotoMode()) {
                ((ImageView) _$_findCachedViewById(R.id.ejq)).setVisibility(0);
                _$_findCachedViewById(R.id.ej9).getLayoutParams().height = (int) (N(aweme) * _$_findCachedViewById(R.id.ej9).getLayoutParams().width);
            } else {
                _$_findCachedViewById(R.id.ej9).getLayoutParams().height = (int) (N(aweme) * _$_findCachedViewById(R.id.ej9).getLayoutParams().width);
            }
            boolean z2 = C8A9.LIZ;
            if (!z2) {
                _$_findCachedViewById(R.id.d1x).setBackground(null);
            } else if (C8AA.LIZ != 2) {
                _$_findCachedViewById(R.id.d1x).setBackgroundResource(R.drawable.atf);
            }
            float LIZIZ = C7MY.LIZIZ(C8AA.LIZ);
            if (z2) {
                V92 v92 = (V92) ((VA9) _$_findCachedViewById(R.id.ej9)).getHierarchy();
                V8L v8l = new V8L();
                v8l.LJ(LIZIZ, LIZIZ, 0.0f, 0.0f);
                v92.LJIL(v8l);
            } else {
                V92 v922 = (V92) ((VA9) _$_findCachedViewById(R.id.ej9)).getHierarchy();
                V8L v8l2 = new V8L();
                v8l2.LJFF(LIZIZ);
                v922.LJIL(v8l2);
            }
            int LIZIZ2 = C7MY.LIZIZ(C8AC.LIZ);
            int LIZIZ3 = C7MY.LIZIZ(C8AE.LIZ);
            _$_findCachedViewById(R.id.d1x).setPadding(LIZIZ2, LIZIZ3, LIZIZ2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            ((TextView) _$_findCachedViewById(R.id.mqv)).setPadding(0, 0, 0, LIZIZ3);
            if (C8AF.LIZ != 0) {
                ((TuxTextView) _$_findCachedViewById(R.id.mr3)).setTuxFont(71);
            }
            if (C8AB.LIZ != 0) {
                ((TuxTextView) _$_findCachedViewById(R.id.mqv)).setTuxFont(62);
            }
            ((TextView) _$_findCachedViewById(R.id.mqv)).setMaxLines(C8AD.LIZ);
            Video video = aweme.getVideo();
            if (video != null && (cover = video.getCover()) != null) {
                if (z) {
                    VA9 va9 = (VA9) _$_findCachedViewById(R.id.ej9);
                    Context context2 = _$_findCachedViewById(R.id.ej9).getContext();
                    o.LJIIIIZZ(context2, "img_cover.context");
                    if (LJLJL == null) {
                        LJLJL = C79045V0n.LJIIIIZZ(R.attr.cj, context2);
                    }
                    Drawable drawable = LJLJL;
                    if (drawable == null) {
                        Context context3 = _$_findCachedViewById(R.id.ej9).getContext();
                        o.LJIIIIZZ(context3, "img_cover.context");
                        drawable = C79045V0n.LJIIIIZZ(R.attr.cj, context3);
                    }
                    va9.setImageDrawable(drawable);
                    C38995FSd.LIZLLL().execute(new ARunnableS22S0200000_3(cover, this, 63));
                } else {
                    W5F LJII = W5U.LJII(C78939UyV.LJ(cover));
                    LJII.LIZJ = _$_findCachedViewById(R.id.ej9).getContext();
                    Context context4 = _$_findCachedViewById(R.id.ej9).getContext();
                    o.LJIIIIZZ(context4, "img_cover.context");
                    LJII.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cj, context4);
                    int i2 = _$_findCachedViewById(R.id.ej9).getLayoutParams().width;
                    int i3 = _$_findCachedViewById(R.id.ej9).getLayoutParams().height;
                    LJII.LJII = i2;
                    LJII.LJIIIIZZ = i3;
                    LJII.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.ej9);
                    C16880lQ.LLJJJ(LJII);
                }
            }
            String str = (String) T(aweme).getFirst();
            if (str.length() > 0) {
                _$_findCachedViewById(R.id.mqv).setVisibility(0);
                ((TextView) _$_findCachedViewById(R.id.mqv)).setText(str);
            }
            User author = aweme.getAuthor();
            if (author != null) {
                if (z) {
                    C38995FSd.LIZLLL().execute(new ARunnableS22S0200000_3(author, this, 64));
                } else {
                    W5F LJI = C1JX.LJI(author);
                    int i4 = this.LJLJI;
                    LJI.LJII = i4;
                    LJI.LJIIIIZZ = i4;
                    LJI.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.eiw);
                    C16880lQ.LLJJJ(LJI);
                }
                ((TextView) _$_findCachedViewById(R.id.mr3)).setText(C56331M8x.LJ(aweme, "homepage_explore"));
            }
            a0(aweme);
            return;
        }
        o.LJIJI("diggUseCase");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (AnonymousClass835.LIZ) {
            View LIZ = C16950lX.LIZ(parent.getContext(), R.layout.aui, parent, false, -1);
            TuxIconView tuxIconView = (TuxIconView) LIZ.findViewById(R.id.ejq);
            if (tuxIconView != null) {
                Context context = parent.getContext();
                o.LJIIIIZZ(context, "parent.context");
                if (LJLJLJ == null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_image_alt_1_fill;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    c2068389v.LJFF = true;
                    LJLJLJ = c2068389v.LIZ(context);
                }
                tuxIconView.setImageDrawable(LJLJLJ);
            }
            return LIZ;
        }
        View LIZ2 = C28289B8j.LIZ(parent, R.layout.aui, parent, false);
        TuxIconView tuxIconView2 = (TuxIconView) LIZ2.findViewById(R.id.ejq);
        if (tuxIconView2 != null) {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_image_alt_1_fill;
            c2068389v2.LJ = Integer.valueOf(R.attr.dj);
            c2068389v2.LJFF = true;
            tuxIconView2.setTuxIcon(c2068389v2);
        }
        return LIZ2;
    }

    public static String Q(Layout layout, String str) {
        int ellipsisStart;
        if (layout == null || layout.getLineCount() <= 1 || (ellipsisStart = layout.getEllipsisStart(1)) <= 0) {
            return str;
        }
        String substring = str.substring(0, layout.getLineEnd(0) + ellipsisStart);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void X(Layout layout, Long l) {
        String str;
        String str2;
        String str3;
        int i;
        long j;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        String charSequence = ((AppCompatTextView) _$_findCachedViewById(R.id.mqv)).getText().toString();
        String Q = Q(layout, charSequence);
        String P = P();
        C2050482y item = getItem();
        LogPbBean logPbBean = null;
        if (item != null && (aweme3 = item.LJLIL) != null) {
            str = aweme3.getAid();
        } else {
            str = null;
        }
        C2050482y item2 = getItem();
        if (item2 != null && (aweme2 = item2.LJLIL) != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        C2050482y item3 = getItem();
        if (item3 != null) {
            str3 = item3.LJLJI;
        } else {
            str3 = null;
        }
        C2050482y item4 = getItem();
        if (item4 != null) {
            logPbBean = item4.LJLJJI;
        }
        C2050482y item5 = getItem();
        if (item5 != null && (aweme = item5.LJLIL) != null) {
            i = aweme.getAwemeType();
        } else {
            i = 0;
        }
        if (l != null) {
            j = System.currentTimeMillis() - l.longValue();
        } else {
            j = -1;
        }
        C207008Am.LIZ(new AnonymousClass831(P, str, str2, str3, logPbBean, i, Q, charSequence, j, this.LJLJJI));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C2050482y t, List payloads) {
        Aweme aweme;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        super.onBindItemView(t, payloads);
        if ((!payloads.isEmpty()) && (ListProtector.get(payloads, 0) instanceof C2050582z)) {
            C200567u0 c200567u0 = this.LJLILLLLZI;
            Aweme aweme2 = null;
            if (c200567u0 != null) {
                C2050482y item = getItem();
                if (item != null) {
                    aweme = item.LJLIL;
                } else {
                    aweme = null;
                }
                c200567u0.LJ(aweme);
                C2050482y item2 = getItem();
                if (item2 != null) {
                    aweme2 = item2.LJLIL;
                }
                a0(aweme2);
                return;
            }
            o.LJIJI("diggUseCase");
            throw null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean LJ;
        int i;
        if (motionEvent == null) {
            return false;
        }
        if (o.LJ(view, _$_findCachedViewById(R.id.eiw))) {
            LJ = true;
        } else {
            LJ = o.LJ(view, _$_findCachedViewById(R.id.mr3));
        }
        if (LJ) {
            if (motionEvent.getAction() == 0) {
                _$_findCachedViewById(R.id.mr3).setAlpha(0.2f);
                _$_findCachedViewById(R.id.eiw).setAlpha(0.2f);
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                _$_findCachedViewById(R.id.mr3).setAlpha(1.0f);
                _$_findCachedViewById(R.id.eiw).setAlpha(1.0f);
            }
        } else if (o.LJ(view, _$_findCachedViewById(R.id.c_v))) {
            if (motionEvent.getAction() == 0) {
                _$_findCachedViewById(R.id.c_v).setAlpha(0.2f);
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                _$_findCachedViewById(R.id.c_v).setAlpha(1.0f);
            }
        } else if (o.LJ(view, this.itemView)) {
            if (motionEvent.getAction() == 0) {
                _$_findCachedViewById(R.id.geh).getLayoutParams().height = this.itemView.getMeasuredHeight();
                View _$_findCachedViewById = _$_findCachedViewById(R.id.geh);
                int i2 = C8AA.LIZ;
                if (i2 != 6) {
                    if (i2 != 8) {
                        i = R.drawable.ati;
                    } else {
                        i = R.drawable.atk;
                    }
                } else {
                    i = R.drawable.atj;
                }
                _$_findCachedViewById.setBackgroundResource(i);
                _$_findCachedViewById(R.id.geh).setVisibility(0);
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                _$_findCachedViewById(R.id.geh).setVisibility(8);
            }
        }
        return false;
    }
}
