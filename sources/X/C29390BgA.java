package X;

import Y.IDCSpanS31S0100000_5;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;

/* renamed from: X.BgA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29390BgA implements UCZ {
    public final /* synthetic */ WeakReference LIZ;
    public final /* synthetic */ float LIZIZ;
    public final /* synthetic */ Room LIZJ;
    public final /* synthetic */ InterfaceC29391BgB LIZLLL;
    public final /* synthetic */ C29392BgC LJ;

    @Override // X.UCZ
    public final void LIZ(Bitmap bitmap) {
        int length;
        if (this.LIZ.get() != null && bitmap != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            float width = bitmap.getWidth() * this.LIZIZ;
            float height = bitmap.getHeight() * this.LIZIZ;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(((View) this.LIZ.get()).getResources(), copy);
            bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
            C32207CkV c32207CkV = new C32207CkV(bitmapDrawable);
            spannableStringBuilder.append((CharSequence) CardStruct.IStatusCode.DEFAULT);
            if (spannableStringBuilder.length() > 0) {
                length = spannableStringBuilder.length() - 1;
            } else {
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(c32207CkV, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new IDCSpanS31S0100000_5(this, 4), length, spannableStringBuilder.length(), 33);
            InterfaceC29391BgB interfaceC29391BgB = this.LIZLLL;
            if (interfaceC29391BgB != null) {
                interfaceC29391BgB.LIZ(spannableStringBuilder);
            }
        }
    }

    public C29390BgA(C29392BgC c29392BgC, WeakReference weakReference, float f, Room room, InterfaceC29391BgB interfaceC29391BgB) {
        this.LJ = c29392BgC;
        this.LIZ = weakReference;
        this.LIZIZ = f;
        this.LIZJ = room;
        this.LIZLLL = interfaceC29391BgB;
    }
}
