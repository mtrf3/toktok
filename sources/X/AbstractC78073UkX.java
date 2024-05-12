package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS33S0100000_13;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPriceColorSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UkX */
/* loaded from: classes14.dex */
public abstract class AbstractC78073UkX extends FrameLayout {
    public static final /* synthetic */ int LJZI = 0;
    public C2A4 LJLIL;
    public TextView LJLILLLLZI;
    public ImageView LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public ImageView LJLJJLL;
    public C47121t6 LJLJL;
    public View LJLJLJ;
    public TextView LJLJLLL;
    public AnimatorSet LJLL;
    public C78072UkW LJLLI;
    public DataChannel LJLLILLLL;
    public ViewGroup LJLLJ;
    public EnumC78095Ukt LJLLL;
    public C47121t6 LJLLLL;
    public final C5H3 LJLLLLLL;
    public EnumC78089Ukn LJLZ;
    public int LJZ;

    public abstract EnumC78089Ukn LIZLLL(boolean z);

    public final boolean LIZ() {
        boolean z;
        boolean z2;
        Boolean bool;
        if (!LiveGiftTrayMatchPointsSetting.INSTANCE.getValue().matchPointLabelEnabled) {
            return false;
        }
        DataChannel dataChannel = this.LJLLILLLL;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk") && C31120CJg.LJIIIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean LJFF() {
        boolean z;
        Float valueOf;
        GiftMonitorInfo giftMonitorInfo;
        C78072UkW c78072UkW = this.LJLLI;
        if (c78072UkW != null) {
            z = o.LJ(c78072UkW.LJIJI, Boolean.TRUE);
        } else {
            z = false;
        }
        C78072UkW c78072UkW2 = this.LJLLI;
        Long l = null;
        if (c78072UkW2 != null && (giftMonitorInfo = c78072UkW2.LJJJJLL) != null) {
            l = Long.valueOf(giftMonitorInfo.to_user_id);
        }
        C78072UkW c78072UkW3 = this.LJLLI;
        if (c78072UkW3 != null && c78072UkW3.LJJJJJL) {
            User user = c78072UkW3.LJJJJZ;
            if (user != null) {
                l = Long.valueOf(user.getId());
            }
            return false;
        }
        if (l != null) {
            Rect po0 = InteractServiceDel.LJLILLLLZI.po0(l.longValue());
            if (po0 != null) {
                float centerX = po0.centerX();
                C2A4 c2a4 = this.LJLIL;
                if (c2a4 != null) {
                    int width = c2a4.getWidth() / 2;
                    C2A4 c2a42 = this.LJLIL;
                    if (c2a42 != null && (valueOf = Float.valueOf(c2a42.getX() + width)) != null && z && valueOf.floatValue() > centerX) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final C17190lv getFrescoLoader() {
        return (C17190lv) this.LJLLLLLL.getValue();
    }

    public void LJI() {
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 452), findViewById(R.id.abt));
        C2A4 c2a4 = this.LJLIL;
        if (c2a4 != null) {
            c2a4.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS33S0100000_13(this, 196)));
        }
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS33S0100000_13(this, 197));
        }
        C47121t6 c47121t62 = this.LJLJJL;
        if (c47121t62 != null) {
            C16880lQ.LJJIIZ(c47121t62, new ACListenerS33S0100000_13(this, 198));
        }
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS33S0100000_13(this, 199));
        }
    }

    public void LJIIJJI() {
        C47121t6 c47121t6;
        this.LJLJLJ = findViewById(R.id.lkd);
        TextView textView = (TextView) findViewById(R.id.bix);
        this.LJLILLLLZI = textView;
        if (textView != null) {
            textView.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
        }
        C47121t6 c47121t62 = (C47121t6) findViewById(R.id.lkf);
        this.LJLJL = c47121t62;
        if (c47121t62 != null) {
            c47121t62.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
        }
        C78105Ul3 c78105Ul3 = EnumC78089Ukn.Companion;
        EnumC78089Ukn enumC78089Ukn = this.LJLZ;
        c78105Ul3.getClass();
        o.LJIIIZ(enumC78089Ukn, "<this>");
        int i = 0;
        if (enumC78089Ukn == EnumC78089Ukn.MULTI_HOST_MEDIUM || enumC78089Ukn == EnumC78089Ukn.MULTI_HOST_SMALL) {
            C47121t6 c47121t63 = this.LJLJL;
            if (c47121t63 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C15380j0.LJIILJJIL(R.string.oqf));
                LIZ.append((char) 160);
                c47121t63.setText(X1D.LIZIZ(LIZ));
            }
        } else {
            TextView textView2 = this.LJLILLLLZI;
            if (textView2 != null) {
                if (C15380j0.LJIIZILJ()) {
                    i = C15380j0.LIZ(-5.0f);
                }
                C29306Beo.LJJLIIIJ(i, textView2);
            }
            if (C15380j0.LJIIZILJ() && (c47121t6 = this.LJLJL) != null) {
                C29306Beo.LJJLIIIJ(C15380j0.LIZ(12.0f), c47121t6);
            }
        }
        this.LJLJI = (ImageView) findViewById(R.id.mya);
        this.LJLIL = (C2A4) findViewById(R.id.dta);
        C47121t6 c47121t64 = (C47121t6) findViewById(R.id.jol);
        this.LJLJJI = c47121t64;
        if (c47121t64 != null) {
            c47121t64.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        }
        this.LJLJJL = (C47121t6) findViewById(R.id.jo8);
        this.LJLJLLL = (TextView) findViewById(R.id.gf_);
        this.LJLJJLL = (ImageView) findViewById(R.id.my6);
        C47121t6 c47121t65 = (C47121t6) findViewById(R.id.dav);
        this.LJLLLL = c47121t65;
        if (c47121t65 != null) {
            c47121t65.setText(getFirstGiftText());
        }
        C47121t6 c47121t66 = this.LJLLLL;
        if (c47121t66 != null) {
            c47121t66.setTypeface(C8HI.LIZJ().LIZLLL("bold"), 2);
        }
    }

    public final String getFirstGiftText() {
        StringBuilder LIZ;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.l8n);
        if (C15380j0.LJIIZILJ()) {
            LIZ = X1D.LIZ();
            LIZ.append(' ');
        } else {
            LIZ = X1D.LIZ();
        }
        return q.LIZIZ(LIZ, LJIILJJIL, ' ', LIZ);
    }

    public final String getForYouText() {
        StringBuilder LIZ;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lor);
        if (C15380j0.LJIIZILJ()) {
            LIZ = X1D.LIZ();
            LIZ.append(' ');
        } else {
            LIZ = X1D.LIZ();
        }
        return q.LIZIZ(LIZ, LJIILJJIL, ' ', LIZ);
    }

    public final AnimatorSet getCurrAnimator() {
        return this.LJLL;
    }

    public final EnumC78089Ukn getCurrentStyle() {
        return this.LJLZ;
    }

    public final DataChannel getDataChannel() {
        return this.LJLLILLLL;
    }

    public final C47121t6 getFirstGiftOrForYouTextView() {
        return this.LJLLLL;
    }

    public final ImageView getMAvatarViewNew() {
        return this.LJLJI;
    }

    public final TextView getMCombCountTv() {
        return this.LJLILLLLZI;
    }

    public final View getMCombLayoutView() {
        return this.LJLJLJ;
    }

    public final C47121t6 getMCombMultiple() {
        return this.LJLJL;
    }

    public final ViewGroup getMContainerView() {
        return this.LJLLJ;
    }

    public final C2A4 getMGiftIconIv() {
        return this.LJLIL;
    }

    public final C78072UkW getMGiftMsg() {
        return this.LJLLI;
    }

    public final int getMIndex() {
        return this.LJZ;
    }

    public final EnumC78095Ukt getMTrayType() {
        return this.LJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC78073UkX(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLLL = EnumC78095Ukt.LOCAL;
        this.LJLLLLLL = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(context, 599));
        this.LJLZ = EnumC78089Ukn.ONE_HOST_MEDIUM_V3;
        this.LJZ = 1;
    }

    public static ImageModel LIZJ(C78072UkW msg) {
        boolean z;
        Gift gift;
        List<GiftColorInfo> list;
        ImageModel imageModel;
        GiftTrayInfo giftTrayInfo;
        GiftTrayInfo giftTrayInfo2;
        ImageModel imageModel2;
        List<String> list2;
        o.LJIIIZ(msg, "msg");
        if (msg.LJII == EnumC78063UkN.TRAY_ONLY) {
            return msg.LJJJJ;
        }
        GiftMessage giftMessage = msg.LIZ;
        if (giftMessage != null && (giftTrayInfo2 = giftMessage.mTrayInfo) != null && (imageModel2 = giftTrayInfo2.mDynamicImg) != null && (list2 = imageModel2.mUrls) != null && list2.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        GiftColorInfo giftColorInfo = null;
        if (z) {
            GiftMessage giftMessage2 = msg.LIZ;
            if (giftMessage2 == null || (giftTrayInfo = giftMessage2.mTrayInfo) == null) {
                return null;
            }
            return giftTrayInfo.mDynamicImg;
        }
        GiftMessage giftMessage3 = msg.LIZ;
        if (giftMessage3 != null && (gift = giftMessage3.mGift) != null && (list = gift.colorInfos) != null) {
            Iterator<GiftColorInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GiftColorInfo next = it.next();
                GiftColorInfo giftColorInfo2 = next;
                if (o.LJ(giftColorInfo2.colorId, msg.LIZ.colorId) && giftColorInfo2.giftImage != null) {
                    giftColorInfo = next;
                    break;
                }
            }
            GiftColorInfo giftColorInfo3 = giftColorInfo;
            if (giftColorInfo3 != null && (imageModel = giftColorInfo3.giftImage) != null) {
                return imageModel;
            }
        }
        return msg.LJJJJ;
    }

    public static /* synthetic */ void LJIIIIZZ(AbstractC78073UkX abstractC78073UkX) {
        int i;
        ViewGroup viewGroup = abstractC78073UkX.LJLLJ;
        if (viewGroup != null) {
            i = viewGroup.getWidth();
        } else {
            i = 0;
        }
        abstractC78073UkX.LJII(-i);
    }

    public void LJII(int i) {
        float f;
        int i2;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(this.LJLZ.getDefaultHeightDimen());
        if (this.LJZ > 0) {
            f = this.LJLZ.getGapDp();
        } else {
            f = 0.0f;
        }
        int LIZ = C15380j0.LIZ(f);
        C78105Ul3 c78105Ul3 = EnumC78089Ukn.Companion;
        EnumC78089Ukn enumC78089Ukn = this.LJLZ;
        c78105Ul3.getClass();
        o.LJIIIZ(enumC78089Ukn, "<this>");
        int i3 = 0;
        if (enumC78089Ukn == EnumC78089Ukn.MULTI_HOST_MEDIUM) {
            i2 = C15380j0.LIZ(4.0f);
        } else {
            i2 = 0;
        }
        ViewGroup viewGroup = this.LJLLJ;
        if (viewGroup != null) {
            i3 = viewGroup.getHeight();
        }
        int i4 = ((i3 - ((this.LJZ + 1) * dimensionPixelSize)) - LIZ) - i2;
        setX(i);
        setY(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r7) {
        /*
            r6 = this;
            X.UkW r0 = r6.LJLLI
            r5 = 0
            if (r0 == 0) goto L96
            long r0 = r0.LJJJJIZL
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        Lb:
            X.ChE r4 = new X.ChE
            r4.<init>(r5)
            java.lang.String r0 = "gift_panel"
            r4.LIZIZ = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.LJIIL = r0
            if (r2 == 0) goto L93
            long r0 = r2.longValue()
        L20:
            r4.LJIIIIZZ = r0
            X.UkW r0 = r6.LJLLI
            if (r0 == 0) goto L2e
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = r0.LIZ
            if (r0 == 0) goto L2e
            java.lang.Long r0 = r0.colorId
            if (r0 != 0) goto L8e
        L2e:
            r0 = -1
        L30:
            r4.LJIIJ = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LJLLILLLL
            if (r1 == 0) goto L8c
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r3 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r3
        L3e:
            com.bytedance.android.live.liveinteract.api.IInteractService r2 = X.C31120CJg.LIZ
            boolean r0 = r2.cx()
            if (r0 != 0) goto L5b
            if (r3 == 0) goto L4c
            com.bytedance.android.live.base.model.user.User r5 = r3.getOwner()
        L4c:
            r4.LIZ = r5
        L4e:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LJLLILLLL
            if (r1 == 0) goto L57
            java.lang.Class<com.bytedance.android.live.gift.SendGiftEvent> r0 = com.bytedance.android.live.gift.SendGiftEvent.class
            r1.qv0(r0, r4)
        L57:
            X.C32463Cod.LJ(r7)
            return
        L5b:
            X.B83 r0 = X.B83.LIZ()
            r0.LIZIZ()
            X.UkW r1 = r6.LJLLI
            if (r1 == 0) goto L8a
            com.bytedance.android.live.base.model.user.User r0 = r1.LJJJJZ
            if (r0 != 0) goto L88
            com.bytedance.android.livesdk.model.message.GiftMonitorInfo r0 = r1.LJJJJLL
            if (r0 == 0) goto L8a
            long r0 = r0.to_user_id
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L74:
            com.bytedance.android.live.base.model.user.User r0 = r2.Vp(r0)
            if (r0 != 0) goto L86
            if (r3 == 0) goto L80
            com.bytedance.android.live.base.model.user.User r5 = r3.getOwner()
        L80:
            r4.LIZ = r5
            r0 = 1
            r4.LJI = r0
            goto L4e
        L86:
            r5 = r0
            goto L80
        L88:
            r5 = r0
            goto L80
        L8a:
            r0 = r5
            goto L74
        L8c:
            r3 = r5
            goto L3e
        L8e:
            long r0 = r0.longValue()
            goto L30
        L93:
            r0 = 0
            goto L20
        L96:
            r2 = r5
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC78073UkX.LJIIIZ(java.lang.String):void");
    }

    public final void LJIIJ(String str) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        int i2;
        int i3;
        boolean z;
        Drawable LIZ;
        int i4;
        int i5;
        TextView textView;
        boolean z2;
        Integer LIZLLL;
        int i6;
        Integer LIZLLL2;
        int i7;
        int i8 = 0;
        if (LIZ()) {
            C78072UkW c78072UkW = this.LJLLI;
            if (c78072UkW != null) {
                i4 = c78072UkW.LJIIIZ;
                i5 = c78072UkW.LJJJJLI;
            } else {
                i4 = 0;
                i5 = 0;
            }
            int i9 = i4 * i5;
            if (this.LJLZ == EnumC78089Ukn.ONE_HOST_MEDIUM_V3 && (textView = this.LJLJLLL) != null) {
                if (c78072UkW != null) {
                    z2 = c78072UkW.LJIJ;
                } else {
                    z2 = false;
                }
                if (i9 >= 10000) {
                    LIZLLL = C78080Uke.LIZLLL("#4D510EBF");
                } else if (i9 >= 500) {
                    LIZLLL = C78080Uke.LIZLLL("#4D1634C6");
                } else if (z2) {
                    LIZLLL = C78080Uke.LIZLLL("#4D0693A8");
                } else {
                    LIZLLL = C78080Uke.LIZLLL("#4D262626");
                }
                if (LIZLLL != null) {
                    i6 = LIZLLL.intValue();
                } else {
                    i6 = 0;
                }
                if (i9 >= 10000) {
                    LIZLLL2 = C78080Uke.LIZLLL("#00510EBF");
                } else if (i9 >= 500) {
                    LIZLLL2 = C78080Uke.LIZLLL("#001634C6");
                } else if (z2) {
                    LIZLLL2 = C78080Uke.LIZLLL("#000693A8");
                } else {
                    LIZLLL2 = C78080Uke.LIZLLL("#00262626");
                }
                if (LIZLLL2 != null) {
                    i7 = LIZLLL2.intValue();
                } else {
                    i7 = 0;
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
                gradientDrawable.mutate();
                if (Build.VERSION.SDK_INT >= 29) {
                    gradientDrawable.setColors(new int[]{i7, i6, i6, i7}, new float[]{0.0f, 0.3f, 0.7f, 1.0f});
                } else {
                    gradientDrawable.setColors(new int[]{i7, i6, i6, i7});
                }
                textView.setBackground(gradientDrawable);
            }
        }
        View findViewById = findViewById(R.id.ahc);
        if (findViewById != null) {
            C78072UkW c78072UkW2 = this.LJLLI;
            if (c78072UkW2 != null) {
                i2 = c78072UkW2.LJIIIZ;
                i3 = c78072UkW2.LJJJJLI;
            } else {
                i2 = 0;
                i3 = 0;
            }
            int i10 = i2 * i3;
            if (c78072UkW2 != null) {
                z = c78072UkW2.LJIJ;
            } else {
                z = false;
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (z) {
                if (i10 <= 499) {
                    LIZ = context.getDrawable(R.drawable.cds);
                    if (LIZ == null) {
                        LIZ = C78080Uke.LIZ(C47261Igj.LJJIJIIJI("#99000000", "#33000000"));
                    }
                } else if (i10 <= 9999) {
                    LIZ = context.getDrawable(R.drawable.cdt);
                    if (LIZ == null) {
                        LIZ = C78080Uke.LIZ(C47261Igj.LJJIJIIJI("#99000000", "#33000000"));
                    }
                } else {
                    LIZ = context.getDrawable(R.drawable.cdr);
                    if (LIZ == null) {
                        LIZ = C78080Uke.LIZ(C47261Igj.LJJIJIIJI("#99000000", "#33000000"));
                    }
                }
            } else {
                java.util.Map<String, List<String>> value = LiveGiftTrayPriceColorSetting.INSTANCE.getValue();
                String str2 = "1";
                for (String str3 : value.keySet()) {
                    if (CastIntegerProtector.parseInt(str3) <= i10 && CastIntegerProtector.parseInt(str3) > CastIntegerProtector.parseInt(str2)) {
                        str2 = str3;
                    }
                }
                List<String> list = value.get(str2);
                if (list == null) {
                    list = C47261Igj.LJJIJIIJI("#99000000", "#33000000");
                }
                LIZ = C78080Uke.LIZ(list);
            }
            findViewById.setBackground(LIZ);
            if (C15380j0.LJIIZILJ()) {
                findViewById.setScaleX(-1.0f);
            }
        }
        String LIZIZ = C42398GkU.LIZIZ(str, ' ');
        if (C15380j0.LJIIZILJ()) {
            LIZIZ = QZZ.LIZIZ(' ', str);
        }
        EnumC78089Ukn enumC78089Ukn = this.LJLZ;
        if (enumC78089Ukn == EnumC78089Ukn.MULTI_HOST_SMALL) {
            int LIZ2 = C15380j0.LIZ(8.0f);
            TextView textView2 = this.LJLILLLLZI;
            if (textView2 != null && (layoutParams2 = textView2.getLayoutParams()) != null) {
                layoutParams2.width = LIZIZ.length() * LIZ2;
            }
            TextView textView3 = this.LJLILLLLZI;
            if (textView3 != null) {
                textView3.requestLayout();
            }
        } else if (enumC78089Ukn == EnumC78089Ukn.ONE_HOST_MEDIUM_V3 && C15380j0.LJIIZILJ()) {
            int LIZ3 = C15380j0.LIZ(18.0f);
            TextView textView4 = this.LJLILLLLZI;
            if (textView4 != null && (layoutParams = textView4.getLayoutParams()) != null) {
                layoutParams.width = LIZIZ.length() * LIZ3;
            }
            TextView textView5 = this.LJLILLLLZI;
            if (textView5 != null) {
                textView5.requestLayout();
            }
        }
        TextView textView6 = this.LJLILLLLZI;
        if (textView6 != null) {
            textView6.setText(LIZIZ);
        }
        if (UC0.LJJIIZI(this.LJLLI) || UC0.LJJL(this.LJLLI)) {
            C78072UkW c78072UkW3 = this.LJLLI;
            if (c78072UkW3 != null) {
                i = c78072UkW3.LJIIIZ;
                i8 = c78072UkW3.LJJJJLI;
            } else {
                i = 0;
            }
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            setFirstGiftOrForYouTextBackground(C78080Uke.LIZIZ(i * i8, context2));
        }
    }

    public final void setCurrAnimator(AnimatorSet animatorSet) {
        this.LJLL = animatorSet;
    }

    public final void setCurrentStyle(EnumC78089Ukn enumC78089Ukn) {
        o.LJIIIZ(enumC78089Ukn, "<set-?>");
        this.LJLZ = enumC78089Ukn;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLLILLLL = dataChannel;
    }

    public final void setFirstGiftOrForYouTextBackground(Drawable drawable) {
        LayerDrawable layerDrawable;
        C47121t6 c47121t6 = this.LJLLLL;
        Drawable drawable2 = null;
        if (c47121t6 != null) {
            drawable2 = c47121t6.getBackground();
        }
        if ((drawable2 instanceof TransitionDrawable) && (layerDrawable = (LayerDrawable) drawable2) != null) {
            layerDrawable.setDrawableByLayerId(R.id.n_c, drawable);
            layerDrawable.invalidateSelf();
        }
    }

    public final void setFirstGiftOrForYouTextView(C47121t6 c47121t6) {
        this.LJLLLL = c47121t6;
    }

    public final void setGiftMessage(C78072UkW msg) {
        GiftTrayInfo giftTrayInfo;
        ImageModel imageModel;
        List<String> list;
        C78072UkW c78072UkW;
        ImageModel imageModel2;
        ImageModel avatarThumb;
        int i;
        String LIZIZ;
        Typeface LIZLLL;
        o.LJIIIZ(msg, "msg");
        if (this.LJLLL == EnumC78095Ukt.LOCAL) {
            C78076Uka c78076Uka = C78110Ul8.LIZ;
            C78102Ul0 c78102Ul0 = new C78102Ul0();
            int i2 = this.LJZ;
            c78076Uka.getClass();
            c78076Uka.LIZ.LJI(i2, c78102Ul0);
        }
        this.LJLLI = msg;
        msg.LJJIJ = System.currentTimeMillis();
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setText(msg.LJJJIL);
        }
        C47121t6 c47121t62 = this.LJLJJL;
        if (c47121t62 != null) {
            c47121t62.setText(msg.LJJJJI);
        }
        TextView textView = this.LJLJLLL;
        if (textView != null) {
            if (LIZ()) {
                C78072UkW c78072UkW2 = this.LJLLI;
                if (c78072UkW2 != null) {
                    i = c78072UkW2.LJJJJLI;
                } else {
                    i = 0;
                }
                if (i < 1000) {
                    LIZIZ = String.valueOf(i);
                } else if (i < 10000) {
                    StringBuilder LIZ = X1D.LIZ();
                    String substring = String.valueOf(i).substring(0, 1);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    LIZ.append(substring);
                    LIZ.append(',');
                    String substring2 = String.valueOf(i).substring(1);
                    o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
                    LIZ.append(substring2);
                    LIZIZ = X1D.LIZIZ(LIZ);
                } else if (i < 1000000) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(BML.LIZ("%.1f", Double.valueOf((((i / 100) * 100) * 1.0d) / 1000)));
                    LIZ2.append('K');
                    LIZIZ = X1D.LIZIZ(LIZ2);
                } else {
                    if (i < 1000000000) {
                        int i3 = (i / ImagePreloadExperiment.PRIORITY_DEFAULT) * ImagePreloadExperiment.PRIORITY_DEFAULT;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(BML.LIZ("%.1f", Double.valueOf((i3 * 1.0d) / 1000000)));
                        LIZ3.append('M');
                        LIZIZ = X1D.LIZIZ(LIZ3);
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(BML.LIZ("%.1f", Double.valueOf((((r4 / 100000000) * 100000000) * 1.0d) / 1000000000)));
                        LIZ4.append('B');
                        LIZIZ = X1D.LIZIZ(LIZ4);
                    }
                }
                String LJIIIIZZ = C15380j0.LJIIIIZZ(R.plurals.n0, i, LIZIZ);
                o.LJIIIIZZ(LJIIIIZZ, "getQuantityString(R.plur… points, formattedPoints)");
                int i4 = C78101Ukz.LIZ[this.LJLZ.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        C29306Beo.LJI(textView);
                    } else {
                        C29306Beo.LJJLJLI(textView);
                        C67981Qm9.LIZIZ(new Object[]{LJIIIIZZ}, 1, "(%s)", "format(format, *args)", textView);
                    }
                } else {
                    C29306Beo.LJJLJLI(textView);
                    textView.setText(LJIIIIZZ);
                }
                if (this.LJLZ == EnumC78089Ukn.ONE_HOST_MEDIUM_V3) {
                    LIZLLL = C8HI.LIZJ().LIZLLL("bold");
                } else {
                    LIZLLL = C8HI.LIZJ().LIZLLL("regular");
                }
                textView.setTypeface(LIZLLL);
            } else {
                C29306Beo.LJI(textView);
            }
        }
        C2A4 c2a4 = this.LJLIL;
        Integer num = null;
        if ((c2a4 instanceof ImageView) && c2a4 != null) {
            c2a4.setImageDrawable(getContext().getDrawable(R.drawable.d1p));
        }
        ImageModel LIZJ = LIZJ(msg);
        if (LIZJ != null) {
            if (this.LJLLI != null) {
                System.currentTimeMillis();
            }
            GiftMessage giftMessage = msg.LIZ;
            if (giftMessage != null && (giftTrayInfo = giftMessage.mTrayInfo) != null && (imageModel = giftTrayInfo.mDynamicImg) != null && (list = imageModel.mUrls) != null && list.size() > 0) {
                C78083Ukh c78083Ukh = new C78083Ukh(this, msg);
                C78072UkW c78072UkW3 = this.LJLLI;
                if (c78072UkW3 != null && c78072UkW3.LJI == 3) {
                    C2A4 c2a42 = this.LJLIL;
                    if (c2a42 != null) {
                        Object obj = ListProtector.get(LIZJ.getUrls(), 0);
                        o.LJIIIIZZ(obj, "giftIconUrl.urls[0]");
                        c2a42.LLIIJI = (String) obj;
                        c2a42.LJII();
                    }
                } else {
                    C17190lv frescoLoader = getFrescoLoader();
                    frescoLoader.LJFF = LIZJ;
                    frescoLoader.LIZ(ImageView.ScaleType.CENTER_CROP);
                    frescoLoader.LJ(R.drawable.d1o);
                    frescoLoader.LJIIJJI = true;
                    frescoLoader.LIZLLL = new C1UQ(LIZJ, c78083Ukh);
                    frescoLoader.LIZJ(this.LJLIL);
                }
            } else {
                LIZIZ(this.LJLIL, LIZJ);
            }
        }
        User user = msg.LJJJJJ;
        if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
            if (this.LJLLI != null) {
                System.currentTimeMillis();
            }
            LIZIZ(this.LJLJI, avatarThumb);
        }
        BorderInfo LIZ5 = C29504Bi0.LIZ(msg.LJJJJJ);
        if (LIZ5 != null && (imageModel2 = LIZ5.icon) != null) {
            LIZIZ(this.LJLJJLL, imageModel2);
        }
        TextView textView2 = this.LJLILLLLZI;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        C78072UkW c78072UkW4 = this.LJLLI;
        if (c78072UkW4 != null) {
            num = Integer.valueOf(c78072UkW4.LIZJ());
        }
        LJIIJ(String.valueOf(num));
        if (this.LJLZ == EnumC78089Ukn.ONE_HOST_MEDIUM_V3 && (c78072UkW = this.LJLLI) != null && c78072UkW.LJI == 3) {
            View findViewById = findViewById(R.id.j83);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.root_view)");
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII((ConstraintLayout) findViewById);
            anonymousClass064.LJIIIIZZ(R.id.dta, 4, R.id.ahc, 4);
            C2A4 c2a43 = this.LJLIL;
            if (c2a43 != null) {
                C29306Beo.LJJJJJL(C15380j0.LIZ(1.0f), c2a43);
            }
            C2A4 c2a44 = this.LJLIL;
            if (c2a44 != null) {
                C29306Beo.LJJLIIIJJIZ(C15380j0.LIZ(44.0f), C15380j0.LIZ(44.0f), c2a44);
            }
        }
        if (LJFF()) {
            C0NB.LIZIZ("GiftTrayView", "setIconScale -1F");
            C2A4 c2a45 = this.LJLIL;
            if (c2a45 == null) {
                return;
            }
            c2a45.setScaleX(-1.0f);
            return;
        }
        C2A4 c2a46 = this.LJLIL;
        if (c2a46 != null) {
            c2a46.setScaleX(1.0f);
        }
        C0NB.LIZIZ("GiftTrayView", "setIconScale 1F");
    }

    public final void setMAvatarViewNew(ImageView imageView) {
        this.LJLJI = imageView;
    }

    public final void setMCombCountTv(TextView textView) {
        this.LJLILLLLZI = textView;
    }

    public final void setMCombLayoutView(View view) {
        this.LJLJLJ = view;
    }

    public final void setMCombMultiple(C47121t6 c47121t6) {
        this.LJLJL = c47121t6;
    }

    public final void setMContainerView(ViewGroup viewGroup) {
        this.LJLLJ = viewGroup;
    }

    public final void setMGiftIconIv(C2A4 c2a4) {
        this.LJLIL = c2a4;
    }

    public final void setMGiftMsg(C78072UkW c78072UkW) {
        this.LJLLI = c78072UkW;
    }

    public final void setMIndex(int i) {
        this.LJZ = i;
    }

    public final void setMTrayType(EnumC78095Ukt enumC78095Ukt) {
        o.LJIIIZ(enumC78095Ukt, "<set-?>");
        this.LJLLL = enumC78095Ukt;
    }

    public final void setTrackNum(int i) {
        this.LJZ = i;
    }

    public final void setViewGroup(ViewGroup viewGroup) {
        this.LJLLJ = viewGroup;
    }

    public final void LIZIZ(ImageView imageView, ImageModel imageModel) {
        ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(imageModel, new C78082Ukg(imageView, this));
    }

    public final void LJ(DataChannel dataChannel, boolean z) {
        this.LJLLILLLL = dataChannel;
        this.LJLZ = LIZLLL(z);
        setClipChildren(false);
        removeAllViews();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), this.LJLZ.getLayoutId(), this, true);
        LJIIJJI();
        LJIIIIZZ(this);
        LJI();
        View view = this.LJLJLJ;
        if (view != null) {
            view.setVisibility(8);
        }
        C78105Ul3 c78105Ul3 = EnumC78089Ukn.Companion;
        EnumC78089Ukn enumC78089Ukn = this.LJLZ;
        c78105Ul3.getClass();
        o.LJIIIZ(enumC78089Ukn, "<this>");
        if (enumC78089Ukn == EnumC78089Ukn.MULTI_HOST_MEDIUM || enumC78089Ukn == EnumC78089Ukn.MULTI_HOST_SMALL) {
            LiveMultiHostGiftTrayOptSetting liveMultiHostGiftTrayOptSetting = LiveMultiHostGiftTrayOptSetting.INSTANCE;
            if (liveMultiHostGiftTrayOptSetting.isMediumGiftTray() && liveMultiHostGiftTrayOptSetting.isBackgroundCoverAllViews()) {
                View findViewById = findViewById(R.id.cw_);
                View findViewById2 = findViewById(R.id.ahc);
                if (findViewById2 != null && findViewById != null) {
                    ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ((C018905p) layoutParams).endToEnd = findViewById.getId();
                    findViewById2.requestLayout();
                }
            }
        }
    }
}
