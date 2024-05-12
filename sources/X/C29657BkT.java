package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BkT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29657BkT implements InterfaceC31672Cbs {
    public boolean LIZ;
    public final /* synthetic */ C29656BkS LIZIZ;
    public final /* synthetic */ View LIZJ;

    @Override // X.InterfaceC31672Cbs
    public final void LIZ(Exception exc) {
        C29636Bk8 c29636Bk8;
        C29635Bk7.LIZLLL(this.LIZIZ.LJLIL.type, 0);
        C29635Bk7.LIZJ(this.LIZIZ.LJLIL.type, 0);
        C29656BkS c29656BkS = this.LIZIZ;
        if (c29656BkS.LJLILLLLZI && (c29636Bk8 = c29656BkS.LLIIJI) != null) {
            Long valueOf = Long.valueOf(c29656BkS.LJLIL.id);
            if (c29636Bk8.LIZ && valueOf != null) {
                c29636Bk8.LIZIZ.put(valueOf, 5);
            }
        }
        C0NB.LIZIZ("Decoration Text", exc.toString());
    }

    @Override // X.InterfaceC31672Cbs
    public final void LIZIZ(Bitmap bitmap) {
        boolean z;
        boolean z2;
        C29656BkS c29656BkS;
        C29636Bk8 c29636Bk8;
        float f;
        float f2;
        o.LJIIIZ(bitmap, "bitmap");
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C29635Bk7.LIZLLL(this.LIZIZ.LJLIL.type, 1);
        C29635Bk7.LIZJ(this.LIZIZ.LJLIL.type, 1);
        boolean z3 = false;
        if (this.LIZIZ._$_findCachedViewById(R.id.j6l).getLayoutParams() instanceof C018905p) {
            C2A8 c2a8 = (C2A8) this.LIZIZ._$_findCachedViewById(R.id.j6l);
            C29656BkS c29656BkS2 = this.LIZIZ;
            c2a8.setText(c29656BkS2.LJLIL.content);
            if (c29656BkS2.LJLZ == 720) {
                f2 = 0.6666667f;
            } else {
                f2 = 1.0f;
            }
            c2a8.setTextSize(0, c29656BkS2.LJLIL.textSize * f2);
            c2a8.setBackground(C31665Cbl.LIZ(f2, bitmap));
            c2a8.setTextColor(ColorProtector.parseColor(c29656BkS2.LJLIL.textColor));
            c2a8.setIncludeFontPadding(false);
            c2a8.setVisibility(0);
            RoomSticker roomSticker = (RoomSticker) c29656BkS2.LJLIL;
            C29656BkS.LJLJJLL(c2a8, roomSticker.topLeftWidth, roomSticker.topLeftHeight, roomSticker.bottomRightWidth, roomSticker.bottomRightHeight, f2);
        }
        ((ImageView) this.LIZIZ._$_findCachedViewById(R.id.j6k)).setVisibility(8);
        this.LIZIZ.setVisibility(0);
        this.LIZIZ._$_findCachedViewById(R.id.j6l).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        C29656BkS c29656BkS3 = this.LIZIZ;
        if (c29656BkS3.LJLILLLLZI) {
            int i = ((RoomSticker) c29656BkS3.LJLIL).reviewStatus;
            if (i == 2) {
                i = 0;
            }
            c29656BkS3.LJLL(i);
            C29656BkS c29656BkS4 = this.LIZIZ;
            c29656BkS4.LJLJLLL(((RoomSticker) c29656BkS4.LJLIL).reviewStatus, false);
            C29656BkS.LJLJJL(this.LIZIZ._$_findCachedViewById(R.id.l43));
        }
        C2A8 c2a82 = (C2A8) this.LIZIZ._$_findCachedViewById(R.id.j6l);
        if (c2a82 != null) {
            C29656BkS c29656BkS5 = this.LIZIZ;
            RoomSticker roomSticker2 = (RoomSticker) c29656BkS5.LJLIL;
            int i2 = roomSticker2.topLeftWidth;
            int i3 = roomSticker2.topLeftHeight;
            int i4 = roomSticker2.bottomRightWidth;
            int i5 = roomSticker2.bottomRightHeight;
            if (c29656BkS5.LJLZ == 720) {
                f = 0.6666667f;
            } else {
                f = 1.0f;
            }
            C29656BkS.LJLJJLL(c2a82, i2, i3, i4, i5, f);
        }
        this.LIZIZ.LJLJL(this.LIZJ, 4, Math.max(this.LIZIZ._$_findCachedViewById(R.id.j6l).getMeasuredWidth(), this.LIZIZ.getCheckViewWidth()), this.LIZIZ.getCheckViewHeight() + Math.max(this.LIZIZ._$_findCachedViewById(R.id.j6l).getMeasuredHeight(), bitmap.getHeight()));
        C29656BkS c29656BkS6 = this.LIZIZ;
        if (c29656BkS6.LJLILLLLZI) {
            Long valueOf = Long.valueOf(c29656BkS6.LJLIL.id);
            C29636Bk8 c29636Bk82 = c29656BkS6.LLIIJI;
            if (c29636Bk82 != null && c29636Bk82.LIZ(1, valueOf) && C46104I7o.LJJIJL((RoomSticker) this.LIZIZ.LJLIL)) {
                z = true;
            } else {
                z = false;
            }
            C29656BkS c29656BkS7 = this.LIZIZ;
            Long valueOf2 = Long.valueOf(c29656BkS7.LJLIL.id);
            C29636Bk8 c29636Bk83 = c29656BkS7.LLIIJI;
            if (c29636Bk83 != null && c29636Bk83.LIZ(2, valueOf2) && !C29536BiW.LJ(Long.valueOf(this.LIZIZ.LJLIL.id))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                DataChannel dataChannel = this.LIZIZ.getDataChannel();
                C29656BkS c29656BkS8 = this.LIZIZ;
                C29598BjW.LJII(dataChannel, (RoomSticker) c29656BkS8.LJLIL, Boolean.valueOf(C29536BiW.LIZ(c29656BkS8.getRoomSticker(), this.LIZIZ.getContent())));
                C29598BjW.LIZJ = SystemClock.elapsedRealtime();
            }
            C29656BkS c29656BkS9 = this.LIZIZ;
            C29598BjW.LIZJ(this.LIZIZ.getDataChannel(), (RoomSticker) this.LIZIZ.LJLIL, Boolean.valueOf(C29536BiW.LIZ((RoomSticker) c29656BkS9.LJLIL, c29656BkS9.getContent())), ((RoomSticker) this.LIZIZ.LJLIL).reviewStatus, 0L);
            if (C29536BiW.LJ(Long.valueOf(this.LIZIZ.LJLIL.id)) && ((c29636Bk8 = (c29656BkS = this.LIZIZ).LLIIJI) == null || !c29636Bk8.LIZ(1, Long.valueOf(c29656BkS.LJLIL.id)))) {
                C29656BkS c29656BkS10 = this.LIZIZ;
                Boolean valueOf3 = Boolean.valueOf(c29656BkS10.LJLILLLLZI);
                Context context = this.LIZIZ.getContext();
                o.LJIIIIZZ(context, "context");
                C29656BkS c29656BkS11 = this.LIZIZ;
                if (this.LIZJ.getVisibility() == 0) {
                    z3 = true;
                }
                Boolean valueOf4 = Boolean.valueOf(z3);
                C29656BkS c29656BkS12 = this.LIZIZ;
                c29656BkS10.LJLJLJ(valueOf3, context, c29656BkS11, 2, valueOf4, c29656BkS12.LLILIL, new AqS155S0100000_5(c29656BkS12, 332), true);
                this.LIZIZ.LJLL(5);
                C29656BkS c29656BkS13 = this.LIZIZ;
                c29656BkS13.LLIILZL = true;
                c29656BkS13.LJLIIL(true);
                if (C15380j0.LJIILLIIL()) {
                    c29656BkS13.LJLJJI.LJJLJ(true);
                }
            }
            C29656BkS c29656BkS14 = this.LIZIZ;
            C29636Bk8 c29636Bk84 = c29656BkS14.LLIIJI;
            if (c29636Bk84 != null) {
                Long valueOf5 = Long.valueOf(c29656BkS14.LJLIL.id);
                if (!c29636Bk84.LIZ || valueOf5 == null) {
                    return;
                }
                c29636Bk84.LIZIZ.put(valueOf5, 5);
            }
        }
    }

    public C29657BkT(C29656BkS c29656BkS, View view) {
        this.LIZIZ = c29656BkS;
        this.LIZJ = view;
    }
}
