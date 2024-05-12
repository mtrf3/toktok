package X;

import Y.AfS54S0200000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BkS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29656BkS extends AbstractC29665Bkb<Sticker> {
    public final RoomSticker LLIIIJ;
    public final boolean LLIIIL;
    public final InterfaceC29661BkX LLIIIZ;
    public final C29636Bk8 LLIIJI;
    public final DataChannel LLIIJLIL;
    public View LLIIL;
    public C73411SrX LLIILII;
    public boolean LLIILZL;
    public final AlphaAnimation LLIIZ;
    public int LLIL;
    public long LLILII;
    public final AqS171S0100000_5 LLILIL;
    public final java.util.Map<Integer, View> LLILL;

    @Override // X.AbstractC29665Bkb
    public final void LJJZ() {
        BEF bef;
        DataChannel dataChannel = this.LLIIJLIL;
        if (dataChannel != null) {
            bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class);
        } else {
            bef = null;
        }
        boolean z = false;
        if ((bef == null || !bef.LJLJI) && C29536BiW.LJ(Long.valueOf(this.LJLIL.id))) {
            Boolean valueOf = Boolean.valueOf(this.LLIIIL);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (getVisibility() == 0) {
                z = true;
            }
            LJLJLJ(valueOf, context, this, 1, Boolean.valueOf(z), this.LLILIL, new AqS155S0100000_5(this, 331), false);
            LJLL(5);
            this.LLIILZL = true;
            LJLIIL(true);
            if (C15380j0.LJIILLIIL()) {
                this.LJLJJI.LJJLJ(true);
            }
        }
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractC29665Bkb
    public final View LJJZZIII() {
        if (this.LJLZ < 720) {
            return null;
        }
        C29635Bk7.LIZLLL = SystemClock.elapsedRealtime();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.di_, this, false);
        this.LLIIL = LLLLIILL;
        return LLLLIILL;
    }

    public final boolean LJLILLLLZI() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.l43);
        if (_$_findCachedViewById != null && _$_findCachedViewById.getVisibility() == 0 && this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final void LJLLILLLL() {
        int i;
        C2A8 c2a8;
        float f;
        if (_$_findCachedViewById(R.id.j6l) == null || _$_findCachedViewById(R.id.j6l).getVisibility() != 0) {
            return;
        }
        LJLJJL(_$_findCachedViewById(R.id.l43));
        LJLJJL(_$_findCachedViewById(R.id.j6l));
        if ((this.LJLIL instanceof RoomSticker) && (c2a8 = (C2A8) _$_findCachedViewById(R.id.j6l)) != null) {
            RoomSticker roomSticker = (RoomSticker) this.LJLIL;
            int i2 = roomSticker.topLeftWidth;
            int i3 = roomSticker.topLeftHeight;
            int i4 = roomSticker.bottomRightWidth;
            int i5 = roomSticker.bottomRightHeight;
            if (this.LJLZ == 720) {
                f = 0.6666667f;
            } else {
                f = 1.0f;
            }
            LJLJJLL(c2a8, i2, i3, i4, i5, f);
        }
        View view = this.LLIIL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int measuredWidth = _$_findCachedViewById(R.id.j6l).getMeasuredWidth();
            View _$_findCachedViewById = _$_findCachedViewById(R.id.l43);
            if (_$_findCachedViewById != null) {
                i = _$_findCachedViewById.getMeasuredWidth();
            } else {
                i = 0;
            }
            layoutParams.width = Math.max(measuredWidth, i);
            layoutParams.height = getCheckViewHeight() + _$_findCachedViewById(R.id.j6l).getMeasuredHeight();
        }
        view.setLayoutParams(layoutParams);
    }

    public final int getCheckViewHeight() {
        if (LJLILLLLZI()) {
            return _$_findCachedViewById(R.id.l43).getMeasuredHeight();
        }
        return 0;
    }

    public final int getCheckViewWidth() {
        if (LJLILLLLZI()) {
            return _$_findCachedViewById(R.id.l43).getMeasuredWidth();
        }
        return 0;
    }

    public final String getContent() {
        CharSequence charSequence = null;
        if (getType() != 4) {
            return null;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.j6l);
        if (appCompatTextView != null) {
            charSequence = appCompatTextView.getText();
        }
        return (String) charSequence;
    }

    public final C2A8 getDecorationText() {
        return (C2A8) _$_findCachedViewById(R.id.j6l);
    }

    public final int getDecorationTextHeight() {
        View _$_findCachedViewById;
        if (_$_findCachedViewById(R.id.j6l) == null || (_$_findCachedViewById = _$_findCachedViewById(R.id.j6l)) == null) {
            return 0;
        }
        return _$_findCachedViewById.getMeasuredHeight();
    }

    @Override // X.AbstractC29665Bkb, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C73943T0h.LIZ().LIZIZ(new C29670Bkg(0));
        C73411SrX c73411SrX = this.LLIILII;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
    }

    public final DataChannel getDataChannel() {
        return this.LLIIJLIL;
    }

    public final InterfaceC29661BkX getDecorationWidgetCallback() {
        return this.LLIIIZ;
    }

    public final RoomSticker getRoomSticker() {
        return this.LLIIIJ;
    }

    public final boolean getTextEditable() {
        return this.LLIILZL;
    }

    public static void LJLJJL(View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // X.AbstractC29665Bkb
    public final void LJL(View view) {
        ImageModel imageModel;
        List<String> urls;
        T t = this.LJLIL;
        if (!(t instanceof RoomSticker)) {
            return;
        }
        int i = t.type;
        if (i != 4) {
            if ((i != 5 && i != 6) || (imageModel = ((RoomSticker) t).image) == null || (urls = imageModel.getUrls()) == null || urls.isEmpty()) {
                return;
            }
            C16880lQ.LJIIJ(ViewOnClickListenerC29663BkZ.LJLIL, view);
            C29635Bk7.LJ = SystemClock.elapsedRealtime();
            C15640jQ.LJFF((ImageView) _$_findCachedViewById(R.id.j6k), ((RoomSticker) this.LJLIL).image, 0, new C29658BkU(this, view));
            return;
        }
        C16880lQ.LJIIJ(ViewOnClickListenerC29664Bka.LJLIL, view);
        C29635Bk7.LJ = SystemClock.elapsedRealtime();
        C31665Cbl.LJIIIIZZ(_$_findCachedViewById(R.id.j6l), ((RoomSticker) this.LJLIL).ninePatchImage, true, new C29657BkT(this, view));
    }

    public final void LJLJI(RoomSticker roomSticker) {
        C73411SrX c73411SrX = this.LLIILII;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
        this.LLIILII = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(30L, TimeUnit.SECONDS).LJJL(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0200000_5(this, roomSticker, 46));
    }

    public final void LJLL(int i) {
        Drawable background;
        Drawable background2;
        Drawable background3;
        if (this.LLIILZL) {
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.l43);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.l43);
                            if (_$_findCachedViewById2 == null) {
                                return;
                            }
                            _$_findCachedViewById2.setVisibility(8);
                            return;
                        }
                        _$_findCachedViewById(R.id.j6l).setAlpha(1.0f);
                        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.l43);
                        if (_$_findCachedViewById3 == null) {
                            return;
                        }
                        _$_findCachedViewById3.setVisibility(8);
                        return;
                    }
                    View _$_findCachedViewById4 = _$_findCachedViewById(R.id.kjx);
                    if (_$_findCachedViewById4 != null) {
                        _$_findCachedViewById4.setVisibility(8);
                    }
                    View _$_findCachedViewById5 = _$_findCachedViewById(R.id.kjw);
                    if (_$_findCachedViewById5 != null) {
                        _$_findCachedViewById5.setBackground(C15380j0.LJI(R.drawable.db9));
                    }
                    _$_findCachedViewById(R.id.kjw).setLayoutParams(new LinearLayout.LayoutParams(C15380j0.LIZ(24.0f), C15380j0.LIZ(24.0f)));
                    _$_findCachedViewById(R.id.j6l).setAlpha(0.5f);
                    View _$_findCachedViewById6 = _$_findCachedViewById(R.id.l43);
                    if (_$_findCachedViewById6 != null) {
                        _$_findCachedViewById6.setBackground(null);
                    }
                    View _$_findCachedViewById7 = _$_findCachedViewById(R.id.l43);
                    if (_$_findCachedViewById7 == null) {
                        return;
                    }
                    _$_findCachedViewById7.setVisibility(0);
                    return;
                }
                View _$_findCachedViewById8 = _$_findCachedViewById(R.id.kjw);
                if (_$_findCachedViewById8 != null) {
                    _$_findCachedViewById8.setBackground(C15380j0.LJI(R.drawable.dav));
                }
                _$_findCachedViewById(R.id.kjw).setLayoutParams(new LinearLayout.LayoutParams(C15380j0.LIZ(14.0f), C15380j0.LIZ(14.0f)));
                TextView textView = (TextView) _$_findCachedViewById(R.id.kjx);
                if (textView != null) {
                    textView.setText(C15380j0.LJIILJJIL(R.string.kyv));
                }
                _$_findCachedViewById(R.id.j6l).setAlpha(0.5f);
                View _$_findCachedViewById9 = _$_findCachedViewById(R.id.l43);
                if (_$_findCachedViewById9 != null) {
                    _$_findCachedViewById9.setBackground(C15380j0.LJI(R.drawable.db2));
                }
                View _$_findCachedViewById10 = _$_findCachedViewById(R.id.l43);
                if (_$_findCachedViewById10 != null && (background3 = _$_findCachedViewById10.getBackground()) != null) {
                    background3.setAlpha(128);
                }
                View _$_findCachedViewById11 = _$_findCachedViewById(R.id.kjx);
                if (_$_findCachedViewById11 != null) {
                    _$_findCachedViewById11.setVisibility(0);
                }
                View _$_findCachedViewById12 = _$_findCachedViewById(R.id.l43);
                if (_$_findCachedViewById12 == null) {
                    return;
                }
                _$_findCachedViewById12.setVisibility(0);
                return;
            }
            View _$_findCachedViewById13 = _$_findCachedViewById(R.id.kjw);
            if (_$_findCachedViewById13 != null) {
                _$_findCachedViewById13.setBackground(C15380j0.LJI(R.drawable.daz));
            }
            _$_findCachedViewById(R.id.kjw).setLayoutParams(new LinearLayout.LayoutParams(C15380j0.LIZ(14.0f), C15380j0.LIZ(14.0f)));
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.kjx);
            if (textView2 != null) {
                textView2.setText(C15380j0.LJIILJJIL(R.string.kyu));
            }
            _$_findCachedViewById(R.id.j6l).setAlpha(1.0f);
            View _$_findCachedViewById14 = _$_findCachedViewById(R.id.l43);
            if (_$_findCachedViewById14 != null) {
                _$_findCachedViewById14.setBackground(C15380j0.LJI(R.drawable.db1));
            }
            View _$_findCachedViewById15 = _$_findCachedViewById(R.id.l43);
            if (_$_findCachedViewById15 != null && (background2 = _$_findCachedViewById15.getBackground()) != null) {
                background2.setAlpha(255);
            }
            View _$_findCachedViewById16 = _$_findCachedViewById(R.id.l43);
            if (_$_findCachedViewById16 != null) {
                _$_findCachedViewById16.setVisibility(0);
            }
            View _$_findCachedViewById17 = _$_findCachedViewById(R.id.kjx);
            if (_$_findCachedViewById17 != null) {
                _$_findCachedViewById17.setVisibility(0);
            }
            if (_$_findCachedViewById(R.id.l43) != null) {
                AlphaAnimation alphaAnimation = this.LLIIZ;
                View text_edit_status = _$_findCachedViewById(R.id.l43);
                o.LJIIIIZZ(text_edit_status, "text_edit_status");
                alphaAnimation.setAnimationListener(new AnimationAnimationListenerC29662BkY(text_edit_status, this));
            }
            View _$_findCachedViewById18 = _$_findCachedViewById(R.id.l43);
            if (_$_findCachedViewById18 == null) {
                return;
            }
            _$_findCachedViewById18.startAnimation(this.LLIIZ);
            return;
        }
        View _$_findCachedViewById19 = _$_findCachedViewById(R.id.kjw);
        if (_$_findCachedViewById19 != null) {
            _$_findCachedViewById19.setBackground(C15380j0.LJI(R.drawable.db_));
        }
        _$_findCachedViewById(R.id.kjw).setLayoutParams(new LinearLayout.LayoutParams(C15380j0.LIZ(12.0f), C15380j0.LIZ(12.0f)));
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.kjx);
        if (textView3 != null) {
            textView3.setText(C15380j0.LJIILJJIL(R.string.kyw));
        }
        _$_findCachedViewById(R.id.j6l).setAlpha(0.5f);
        View _$_findCachedViewById20 = _$_findCachedViewById(R.id.l43);
        if (_$_findCachedViewById20 != null) {
            _$_findCachedViewById20.setBackground(C15380j0.LJI(R.drawable.db1));
        }
        View _$_findCachedViewById21 = _$_findCachedViewById(R.id.l43);
        if (_$_findCachedViewById21 != null && (background = _$_findCachedViewById21.getBackground()) != null) {
            background.setAlpha(128);
        }
        View _$_findCachedViewById22 = _$_findCachedViewById(R.id.l43);
        if (_$_findCachedViewById22 != null) {
            _$_findCachedViewById22.setVisibility(0);
        }
        View _$_findCachedViewById23 = _$_findCachedViewById(R.id.kjx);
        if (_$_findCachedViewById23 == null) {
            return;
        }
        _$_findCachedViewById23.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bytedance.android.livesdk.model.RoomSticker, O] */
    public final void LJLLI(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            DataChannel dataChannel = this.LLIIJLIL;
            if (dataChannel != null) {
                RoomSticker roomSticker = this.LLIIIJ;
                String content = getContent();
                if (content == null) {
                    content = "";
                }
                ((C32537Cpp) dataChannel.gv0(C55612Gf.class)).LIZ = LJLIL(roomSticker, content);
            }
            C29598BjW.LIZ = SystemClock.elapsedRealtime();
        }
        LJLL(i);
        LJLJLLL(i, true);
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            LJLJI(this.LLIIIJ);
        }
        LJLLILLLL();
    }

    public static RoomSticker LJLIL(RoomSticker roomSticker, String str) {
        RoomSticker LIZ = RoomSticker.LIZ(roomSticker);
        LIZ.content = str;
        LIZ.id = roomSticker.id;
        LIZ.LIZ = roomSticker.LIZ;
        LIZ.type = roomSticker.type;
        LIZ.textColor = roomSticker.textColor;
        LIZ.textSize = roomSticker.textSize;
        LIZ.x = roomSticker.x;
        LIZ.y = roomSticker.y;
        LIZ.screenWidth = roomSticker.screenWidth;
        LIZ.screenHeight = roomSticker.screenHeight;
        return LIZ;
    }

    public final void LJLJLLL(int i, boolean z) {
        int i2 = this.LLIL;
        this.LLIL = i;
        if (z) {
            if (i2 == 1) {
                if (this.LLILII != -1) {
                    T t = this.LJLIL;
                    if (t instanceof RoomSticker) {
                        RoomSticker roomSticker = (RoomSticker) t;
                        C29598BjW.LIZJ(this.LLIIJLIL, roomSticker, Boolean.valueOf(C29536BiW.LIZ(roomSticker, getContent())), this.LLIL, SystemClock.elapsedRealtime() - this.LLILII);
                        this.LLILII = -1L;
                    }
                }
            } else {
                T t2 = this.LJLIL;
                if (t2 instanceof RoomSticker) {
                    RoomSticker roomSticker2 = (RoomSticker) t2;
                    C29598BjW.LIZJ(this.LLIIJLIL, roomSticker2, Boolean.valueOf(C29536BiW.LIZ(roomSticker2, getContent())), this.LLIL, 0L);
                }
            }
        }
        if (i == 1) {
            this.LLILII = SystemClock.elapsedRealtime();
        }
    }

    public final void LJLJL(View view, int i, int i2, int i3) {
        float f;
        int i4;
        int i5;
        int i6 = i2 / 2;
        int i7 = i3 / 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
        if (i == 5 || i == 6) {
            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.j6k).getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            _$_findCachedViewById(R.id.j6k).setLayoutParams(layoutParams2);
        }
        T t = this.LJLIL;
        int i8 = t.x;
        if (i8 != -1 || t.y != -1) {
            int i9 = t.screenWidth;
            float f2 = 1.0f;
            if (i9 > 0) {
                f = this.LJLZ / i9;
            } else {
                f = 1.0f;
            }
            int i10 = t.screenHeight;
            if (i10 > 0) {
                f2 = this.LJZ / i10;
            }
            i4 = ((int) (i8 * f)) - i6;
            i5 = (int) (t.y * f2);
        } else {
            int[] iArr = this.LJLLI;
            i4 = ((iArr[2] + iArr[3]) / 2) - i6;
            i5 = (getResources().getDimensionPixelSize(R.dimen.ags) + this.LJLLI[1]) / 2;
        }
        int i11 = i5 - i7;
        int[] iArr2 = this.LJLLI;
        int i12 = iArr2[2];
        if (i4 < i12) {
            i4 = i12;
        } else {
            int i13 = layoutParams.width;
            int i14 = i4 + i13;
            int i15 = iArr2[3];
            if (i14 > i15) {
                i4 = i15 - i13;
            }
        }
        int i16 = iArr2[0];
        if (i11 < i16) {
            i11 = i16;
        } else {
            int i17 = layoutParams.height;
            int i18 = i11 + i17;
            int i19 = iArr2[1];
            if (i18 > i19) {
                i11 = i19 - i17;
            }
        }
        view.setX(i4);
        view.setY(i11);
        T t2 = this.LJLIL;
        t2.x = i4 + i6;
        t2.y = i11 + i7;
        if (this.LJLILLLLZI && (t2 instanceof RoomSticker)) {
            C29636Bk8 c29636Bk8 = this.LLIIJI;
            if ((c29636Bk8 != null && c29636Bk8.LIZ(1, Long.valueOf(t2.id))) || C29536BiW.LJ(Long.valueOf(this.LJLIL.id))) {
                return;
            }
            this.LJLJJI.LJIILL((RoomSticker) this.LJLIL, getContent());
        }
    }

    public static void LJLJJLL(C2A8 c2a8, int i, int i2, int i3, int i4, float f) {
        c2a8.setPaddingRelative((int) (i * f), (int) (i2 * f), (int) (i3 * f), (int) (i4 * f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29656BkS(Context context, RoomSticker roomSticker, boolean z, int[] validArea, InterfaceC29661BkX decorationWidgetCallback, boolean z2, C29636Bk8 c29636Bk8, DataChannel dataChannel) {
        super(context, roomSticker, z, validArea, decorationWidgetCallback, z2);
        o.LJIIIZ(roomSticker, "roomSticker");
        o.LJIIIZ(validArea, "validArea");
        o.LJIIIZ(decorationWidgetCallback, "decorationWidgetCallback");
        this.LLILL = new LinkedHashMap();
        this.LLIIIJ = roomSticker;
        this.LLIIIL = z;
        this.LLIIIZ = decorationWidgetCallback;
        this.LLIIJI = c29636Bk8;
        this.LLIIJLIL = dataChannel;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setStartOffset(1800L);
        alphaAnimation.setDuration(200L);
        this.LLIIZ = alphaAnimation;
        this.LLILII = -1L;
        this.LLILIL = new AqS171S0100000_5(this, 659);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.bytedance.android.livesdk.model.RoomSticker, O] */
    public final void LJLJLJ(Boolean bool, Context context, C29656BkS c29656BkS, int i, Boolean bool2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, boolean z) {
        RoomSticker roomSticker;
        if (o.LJ(bool, Boolean.FALSE) || c29656BkS.getType() != 4 || !o.LJ(bool2, Boolean.TRUE) || this.LLIILZL) {
            return;
        }
        DataChannel dataChannel = this.LLIIJLIL;
        if (dataChannel != null) {
            RoomSticker roomSticker2 = this.LLIIIJ;
            String content = getContent();
            if (content == null) {
                content = "";
            }
            ((C32537Cpp) dataChannel.gv0(C55612Gf.class)).LIZ = LJLIL(roomSticker2, content);
        }
        C29598BjW.LIZ = SystemClock.elapsedRealtime();
        if (z) {
            LJLJI(this.LLIIIJ);
        }
        StickerEditFragment stickerEditFragment = new StickerEditFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("build_dialog", i);
        stickerEditFragment.setArguments(bundle);
        stickerEditFragment.LJLJJL = c29656BkS;
        T t = c29656BkS.LJLIL;
        if (t instanceof RoomSticker) {
            roomSticker = (RoomSticker) t;
        } else {
            roomSticker = null;
        }
        stickerEditFragment.LJLJLLL = roomSticker;
        stickerEditFragment.LJLL = interfaceC88472Yns;
        stickerEditFragment.LJLLI = interfaceC65784Pro;
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        stickerEditFragment.show(LIZIZ.getSupportFragmentManager(), C16880lQ.LJLLILLLL(StickerEditFragment.class));
    }
}
