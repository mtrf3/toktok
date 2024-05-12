package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.MCo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56426MCo {
    public final C80796VnM LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1037));
    public int LJFF = -1;

    public C56426MCo(C80796VnM c80796VnM) {
        this.LIZ = c80796VnM;
        c80796VnM.LJI(new C56427MCp(this));
    }

    public final OSZ<Aweme, Aweme> LIZ(View view, float f) {
        int LJIIL;
        Aweme item;
        Aweme item2;
        AbstractC55082Lja abstractC55082Lja = (AbstractC55082Lja) this.LJ.getValue();
        if (abstractC55082Lja == null || (LJIIL = abstractC55082Lja.LJIIL(view)) == -2) {
            return null;
        }
        if (this.LIZIZ == 1) {
            if (f >= 0.0f) {
                item = abstractC55082Lja.getItem(LJIIL);
                item2 = abstractC55082Lja.getItem(LJIIL - 1);
            } else {
                item2 = abstractC55082Lja.getItem(LJIIL);
                item = abstractC55082Lja.getItem(LJIIL + 1);
            }
        } else if (f > 0.0f) {
            item2 = abstractC55082Lja.getItem(LJIIL);
            item = abstractC55082Lja.getItem(LJIIL - 1);
        } else {
            item = abstractC55082Lja.getItem(LJIIL);
            item2 = abstractC55082Lja.getItem(LJIIL + 1);
        }
        return new OSZ<>(item, item2);
    }
}
