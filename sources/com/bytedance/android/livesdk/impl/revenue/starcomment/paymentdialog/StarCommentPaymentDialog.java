package com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog;

import X.B83;
import X.BCG;
import X.BCW;
import X.BJM;
import X.BQO;
import X.BY6;
import X.BZI;
import X.C03880Dg;
import X.C04270Et;
import X.C05170If;
import X.C07840Sm;
import X.C15380j0;
import X.C15650jR;
import X.C15670jT;
import X.C15960jw;
import X.C16880lQ;
import X.C1Q4;
import X.C23010vJ;
import X.C259910h;
import X.C276516r;
import X.C28507BGt;
import X.C28590BJy;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29800Bmm;
import X.C2A7;
import X.C30725C4b;
import X.C31538CZi;
import X.C31540CZk;
import X.C31541CZl;
import X.C31547CZr;
import X.C32206CkU;
import X.C47071t1;
import X.C47121t6;
import X.C55457Lpd;
import X.C65300Pk0;
import X.C72242sW;
import X.C72972SkS;
import X.C77453UaX;
import X.C78720Uuy;
import X.CCJ;
import X.CN1;
import X.CV2;
import X.CVF;
import X.CVL;
import X.CVT;
import X.CZX;
import X.CZZ;
import X.CountDownTimerC31539CZj;
import X.EnumC31545CZp;
import X.InterfaceC05190Ih;
import X.InterfaceC29405BgP;
import X.InterfaceC29882Bo6;
import X.InterfaceC30442Bx8;
import X.InterfaceC31532CZc;
import X.Q8U;
import X.V2J;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.IDCallbackS367S0100000_5;
import Y.IDObjectS178S0100000_5;
import Y.IDcS170S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.dataChannel.OrientationChangedChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import tikcast.api.privilege.StarCommentItem;
import tikcast.api.privilege.StarCommentPurchaseResponse;
import tikcast.api.privilege.StarCommentQueue;
import ujb.s;

