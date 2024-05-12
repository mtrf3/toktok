package X;

import Y.AObserverS79S0100000_11;
import Y.AfS24S1100000_11;
import Y.AfS63S0100000_11;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.QgJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractViewOnClickListenerC67619QgJ extends AEW implements View.OnClickListener {
    public final BasePage LJLJJL;
    public Integer LJLJJLL;
    public Integer LJLJL;
    public Integer LJLJLJ;
    public Integer LJLJLLL;
    public Integer LJLL;
    public Integer LJLLI;
    public Integer LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public long LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;

    public abstract void LJIILL();

    public abstract void LJIILLIIL(View view);

    /* JADX WARN: Type inference failed for: r4v0, types: [X.AEC, X.AEL] */
    @Override // X.AG6
    public final AEL LJI() {
        if (DZD.LIZ) {
            this.LJLJJLL = Integer.valueOf(R.string.r1l);
            this.LJLJL = Integer.valueOf(R.string.cf7);
            this.LJLJLJ = Integer.valueOf(R.string.r1n);
            this.LJLJLLL = Integer.valueOf(R.string.cfa);
            this.LJLL = Integer.valueOf(R.string.r1o);
            this.LJLLI = Integer.valueOf(R.string.cf6);
            this.LJLLILLLL = Integer.valueOf(R.string.cf_);
        } else {
            this.LJLJJLL = Integer.valueOf(R.string.qxo);
            this.LJLJL = Integer.valueOf(R.string.qxn);
            this.LJLJLJ = Integer.valueOf(R.string.qx6);
            this.LJLJLLL = Integer.valueOf(R.string.qx4);
            this.LJLL = Integer.valueOf(R.string.qx5);
            this.LJLLI = Integer.valueOf(R.string.qx2);
            this.LJLLILLLL = Integer.valueOf(R.string.qx1);
        }
        ?? LJI = super.LJI();
        LJIILJJIL().LJLIL.observe(this.LJLJJL, new AObserverS79S0100000_11(this, 3));
        return LJI;
    }

    public final DiskViewModel LJIILJJIL() {
        return (DiskViewModel) this.LJLZ.getValue();
    }

    @Override // X.AEW, X.AG6
    public /* bridge */ /* synthetic */ AEL LJIIIIZZ() {
        return LJIIIIZZ();
    }

    public final List<InterfaceC37286EkE> LJIIL() {
        DiskViewModel LJIILJJIL = LJIILJJIL();
        LJIILJJIL.getClass();
        if (C23930wn.LIZ()) {
            synchronized (LJIILJJIL.LJLJJL) {
                if (((ArrayList) LJIILJJIL.LJLJJL).isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C36827Ecp());
                    arrayList.add(new C39578Fg6(C47242IgQ.LIZ()));
                    arrayList.addAll(C43089Gvd.LIZ());
                    arrayList.add(new C37296EkO());
                    arrayList.addAll(C88546Yp4.LIZIZ.LIZ());
                    arrayList.add(new C59162NJu());
                    arrayList.add(new C66593QBp());
                    arrayList.add(new C66592QBo());
                    arrayList.add(new C66581QBd());
                    arrayList.add(new C66582QBe());
                    arrayList.add(new C66583QBf());
                    arrayList.add(new C66584QBg());
                    arrayList.add(new C66585QBh());
                    if (C86951YAp.LIZIZ.LJ()) {
                        arrayList.add(new C66595QBr());
                    }
                    ((ArrayList) LJIILJJIL.LJLJJL).addAll(arrayList);
                }
            }
            return LJIILJJIL.LJLJJL;
        }
        List<InterfaceC37286EkE> LJIIJ = P8H.LJIIJ();
        o.LJIIIIZZ(LJIIJ, "{\n            StorageMan…etStorageList()\n        }");
        return LJIIJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractViewOnClickListenerC67619QgJ(BasePage page) {
        super(null);
        o.LJIIIZ(page, "page");
        this.LJLJJL = page;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 100));
        this.LJLZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 101));
    }

    public final void LJIIZILJ(String str) {
        AbstractC73672Svk.LJJIJIL(this).LJJL(T16.LIZ()).LJJIJL(new C67620QgK(this, str)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS63S0100000_11(this, 51), new AfS24S1100000_11(this, str, 11));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        if (LJFF().LLIFFJFJJ) {
            return;
        }
        LJIILLIIL(v);
    }

    public final String LJIILIIL(int i, Object... objArr) {
        String string = ((Context) this.LJLLLLLL.getValue()).getString(i, Arrays.copyOf(objArr, objArr.length));
        o.LJIIIIZZ(string, "context.getString(resId, *formatArgs)");
        return string;
    }
}
