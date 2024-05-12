package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NsN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60723NsN extends ConstraintLayout {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public SparkContext LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public InterfaceC60721NsL LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;

    public final boolean getKeepAlive() {
        return this.LJLJLJ;
    }

    public final int getOptimization() {
        return this.LJLJL;
    }

    public final SparkContext getSparkContext() {
        return this.LJLILLLLZI;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS getSparkView() {
        return this.LJLIL;
    }

    public final long getViewCreatedTime() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60723NsN(Context context) {
        super(context, null, 0);
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIJ(context, "context");
        this.LJLJJLL = currentTimeMillis;
        this.LJLJL = 0;
        this.LJLJLJ = false;
        this.LJLIL = new SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(context, null, 0, this.LJLJJLL, this.LJLJL, this.LJLJLJ);
        C16880lQ.LLLZIIL(R.layout.cne, C16880lQ.LLZIL(context), this);
    }

    public final void LJJLJLI(SparkContext sparkContext) {
        InterfaceC60721NsL interfaceC60721NsL;
        InterfaceC60721NsL interfaceC60721NsL2;
        o.LJIIJ(sparkContext, "sparkContext");
        this.LJLILLLLZI = sparkContext;
        AbstractC59790NdK abstractC59790NdK = (AbstractC59790NdK) sparkContext.LIZIZ(AbstractC59790NdK.class);
        if (abstractC59790NdK != null) {
            this.LJLJI = abstractC59790NdK.LIZIZ();
            this.LJLJJI = abstractC59790NdK.LIZ();
        } else {
            abstractC59790NdK = null;
        }
        SparkContext sparkContext2 = this.LJLILLLLZI;
        if (sparkContext2 != null) {
            interfaceC60721NsL = (InterfaceC60721NsL) sparkContext2.LIZIZ(InterfaceC60721NsL.class);
        } else {
            interfaceC60721NsL = null;
        }
        this.LJLJJL = interfaceC60721NsL;
        if (abstractC59790NdK != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.lhm);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            View view = this.LJLJI;
            if (view != null) {
                C60792NtU.LIZ.getClass();
                C60792NtU.LJ(view);
                if (viewGroup != null) {
                    viewGroup.addView(view);
                }
            }
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.arx);
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            View view2 = this.LJLJJI;
            if (view2 != null) {
                C60792NtU.LIZ.getClass();
                C60792NtU.LJ(view2);
                if (viewGroup2 != null) {
                    viewGroup2.addView(view2);
                }
            }
        }
        this.LJLIL.LJIIJJI(sparkContext);
        SparkContext sparkContext3 = this.LJLILLLLZI;
        if (sparkContext3 != null) {
            interfaceC60721NsL2 = (InterfaceC60721NsL) sparkContext3.LIZIZ(InterfaceC60721NsL.class);
        } else {
            interfaceC60721NsL2 = null;
        }
        this.LJLJJL = interfaceC60721NsL2;
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.iag);
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (this.LJLJJL == null) {
            C60809Ntl.LIZIZ.getClass();
            InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
            if (interfaceC60799Ntb != null) {
                interfaceC60799Ntb.LIZ();
            }
            this.LJLJJL = null;
            SparkContext sparkContext4 = this.LJLILLLLZI;
            if (sparkContext4 != null) {
                sparkContext4.LJII(InterfaceC60721NsL.class, null);
            }
        }
        SparkSchemaParam sparkSchemaParam = this.LJLIL.getSparkSchemaParam();
        if (sparkSchemaParam != null && sparkSchemaParam.getWebviewProgressBar()) {
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
            }
            InterfaceC60721NsL interfaceC60721NsL3 = this.LJLJJL;
            if (interfaceC60721NsL3 != null) {
                Context context = getContext();
                o.LJFF(context, "this.context");
                View LIZJ = interfaceC60721NsL3.LIZJ(context);
                if (LIZJ != null) {
                    ViewParent parent = LIZJ.getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        C16880lQ.LJLLL(LIZJ, (ViewGroup) parent);
                    }
                    if (viewGroup3 != null) {
                        viewGroup3.addView(LIZJ);
                    }
                    InterfaceC60721NsL interfaceC60721NsL4 = this.LJLJJL;
                    if (interfaceC60721NsL4 != null) {
                        interfaceC60721NsL4.LIZIZ(5);
                    }
                }
            }
        }
        ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.k99);
        if (viewGroup4 != null) {
            viewGroup4.removeAllViews();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLIL;
        C60792NtU.LIZ.getClass();
        C60792NtU.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        if (viewGroup4 != null) {
            viewGroup4.addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
    }

    public final void setKeepAlive(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setOptimization(int i) {
        this.LJLJL = i;
    }

    public final void setSparkContext(SparkContext sparkContext) {
        this.LJLILLLLZI = sparkContext;
    }

    public final void setViewCreatedTime(long j) {
        this.LJLJJLL = j;
    }
}
