package Y;

import X.AbstractC73672Svk;
import X.BLU;
import X.BZ4;
import X.BZ8;
import X.C28467BFf;
import X.C29985Bpl;
import X.C31951CgN;
import X.C68322mC;
import X.InterfaceC48038ItG;
import android.graphics.Bitmap;
import android.util.Pair;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscriptionWidget;
import com.google.gson.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDhS98S0100000_5 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            default:
                return null;
        }
    }

    public IDhS98S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS98S0100000_5 iDhS98S0100000_5, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof BZ4) {
            BZ8 bz8 = (BZ8) iDhS98S0100000_5.l0;
            int i = bz8.LJLIL;
            bz8.LJLIL = i + 1;
            if (i < ((Number) bz8.LJLILLLLZI.getValue()).intValue()) {
                return AbstractC73672Svk.LJJLIIIJLJLI(((Number) ((BZ8) iDhS98S0100000_5.l0).LJLJI.getValue()).longValue(), TimeUnit.MILLISECONDS);
            }
        }
        return AbstractC73672Svk.LJJI(throwable);
    }

    public static final Object apply$1(IDhS98S0100000_5 iDhS98S0100000_5, Object obj) {
        C28467BFf<m> it = (C28467BFf) obj;
        o.LJIIIZ(it, "it");
        return ((SubscriptionWidget) iDhS98S0100000_5.l0).LJZ(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(IDhS98S0100000_5 iDhS98S0100000_5, Object obj) {
        BaseListResponse response = (BaseListResponse) obj;
        o.LJIIIZ(response, "response");
        ArrayList arrayList = new ArrayList();
        Collection collection = response.data;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        Pair create = Pair.create(arrayList, response.extra);
        o.LJIIIIZZ(create, "create<List<FeedItem>, F…a>(items, response.extra)");
        return new BLU(create, response.LIZ, response.LIZIZ, response.LIZJ, "draw", (String) ((C68322mC) iDhS98S0100000_5.l0).element);
    }

    public static final Object apply$3(IDhS98S0100000_5 iDhS98S0100000_5, Object obj) {
        C31951CgN c31951CgN = (C31951CgN) iDhS98S0100000_5.l0;
        long longValue = ((Long) obj).longValue();
        c31951CgN.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(longValue);
        return AbstractC73672Svk.LJJIIJ(allocate.array());
    }

    public static final Object apply$4(IDhS98S0100000_5 iDhS98S0100000_5, Object obj) {
        ImageModel imageModel = (ImageModel) iDhS98S0100000_5.l0;
        C29985Bpl c29985Bpl = new C29985Bpl();
        c29985Bpl.LIZJ = (Bitmap) obj;
        c29985Bpl.LIZ = false;
        c29985Bpl.LIZIZ = imageModel.mUri;
        return c29985Bpl;
    }

    public static final Object apply$5(IDhS98S0100000_5 iDhS98S0100000_5, Object obj) {
        ImageModel imageModel = (ImageModel) iDhS98S0100000_5.l0;
        C29985Bpl c29985Bpl = new C29985Bpl();
        c29985Bpl.LIZJ = (Bitmap) obj;
        c29985Bpl.LIZ = true;
        c29985Bpl.LIZIZ = imageModel.mUri;
        return c29985Bpl;
    }

    public static final Object apply$6(IDhS98S0100000_5 iDhS98S0100000_5, Object obj) {
        ImageModel imageModel = (ImageModel) iDhS98S0100000_5.l0;
        C29985Bpl c29985Bpl = new C29985Bpl();
        c29985Bpl.LIZJ = (Bitmap) obj;
        c29985Bpl.LIZ = false;
        c29985Bpl.LIZIZ = imageModel.mUri;
        return c29985Bpl;
    }
}
