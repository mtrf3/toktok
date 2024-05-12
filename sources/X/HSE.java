package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS60S0100000_7;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class HSE extends C8IM {
    public Aweme LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;
    public final SmartImageView LJLJLJ;
    public long LJLJLLL;
    public InterfaceC44105HSr LJLL;
    public AnchorCommonStruct LJLLI;

    @Override // X.C8IG
    public final void LIZIZ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C188727au getOriginalMobParam() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r7.LJLLI
            r6 = 0
            if (r0 == 0) goto L99
            java.lang.String r3 = r0.getLogExtra()
        L9:
            java.lang.String r5 = ""
            if (r3 != 0) goto Le
            r3 = r5
        Le:
            X.7au r2 = new X.7au
            r2.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJJL
            java.lang.String r4 = "aweme"
            if (r0 == 0) goto La4
            java.lang.String r1 = r0.getAuthorUid()
            java.lang.String r0 = "author_id"
            r2.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJJL
            if (r0 == 0) goto La0
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L97
        L2c:
            java.lang.String r0 = "group_id"
            r2.LJIIIZ(r0, r5)
            X.HSr r0 = r7.LJLL
            if (r0 == 0) goto L95
            java.lang.String r1 = r0.LJJLJLI()
        L39:
            java.lang.String r0 = "enter_from"
            r2.LJIIIZ(r0, r1)
            X.HSI r0 = new X.HSI
            r0.<init>(r3)
            java.lang.String r1 = r0.LIZLLL()
            java.lang.String r0 = "anchor_type"
            r2.LJIIIZ(r0, r1)
            X.HSI r0 = new X.HSI
            r0.<init>(r3)
            java.lang.String r1 = r0.LIZJ()
            java.lang.String r0 = "anchor_name"
            r2.LJIIIZ(r0, r1)
            X.HSI r0 = new X.HSI
            r0.<init>(r3)
            java.lang.String r1 = r0.LIZ()
            java.lang.String r0 = "anchor_id"
            r2.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = r7.LJLLI
            if (r0 != 0) goto L81
        L6c:
            java.lang.String r1 = "0"
        L6e:
            java.lang.String r0 = "is_mobile_effect"
            r2.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LJLJJL
            if (r0 == 0) goto L9c
            java.lang.String r1 = X.C227768wm.LJIIJJI(r0)
            java.lang.String r0 = "music_id"
            r2.LJIIIZ(r0, r1)
            return r2
        L81:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6c
            java.lang.String r0 = r0.getExtra()     // Catch: org.json.JSONException -> L6c
            r1.<init>(r0)     // Catch: org.json.JSONException -> L6c
            java.lang.String r0 = "mobile_effect_type"
            boolean r0 = r1.optBoolean(r0)     // Catch: org.json.JSONException -> L6c
            if (r0 == 0) goto L6c
            java.lang.String r1 = "1"
            goto L6e
        L95:
            r1 = r6
            goto L39
        L97:
            r5 = r0
            goto L2c
        L99:
            r3 = r6
            goto L9
        L9c:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r6
        La0:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r6
        La4:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HSE.getOriginalMobParam():X.7au");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HSE(Context context) {
        super(context);
        a1.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ae7, C16880lQ.LLZIL(context), this);
        if (C87026YDm.LIZIZ()) {
            C7GV.LIZ(4, LLLZIIL);
        } else {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.ch);
            c110614Vt.LIZJ = C61328O5c.LIZJ(4);
            LLLZIIL.setBackground(c110614Vt.LIZ(context));
        }
        findViewById(R.id.g6o);
        this.LJLJJLL = (TuxTextView) findViewById(R.id.mo6);
        this.LJLJLJ = (SmartImageView) findViewById(R.id.f51);
        this.LJLJL = (TuxTextView) findViewById(R.id.mlr);
    }

    @Override // X.C8IM
    public final boolean LJII(C188727au c188727au) {
        Aweme aweme = this.LJLJJL;
        String str = null;
        if (aweme != null) {
            InterfaceC44105HSr interfaceC44105HSr = this.LJLL;
            if (interfaceC44105HSr != null) {
                str = interfaceC44105HSr.LJJLJLI();
            }
            C211648Si.LIZ(c188727au, aweme, str, true);
            FMX.LJIIL("multi_anchor_entrance_show", c188727au.LIZ);
            FMX.LJIIL("anchor_entrance_show", c188727au.LIZ);
            return true;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // X.C8IG
    public final void LJ(C188727au c188727au, InterfaceC88472Yns<? super Boolean, C76800UCe> useCustomAction) {
        o.LJIIIZ(useCustomAction, "useCustomAction");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.LJLJLLL > 300) {
            this.LJLJLLL = elapsedRealtime;
            AVExternalServiceImpl.LIZ().asyncService("pugc_template", new IDLCallbackS60S0100000_7(this, 8));
            Aweme aweme = this.LJLJJL;
            String str = null;
            if (aweme != null) {
                InterfaceC44105HSr interfaceC44105HSr = this.LJLL;
                if (interfaceC44105HSr != null) {
                    str = interfaceC44105HSr.LJJLJLI();
                }
                C211648Si.LIZ(c188727au, aweme, str, false);
                FMX.LJIIL("multi_anchor_entrance_click", c188727au.LIZ);
                FMX.LJIIL("anchor_entrance_click", c188727au.LIZ);
                return;
            }
            o.LJIJI("aweme");
            throw null;
        }
    }

    @Override // X.C8IG
    public final void LIZLLL(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, int i, InterfaceC65784Pro commonClickAction) {
        UrlModel icon;
        TuxTextView tuxTextView;
        String str;
        AnchorCommonStruct anchorCommonStruct2;
        String str2 = "";
        o.LJIIIZ(commonClickAction, "commonClickAction");
        this.LJLJJL = interfaceC44105HSr.LJJLL();
        this.LJLL = interfaceC44105HSr;
        String str3 = null;
        if (anchorCommonStruct.getType() != EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
            Aweme aweme = this.LJLJJL;
            if (aweme != null) {
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                o.LJIIIIZZ(anchors, "aweme.anchors");
                Iterator<AnchorCommonStruct> it = anchors.iterator();
                while (true) {
                    if (it.hasNext()) {
                        anchorCommonStruct2 = it.next();
                        if (anchorCommonStruct2.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                            break;
                        }
                    } else {
                        anchorCommonStruct2 = null;
                        break;
                    }
                }
                this.LJLLI = anchorCommonStruct2;
            } else {
                o.LJIJI("aweme");
                throw null;
            }
        } else {
            this.LJLLI = anchorCommonStruct;
        }
        try {
            AnchorCommonStruct anchorCommonStruct3 = this.LJLLI;
            if (anchorCommonStruct3 == null || (str = anchorCommonStruct3.getExtra()) == null) {
                str = "";
            }
            Object opt = new JSONObject(str).opt("author_nick_name");
            if (opt != null) {
                String obj = opt.toString();
                if (obj != null) {
                    str2 = obj;
                }
            }
        } catch (Exception unused) {
        }
        TuxTextView tuxTextView2 = this.LJLJJLL;
        if (tuxTextView2 != null) {
            AnchorCommonStruct anchorCommonStruct4 = this.LJLLI;
            if (anchorCommonStruct4 != null) {
                str3 = anchorCommonStruct4.getKeyword();
            }
            tuxTextView2.setText(str3);
        }
        if (C78685UuP.LJJJZ(str2) && (tuxTextView = this.LJLJL) != null) {
            tuxTextView.setText(getContext().getString(R.string.pr, str2));
        }
        AnchorCommonStruct anchorCommonStruct5 = this.LJLLI;
        if (anchorCommonStruct5 != null && (icon = anchorCommonStruct5.getIcon()) != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(icon));
            LJII.LJJIIJ = this.LJLJLJ;
            C16880lQ.LLJJJ(LJII);
        }
    }
}
