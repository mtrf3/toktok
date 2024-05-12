package X;

import Y.AfS57S0100000_5;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.Cqo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32598Cqo extends AbstractC32678Cs6 {
    public final View LLFII;
    public final C47121t6 LLFZ;
    public final String LLI;

    @Override // X.AbstractC32678Cs6
    public final void U() {
    }

    @Override // X.AbstractC32678Cs6
    public final String Q() {
        return this.LLI;
    }

    public C32598Cqo(View view) {
        super(view);
        this.LLFII = view;
        this.LLI = "LiveGiftBoxViewHolder";
        this.LJLJJI = (C47121t6) view.findViewById(R.id.gzi);
        this.LLFZ = (C47121t6) view.findViewById(R.id.it0);
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 == null) {
            return;
        }
        c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
    }

    @Override // X.AbstractC32678Cs6
    public final void N(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, DataChannel dataChannel, int i) {
        String str;
        Resources resources;
        List<String> urls;
        String str2;
        int i2;
        Gift gift;
        if (C30922CBq.LIZIZ) {
            T t = abstractC32698CsQ.LIZIZ;
            if ((t instanceof Gift) && (gift = (Gift) t) != null) {
                i2 = gift.type;
            } else {
                i2 = 0;
            }
            View view = this.LLFII;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(abstractC32698CsQ.LJFF());
            LIZ.append(",selected:");
            C1FL.LJFF(LIZ, abstractC32698CsQ.LIZJ, ",type:", i2, "},gift index:");
            LIZ.append(i);
            view.setTag(X1D.LIZIZ(LIZ));
        }
        C29306Beo.LJJJLL(this.LLFII, 500L, new AqS171S0100000_5(abstractC32698CsQ, (AbstractC32698CsQ<? extends C30896CAq>) 558));
        C47121t6 c47121t6 = this.LJLJJI;
        String str3 = "";
        if (c47121t6 != null) {
            String LJFF = abstractC32698CsQ.LJFF();
            if (LJFF == null) {
                LJFF = "";
            }
            c47121t6.setText(LJFF);
        }
        C47121t6 c47121t62 = this.LLFZ;
        if (c47121t62 != null) {
            Context context = this.LLFII.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getString(R.string.lj7);
            } else {
                str = null;
            }
            c47121t62.setText(str);
        }
        C73893SzJ c73893SzJ = new C73893SzJ();
        C15640jQ.LJFF(this.LJLJJLL, abstractC32698CsQ.LIZLLL(), R.drawable.d1o, new C32723Csp(c73893SzJ, this, abstractC32698CsQ));
        long LIZJ = abstractC32698CsQ.LIZJ();
        ImageModel LIZLLL = abstractC32698CsQ.LIZLLL();
        if (LIZLLL != null && (urls = LIZLLL.getUrls()) != null && (str2 = (String) ListProtector.get(urls, 0)) != null) {
            str3 = str2;
        }
        C78999UzT.LJFF(AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJIIJ(new C32746CtC(LIZJ, UriProtector.parse(str3), null)), c73893SzJ, new C44384HbQ()).LJJJLIIL(new AfS57S0100000_5(this, 191), C28199B4x.LJLIL), this.LLFFF);
    }
}
