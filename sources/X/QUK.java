package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ug.bus.UgCallbackCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class QUK implements InterfaceC67059QTn {
    public final QT1 LJLIL;
    public final Context LJLILLLLZI;
    public String LJLJI;
    public final List<QTC<Void>> LJLJJI = new ArrayList();
    public final List<QTC<Void>> LJLJJL = new ArrayList();

    @Override // X.InterfaceC67059QTn
    public final QUJ LIZJ() {
        String str = this.LJLJI;
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = (SharedPreferences) QUW.LIZJ(this.LJLILLLLZI).LJLJI.LIZLLL(new Object[0]);
            if (sharedPreferences != null) {
                str = sharedPreferences.getString("device_id", null);
            } else {
                str = null;
            }
        }
        this.LJLIL.getClass();
        QTJ qtj = (QTJ) QPG.LIZ(QTJ.class);
        if (qtj != null) {
            str2 = qtj.getSecUid();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        return new QUJ(str, str2);
    }

    @Override // X.InterfaceC67059QTn
    public final void LJJIL() {
        QT1 qt1 = this.LJLIL;
        QUL qul = new QUL(this);
        qt1.getClass();
        UgCallbackCenter.LIZIZ(null, qul);
        QT1 qt12 = this.LJLIL;
        QUM qum = new QUM(this);
        qt12.getClass();
        UgCallbackCenter.LIZIZ(null, qum);
        QT1 qt13 = this.LJLIL;
        QUN qun = new QUN(this);
        qt13.getClass();
        UgCallbackCenter.LIZIZ(null, qun);
    }

    public final void LIZLLL(boolean z) {
        synchronized (this) {
            Iterator it = ((ArrayList) this.LJLJJI).iterator();
            while (it.hasNext()) {
                QTC qtc = (QTC) it.next();
                if (qtc != null) {
                    qtc.LIZ(null);
                }
            }
        }
        QUU.LIZJ().LIZIZ(z);
    }

    @Override // X.InterfaceC67059QTn
    public final void LJIIJ(QTC<Void> qtc) {
        synchronized (this) {
            ((ArrayList) this.LJLJJI).add(qtc);
        }
    }

    @Override // X.InterfaceC67059QTn
    public final void LJJJJ(String str) {
        this.LJLJI = str;
        SharedPreferences sharedPreferences = (SharedPreferences) QUW.LIZJ(this.LJLILLLLZI).LJLJI.LIZLLL(new Object[0]);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("device_id", str).apply();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sp is null when save did ");
            LIZ.append(str);
            C66629QCz.LIZIZ(X1D.LIZIZ(LIZ));
        }
        synchronized (this) {
            Iterator it = ((ArrayList) this.LJLJJL).iterator();
            while (it.hasNext()) {
                QTC qtc = (QTC) it.next();
                if (qtc != null) {
                    qtc.LIZ(null);
                }
            }
        }
    }

    @Override // X.InterfaceC67059QTn
    public final void LJJLIIIJJI(QU1 qu1) {
        synchronized (this) {
            ((ArrayList) this.LJLJJI).remove(qu1);
        }
    }

    public QUK(Context context, QT1 qt1) {
        this.LJLILLLLZI = context;
        this.LJLIL = qt1;
    }
}