/* loaded from: classes6.dex */
public final class StarCommentPaymentDialog extends LiveDialogFragment implements InterfaceC31532CZc {
    public static final /* synthetic */ int LLIIJLIL = 0;
    public C31538CZi LJLILLLLZI;
    public V2J LJLJI;
    public C31540CZk LJLJJI;
    public RecyclerView LJLJL;
    public C31541CZl LJLJLJ;
    public C2A7 LJLJLLL;
    public LinearLayout LJLL;
    public View LJLLI;
    public CVT LJLLILLLL;
    public C47121t6 LJLLJ;
    public LiveEditText LJLLL;
    public FrameLayout LJLLLL;
    public View LJLZ;
    public CountDownTimerC31539CZj LJZ;
    public int LJZI;
    public C47121t6 LL;
    public View LLD;
    public boolean LLF;
    public long LLFF;
    public C47121t6 LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public int LLI;
    public long LLIFFJFJJ;
    public int LLII;
    public long LLIIII;
    public boolean LLIIIILZ;
    public Context LLIIIL;
    public final Map<Integer, View> LLIIJI = new LinkedHashMap();
    public boolean LJLIL = true;
    public String LJLJJL = CVF.LJFF;
    public final List<C31540CZk> LJLJJLL = new ArrayList();
    public int LJLLLLLL = 50;
    public String LJZL = "";
    public String LLIIIJ = "";
    public final Handler LLIIIZ = new Handler(C16880lQ.LLJJJJ(), new IDCallbackS367S0100000_5(this, 1));

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        Boolean bool;
        int i;
        int i2;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        boolean LJJ = C29306Beo.LJJ(bool);
        this.LJLIL = LJJ;
        if (LJJ) {
            i = R.style.acy;
            i2 = R.layout.d11;
        } else {
            i = R.style.abq;
            i2 = R.layout.d12;
        }
        C28507BGt c28507BGt = new C28507BGt(i2);
        c28507BGt.LIZJ = i;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 48;
        c28507BGt.LJII = 80;
        if (!this.LJLIL) {
            c28507BGt.LJIIIZ = C15380j0.LJFF(R.dimen.ad9);
            c28507BGt.LJII = 5;
        }
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        int i;
        if (this.LJLIL) {
            i = R.layout.d11;
        } else {
            i = R.layout.d12;
        }
        return new BY6(i);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        long j;
        EnumC31545CZp enumC31545CZp;
        String str = this.LJLJJL;
        C31540CZk c31540CZk = this.LJLJJI;
        if (c31540CZk != null && (enumC31545CZp = c31540CZk.LJ) != null) {
            i = enumC31545CZp.ordinal();
        } else {
            i = 0;
        }
        CVF.LJFF = str;
        CVF.LIZIZ = i;
        this.LLIIIZ.removeMessages(1);
        CountDownTimerC31539CZj countDownTimerC31539CZj = this.LJZ;
        if (countDownTimerC31539CZj != null) {
            countDownTimerC31539CZj.cancel();
        }
        int i2 = this.LLFZ;
        if (i2 == 0) {
            j = 0;
        } else {
            j = this.LLIFFJFJJ / i2;
        }
        long currentTimeMillis = (System.currentTimeMillis() - this.LLFF) / 1000;
        String str2 = this.LLIIIJ;
        if (str2 == null) {
            str2 = "";
        }
        int i3 = this.LLFZ;
        int i4 = this.LLI;
        int i5 = this.LLII;
        boolean z = this.LLIIIILZ;
        BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_exit");
        LIZ.LJIIZILJ();
        CVL.LIZ(LIZ);
        LIZ.LJIJJ(Long.valueOf(currentTimeMillis), "stay_duration");
        LIZ.LJIJJ(str2, "enter_from");
        LIZ.LJIJJ(Integer.valueOf(i3), "countdown_request_count");
        LIZ.LJIJJ(Integer.valueOf(i4), "countdown_success_count");
        LIZ.LJIJJ(Long.valueOf(j), "countdown_avg_duration");
        LIZ.LJIJJ(Integer.valueOf(i5), "countdown_not_empty_count");
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "buyed");
        LIZ.LJJIIJZLJL();
        super.onDestroy();
    }

    public final boolean xl() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        String charSequence;
        String str = this.LJLJJL;
        if (str != null && (charSequence = s.LJZI(str).toString()) != null && charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJZI == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = this.LJLJJL;
        if (str2 != null) {
            i = str2.length();
        } else {
            i = 0;
        }
        if (i > this.LJLLLLLL) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && !z3) {
            return true;
        }
        return false;
    }

    public final void Kl() {
        Drawable drawable = null;
        if (!xl()) {
            C2A7 c2a7 = this.LJLJLLL;
            if (c2a7 != null) {
                Context context = getContext();
                if (context != null) {
                    drawable = C04270Et.LIZIZ(context, R.drawable.clz);
                }
                c2a7.setBackground(drawable);
            }
            C2A7 c2a72 = this.LJLJLLL;
            if (c2a72 != null) {
                c2a72.setTextColor(getResources().getColor(R.color.aac));
                return;
            }
            return;
        }
        C2A7 c2a73 = this.LJLJLLL;
        if (c2a73 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                drawable = C04270Et.LIZIZ(context2, R.drawable.cm0);
            }
            c2a73.setBackground(drawable);
        }
        C2A7 c2a74 = this.LJLJLLL;
        if (c2a74 == null) {
            return;
        }
        c2a74.setTextColor(ColorProtector.parseColor("#191A1D"));
    }

    public final void Dl(int i) {
        int i2;
        String str;
        long j;
        int i3;
        long j2;
        CZZ czz;
        String str2 = this.LJLJJL;
        EnumC31545CZp enumC31545CZp = null;
        if (str2 != null) {
            String charSequence = s.LJZI(str2).toString();
            int i4 = 0;
            if (charSequence == null || charSequence.length() == 0) {
                return;
            }
            String str3 = this.LJLJJL;
            if (str3 != null) {
                i2 = str3.length();
            } else {
                i2 = 0;
            }
            if (i2 > this.LJLLLLLL || this.LLF) {
                return;
            }
            this.LLF = true;
            C31540CZk c31540CZk = this.LJLJJI;
            if (c31540CZk == null || (str = c31540CZk.LJFF) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            long j3 = 0;
            try {
                j = CastLongProtector.parseLong(str);
            } catch (NumberFormatException unused) {
                j = 0;
            }
            C31540CZk c31540CZk2 = this.LJLJJI;
            if (c31540CZk2 != null) {
                enumC31545CZp = c31540CZk2.LJ;
            }
            if (enumC31545CZp == EnumC31545CZp.LOW) {
                i3 = 10;
            } else {
                i3 = 20;
            }
            if (c31540CZk2 != null) {
                j2 = c31540CZk2.LIZ;
            } else {
                j2 = 0;
            }
            C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
            if (gr != null) {
                i4 = gr.LJIIJJI;
            }
            CVF.LIZLLL = i4;
            if (gr != null) {
                j3 = gr.LIZIZ;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(BJM.LJFF());
            LIZ.append('-');
            LIZ.append(BJM.LJIIIIZZ());
            String LIZIZ = X1D.LIZIZ(LIZ);
            C2A7 c2a7 = this.LJLJLLL;
            if (c2a7 != null) {
                c2a7.LJII();
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (czz = (CZZ) dataChannel.kv0(CV2.class)) == null) {
                return;
            }
            String str4 = this.LJLJJL;
            if (str4 == null) {
                str4 = "";
            }
            czz.LIZJ(new CZX(j, str4, i3, j2, j3, i, LIZIZ, this.LLIIIJ, new WeakReference(this)));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(5:3|(1:37)|5|(1:36)|7)(1:38)|8|(2:10|(11:12|13|(1:17)|18|(1:33)|22|23|24|(1:26)(1:30)|27|28))(1:35)|34|13|(2:15|17)|18|(1:20)|33|22|23|24|(0)(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gl(boolean r19) {
        /*
            r18 = this;
            r1 = 1
            r14 = r18
            r13 = r19
            if (r13 == 0) goto L54
            android.widget.LinearLayout r1 = r14.LJLL
            if (r1 != 0) goto L4e
        Lb:
            X.CVT r1 = r14.LJLLILLLL
            if (r1 != 0) goto L49
        Lf:
            r4 = 1
        L10:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r14.dataChannel
            r3 = 0
            if (r1 == 0) goto L46
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            if (r2 == 0) goto L47
            long r0 = r2.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L27:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L37
            com.bytedance.android.live.base.model.user.User r0 = r2.getOwner()
            if (r0 == 0) goto L37
            java.lang.String r3 = r0.getSecUid()
        L37:
            java.lang.String r5 = java.lang.String.valueOf(r3)
            X.CZk r0 = r14.LJLJJI
            if (r0 == 0) goto L43
            java.lang.String r0 = r0.LJFF
            if (r0 != 0) goto L5b
        L43:
            java.lang.String r0 = "0"
            goto L5b
        L46:
            r2 = r3
        L47:
            r0 = r3
            goto L27
        L49:
            r0 = 0
            r1.setVisibility(r0)
            goto Lf
        L4e:
            r0 = 8
            r1.setVisibility(r0)
            goto Lb
        L54:
            android.os.Handler r0 = r14.LLIIIZ
            r0.removeMessages(r1)
            r4 = 2
            goto L10
        L5b:
            long r7 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L60
            goto L62
        L60:
            r7 = 0
        L62:
            X.CZk r0 = r14.LJLJJI
            if (r0 == 0) goto L9b
            long r9 = r0.LIZ
        L68:
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi> r0 = com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi.class
            java.lang.Object r3 = X.Q7L.LIZIZ(r0)
            com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi r3 = (com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi) r3
            long r11 = r14.LLIIII
            X.Svk r0 = r3.getPurchasePage(r4, r5, r6, r7, r9, r11)
            X.Svk r1 = X.C1EW.LIZ(r0)
            X.Cdf r0 = X.BTJ.LIZIZ(r14)
            X.Svk r1 = r1.LJII(r0)
            Y.AfS0S0110100_5 r12 = new Y.AfS0S0110100_5
            r17 = 0
            r12.<init>(r13, r14, r15, r17)
            Y.AfS0S0110100_5 r0 = new Y.AfS0S0110100_5
            r7 = 1
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r7)
            r1.LJJJLIIL(r12, r0)
            return
        L9b:
            r9 = 0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog.Gl(boolean):void");
    }

    public final void Hl(long j) {
        if (j >= 0) {
            CountDownTimerC31539CZj countDownTimerC31539CZj = this.LJZ;
            if (countDownTimerC31539CZj != null) {
                countDownTimerC31539CZj.cancel();
            }
            CountDownTimerC31539CZj countDownTimerC31539CZj2 = new CountDownTimerC31539CZj(this, j * 1000);
            this.LJZ = countDownTimerC31539CZj2;
            countDownTimerC31539CZj2.start();
        }
    }

    public final void Jl(String str) {
        int i;
        String valueOf;
        Context context;
        try {
            i = CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 2;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        long j = i;
        if (j >= 1000000) {
            long j2 = 1 * j;
            if (j > 999000000) {
                j2 = 999000000;
            }
            String LIZIZ = Q8U.LIZIZ(new Object[]{Double.valueOf((j2 * 1.0d) / 1000000)}, 1, "%.3f", "format(format, *args)");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(wl(LIZIZ));
            LIZ.append('M');
            valueOf = X1D.LIZIZ(LIZ);
        } else if (j >= 1000) {
            String LIZIZ2 = Q8U.LIZIZ(new Object[]{Double.valueOf((j * 1.0d) / 1000)}, 1, "%.3f", "format(format, *args)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(wl(LIZIZ2));
            LIZ2.append('K');
            valueOf = X1D.LIZIZ(LIZ2);
        } else {
            valueOf = String.valueOf(j);
        }
        objArr[0] = valueOf;
        sb.append(C15380j0.LJIIIIZZ(R.plurals.p0, i, objArr));
        sb.append(" .");
        String sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.atw, getContext());
        Context context2 = getContext();
        if (LIZLLL != null && context2 != null && (context = this.LLIIIL) != null) {
            LIZLLL.setTint(C259910h.LIZIZ(R.attr.gu, context));
            Drawable mutate = LIZLLL.mutate();
            mutate.setBounds(0, 0, C15380j0.LIZ(14.0f), C15380j0.LIZ(14.0f));
            C07840Sm.LIZJ(mutate, CCJ.LIZ(context2) ? 1 : 0);
            spannableStringBuilder.setSpan(new C32206CkU(mutate), sb2.length() - 1, sb2.length(), 34);
        }
        spannableStringBuilder.setSpan(new C28590BJy(new C72242sW(), this, context2), sb2.length() - 1, sb2.length(), 34);
        C47121t6 c47121t6 = this.LJLLJ;
        if (c47121t6 != null) {
            c47121t6.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C47121t6 c47121t62 = this.LJLLJ;
        if (c47121t62 != null) {
            c47121t62.setHighlightColor(0);
        }
        C47121t6 c47121t63 = this.LJLLJ;
        if (c47121t63 == null) {
            return;
        }
        c47121t63.setText(spannableStringBuilder);
    }

    @Override // X.InterfaceC31532CZc
    public final void j(Throwable error) {
        o.LJIIIZ(error, "error");
        this.LLF = false;
        if (!isAdded()) {
            return;
        }
        C2A7 c2a7 = this.LJLJLLL;
        if (c2a7 != null) {
            c2a7.LJL();
        }
        if (error instanceof C29401Dk) {
            C276516r c276516r = (C276516r) error;
            if (c276516r.getErrorCode() == 4038005 || c276516r.getErrorCode() == 4038007) {
                vl(true);
            }
        }
    }

    @Override // X.InterfaceC31532CZc
    public final void n(StarCommentPurchaseResponse.Data data) {
        List<StarCommentItem> list;
        String str;
        String l;
        if (!isAdded()) {
            return;
        }
        this.LLF = false;
        C2A7 c2a7 = this.LJLJLLL;
        if (c2a7 != null) {
            c2a7.LJL();
        }
        int i = data.purchaseResult;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            StarCommentQueue starCommentQueue = data.queue;
            if (starCommentQueue != null) {
                list = starCommentQueue.starCommentList;
            } else {
                list = null;
            }
            C31540CZk c31540CZk = this.LJLJJI;
            String str2 = "";
            if (c31540CZk == null || (str = c31540CZk.LJFF) == null) {
                str = "";
            }
            String valueOf = String.valueOf(data.roomUserCount);
            Jl(valueOf);
            if (list != null) {
                Il(list, false);
            }
            C31540CZk c31540CZk2 = this.LJLJJI;
            if (c31540CZk2 != null && (l = Long.valueOf(c31540CZk2.LIZ).toString()) != null) {
                str2 = l;
            }
            String text = C15380j0.LJIILL(R.string.o5r, str, valueOf, str2);
            o.LJIIIIZZ(text, "text");
            int LJJLIIIJL = s.LJJLIIIJL(text, "[coin_icon]", 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            Drawable drawable = getResources().getDrawable(R.drawable.d27);
            o.LJIIIIZZ(drawable, "resources.getDrawable(R.drawable.ttlive_icon_coin)");
            Drawable mutate = drawable.mutate();
            mutate.setBounds(0, 0, C15380j0.LIZ(14.0f), C15380j0.LIZ(14.0f));
            C07840Sm.LIZJ(mutate, CCJ.LIZ(getContext()) ? 1 : 0);
            spannableStringBuilder.setSpan(new C32206CkU(mutate), LJJLIIIJL, LJJLIIIJL + 11, 34);
            C47121t6 c47121t6 = new C47121t6(getContext(), null);
            c47121t6.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            c47121t6.setText(spannableStringBuilder);
            c47121t6.LJJIJIL(R.style.a43);
            BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_send_acu_changed");
            LIZ.LJIIZILJ();
            CVL.LIZ(LIZ);
            LIZ.LJJIIJZLJL();
            C47071t1 c47071t1 = new C47071t1(getContext());
            c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.o5s);
            c47071t1.LJI(c47121t6);
            c47071t1.LJIILL = false;
            c47071t1.LJIILJJIL = false;
            c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.o4r), new IDcS170S0100000_5(this, 42));
            c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.o5p), C55457Lpd.LJLLILLLL);
            LiveDialog LIZ2 = c47071t1.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-8372210335287505965")).LIZ) {
                return;
            }
            LIZ2.show();
            return;
        }
        this.LLIIIILZ = true;
        this.LJLJJL = null;
        dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void onDialogCreated(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
        super.onDialogCreated(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.LLIIIL = new ContextThemeWrapper(mo49getActivity(), R.style.vp);
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(this.LLIIIL);
        o.LJIIIIZZ(cloneInContext, "super.onGetLayoutInflate…    darkContext\n        )");
        return cloneInContext;
    }

    public final void vl(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (z) {
            View view = this.LJLZ;
            if (view != null) {
                view.setVisibility(0);
            }
            FrameLayout frameLayout = this.LJLLLL;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return;
                }
                marginLayoutParams2.topMargin = C15380j0.LIZ(9.0f);
                return;
            }
            return;
        }
        View view2 = this.LJLZ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.LJLLLL;
        if (frameLayout2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            return;
        }
        marginLayoutParams.topMargin = C15380j0.LIZ(21.0f);
    }

    public final String wl(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String substring = str.substring(0, 4);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (ujb.o.LJJJJ(substring, ".", false)) {
                String substring2 = substring.substring(0, 3);
                o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring2;
            }
            return substring;
        }
        return str;
    }

    public final void Al(long j, long j2) {
        C15960jw c15960jw = new C15960jw("star_comment", j, "normal", "star_comment", "star_comment");
        c15960jw.LJIIIIZZ = -1L;
        c15960jw.LJIIIZ = (int) j2;
        c15960jw.LJFF = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(ShowRechargeDialogEvent.class, c15960jw);
        }
    }

    public final void Il(List<StarCommentItem> list, boolean z) {
        long j;
        EnumC31545CZp enumC31545CZp;
        C31538CZi c31538CZi;
        boolean z2;
        DataChannel dataChannel;
        int intValue;
        ((ArrayList) this.LJLJJLL).clear();
        for (StarCommentItem starCommentItem : list) {
            C31540CZk c31540CZk = new C31540CZk();
            c31540CZk.LJI = starCommentItem;
            long j2 = 0;
            try {
                j = CastLongProtector.parseLong(starCommentItem.coins);
            } catch (NumberFormatException unused) {
                j = 0;
            }
            c31540CZk.LIZ = j;
            StarCommentMessage starCommentMessage = starCommentItem.starComment;
            if (starCommentMessage != null) {
                j2 = starCommentMessage.duration;
            }
            long j3 = 1000;
            c31540CZk.LIZIZ = j2 / j3;
            c31540CZk.LIZJ = (starCommentItem.serverToShowTimestampMs - C30725C4b.LIZ()) / j3;
            c31540CZk.LJFF = starCommentItem.roomUserCount;
            StarCommentItem starCommentItem2 = c31540CZk.LJI;
            if (starCommentItem2 != null) {
                StarCommentMessage starCommentMessage2 = starCommentItem2.starComment;
                if (starCommentMessage2 != null && starCommentMessage2.commentOption == 10) {
                    c31540CZk.LJ = EnumC31545CZp.LOW;
                    C31538CZi c31538CZi2 = this.LJLILLLLZI;
                    if (c31538CZi2 != null) {
                        c31538CZi2.setLowGearDuration(c31540CZk.LIZIZ);
                    }
                } else {
                    StarCommentMessage starCommentMessage3 = starCommentItem2.starComment;
                    if (starCommentMessage3 != null && starCommentMessage3.commentOption == 20) {
                        c31540CZk.LJ = EnumC31545CZp.HIGH;
                        C31538CZi c31538CZi3 = this.LJLILLLLZI;
                        if (c31538CZi3 != null) {
                            c31538CZi3.setHighGearDuration(c31540CZk.LIZIZ);
                        }
                    }
                }
            }
            if (z) {
                EnumC31545CZp enumC31545CZp2 = c31540CZk.LJ;
                if (enumC31545CZp2 != null) {
                    if (CVF.LJFF != null) {
                        intValue = CVF.LIZIZ;
                    } else {
                        Integer LIZJ = InterfaceC30442Bx8.b3.LIZJ();
                        o.LJIIIIZZ(LIZJ, "STAR_COMMENT_LAST_PURCHASE.value");
                        intValue = LIZJ.intValue();
                    }
                    if (intValue == enumC31545CZp2.ordinal()) {
                        z2 = true;
                        c31540CZk.LIZLLL = z2;
                        c31540CZk.LJII = true;
                        if (z2 && (dataChannel = this.dataChannel) != null) {
                            dataChannel.qv0(ChangeSelectItemEvent.class, c31540CZk);
                        }
                    }
                }
                z2 = false;
                c31540CZk.LIZLLL = z2;
                c31540CZk.LJII = true;
                if (z2) {
                    dataChannel.qv0(ChangeSelectItemEvent.class, c31540CZk);
                }
            }
            C31540CZk c31540CZk2 = this.LJLJJI;
            if (c31540CZk2 != null) {
                enumC31545CZp = c31540CZk2.LJ;
            } else {
                enumC31545CZp = null;
            }
            if (enumC31545CZp == c31540CZk.LJ && !z) {
                c31540CZk.LIZLLL = true;
                this.LJLJJI = c31540CZk;
                Hl(c31540CZk.LIZJ);
            }
            EnumC31545CZp enumC31545CZp3 = c31540CZk.LJ;
            if (enumC31545CZp3 == EnumC31545CZp.LOW && c31540CZk.LIZLLL) {
                C31538CZi c31538CZi4 = this.LJLILLLLZI;
                if (c31538CZi4 != null) {
                    LinearLayout linearLayout = c31538CZi4.LJLIL;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    LinearLayout linearLayout2 = c31538CZi4.LJLILLLLZI;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                }
            } else if (enumC31545CZp3 == EnumC31545CZp.HIGH && c31540CZk.LIZLLL && (c31538CZi = this.LJLILLLLZI) != null) {
                LinearLayout linearLayout3 = c31538CZi.LJLIL;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = c31538CZi.LJLILLLLZI;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
            }
            ((ArrayList) this.LJLJJLL).add(c31540CZk);
        }
        C31541CZl c31541CZl = this.LJLJLJ;
        if (c31541CZl != null) {
            List<C31540CZk> commentItems = this.LJLJJLL;
            o.LJIIIZ(commentItems, "commentItems");
            c31541CZl.LJLIL = commentItems;
            c31541CZl.notifyDataSetChanged();
        }
    }

    public final boolean Ll(long j, long j2) {
        int i = (int) j2;
        return ((WalletExchange) ((IWalletService) CN1.LIZ(IWalletService.class)).walletExchange()).LJIL(getContext(), new C77453UaX(i, -1L, this.dataChannel, "star_comment"), new C31547CZr(this, j, j2));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SpannableStringBuilder spannableStringBuilder;
        List<String> list;
        User user;
        View view2;
        View view3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLFF = System.currentTimeMillis();
        this.LJLL = (LinearLayout) view.findViewById(R.id.cyk);
        View findViewById = view.findViewById(R.id.iv1);
        this.LJLLI = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 430), findViewById);
        }
        this.LJLILLLLZI = (C31538CZi) view.findViewById(R.id.ff3);
        this.LJLJI = (V2J) view.findViewById(R.id.ant);
        this.LJLJL = (RecyclerView) view.findViewById(R.id.jlq);
        this.LJLJLLL = (C2A7) view.findViewById(R.id.jo2);
        this.LJLLILLLL = (CVT) view.findViewById(R.id.g94);
        this.LJLZ = view.findViewById(R.id.ngy);
        this.LJLLLL = (FrameLayout) view.findViewById(R.id.kc5);
        this.LLD = view.findViewById(R.id.c_1);
        this.LL = (C47121t6) view.findViewById(R.id.hvt);
        this.LJLLL = (LiveEditText) view.findViewById(R.id.cps);
        this.LLFFF = (C47121t6) view.findViewById(R.id.h94);
        this.LJLLJ = (C47121t6) view.findViewById(R.id.kc4);
        if (!this.LJLIL && CCJ.LIZ(getContext()) && (view3 = this.LLD) != null) {
            view3.setBackgroundResource(R.drawable.cm3);
        }
        String LJIILL = C15380j0.LJIILL(R.string.o4s, C15380j0.LJIILJJIL(R.string.o4t));
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o4t);
        C72242sW c72242sW = new C72242sW();
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = null;
        if (context != null) {
            StringBuilder LJFF = C72972SkS.LJFF(LJIILL, ' ');
            LJFF.append(C15380j0.LJIILJJIL(R.string.o4u));
            spannableStringBuilder = C15670jT.LIZIZ(context, X1D.LIZIZ(LJFF), LJIILJJIL, C259910h.LIZIZ(R.attr.gv, this.LLIIIL), false, null, new AqS152S0200000_5(c72242sW, this, 37));
        } else {
            spannableStringBuilder = null;
        }
        C23010vJ.LIZJ(getContext(), spannableStringBuilder, (LJIILL.length() - LJIILJJIL.length()) - 1, LJIILL.length() - 1, 33, 4, 600);
        C47121t6 c47121t6 = this.LL;
        if (c47121t6 != null) {
            c47121t6.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C47121t6 c47121t62 = this.LL;
        if (c47121t62 != null) {
            c47121t62.setHighlightColor(0);
        }
        C47121t6 c47121t63 = this.LL;
        if (c47121t63 != null) {
            c47121t63.setText(spannableStringBuilder);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C31540CZk());
        arrayList.add(new C31540CZk());
        this.LJLJLJ = new C31541CZl(this.dataChannel, arrayList);
        RecyclerView recyclerView = this.LJLJL;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(this.LJLIL ? 1 : 0, false));
        }
        RecyclerView recyclerView2 = this.LJLJL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJLJLJ);
        }
        LiveEditText liveEditText = this.LJLLL;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(new IDObjectS178S0100000_5(this, 12));
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.e60);
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new BCG(new ACListenerS25S0100000_5(this, 431)));
        }
        LiveIconView liveIconView2 = (LiveIconView) view.findViewById(R.id.ijg);
        if (liveIconView2 != null) {
            C16880lQ.LJJII(liveIconView2, new BCG(new ACListenerS25S0100000_5(this, 432)));
        }
        Kl();
        C2A7 c2a7 = this.LJLJLLL;
        if (c2a7 != null) {
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 434));
        }
        View findViewById2 = view.findViewById(R.id.abh);
        InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
        o.LJIIIIZZ(interfaceC05190Ih, "getInstance().user().currentUser");
        BQO LIZ = C15650jR.LIZ();
        ImageModel avatarThumb = interfaceC05190Ih.getAvatarThumb();
        if (avatarThumb != null) {
            list = avatarThumb.getUrls();
        } else {
            list = null;
        }
        C78720Uuy LIZ2 = LIZ.LIZ(list);
        LIZ2.LJIIL = Boolean.TRUE;
        LIZ2.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        int width = findViewById2.getWidth();
        int height = findViewById2.getHeight();
        LIZ2.LJ = width;
        LIZ2.LJFF = height;
        LIZ2.LJIIIIZZ = R.drawable.d65;
        LIZ2.LJIIJJI(findViewById2);
        TextView textView = (TextView) view.findViewById(R.id.mzt);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            user = ((C29374Bfu) LIZIZ).LJ();
        } else {
            user = null;
        }
        textView.setText(C05170If.LIZ(user));
        View findViewById3 = view.findViewById(R.id.cbw);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 433), findViewById3);
        }
        AppCompatTextView titleView = (AppCompatTextView) view.findViewById(R.id.kcr);
        o.LJIIIIZZ(titleView, "titleView");
        titleView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, titleView.getText().length() * titleView.getPaint().getTextSize(), 0.0f, ColorProtector.parseColor("#F2EAFD"), ColorProtector.parseColor("#D4FAFF"), Shader.TileMode.CLAMP));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, ChangeSelectItemEvent.class, new AqS171S0100000_5(this, 836));
            dataChannel.lv0(this, LiveEndEvent.class, new AqS171S0100000_5(this, 837));
        }
        Gl(true);
        if (!this.LJLIL && (view2 = this.LLD) != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                layoutParams = layoutParams2;
            }
            view2.setLayoutParams(layoutParams);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, OrientationChangedChannel.class, new AqS171S0100000_5(this, 398));
        }
    }
}
