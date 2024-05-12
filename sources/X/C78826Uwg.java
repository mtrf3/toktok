package X;

import Y.ARunnableS17S0400000_14;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIType;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78826Uwg implements InterfaceC78821Uwb {
    public final Effect LIZ;
    public final InterfaceC84497XEf LIZIZ;
    public final C46193IAz LIZJ;
    public final ShortVideoContext LIZLLL;
    public final List<C78831Uwl> LJ;
    public List<C78801UwH> LJFF;

    @Override // X.InterfaceC78821Uwb
    public final LinearLayoutManager LJ(Context context) {
        if (C78886Uxe.LJJIJL(this.LIZ)) {
            return new GridLayoutManager(5);
        }
        return new LinearLayoutManager(0, false);
    }

    public final void LJFF(XN9[] xn9Arr) {
        if (xn9Arr != null) {
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(xn9Arr);
            while (LJJIIJZLJL.hasNext()) {
                XN9 xn9 = (XN9) LJJIIJZLJL.next();
                o.LJII(xn9, "null cannot be cast to non-null type com.bytedance.ies.effecteditor.models.EEUIAnnotationOptionList");
                ((ArrayList) this.LJ).add(new C78831Uwl((XNG) xn9));
            }
        }
    }

    @Override // X.InterfaceC78821Uwb
    public final void LIZ(C78820Uwa data, C78815UwV c78815UwV) {
        XN9<?, ?>[] LIZIZ;
        XNE xne;
        o.LJIIIZ(data, "data");
        XN6 LJFF = DiyPropParser.LJFF(this.LIZ);
        if (LJFF != null && (LIZIZ = LJFF.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            XN9<?, ?> xn9 = LIZIZ[0];
            if (!(xn9 instanceof XNE) || (xne = (XNE) xn9) == null) {
                return;
            }
            xne.LIZJ(new Bitmap[0], UIAnnotationUpdateType.UIAnnotationUpdateType_Done, new C78823Uwd(this, c78815UwV, data));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, android.graphics.Bitmap[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.graphics.Bitmap[]] */
    @Override // X.InterfaceC78821Uwb
    public final void LIZIZ(C78820Uwa c78820Uwa, C78813UwT c78813UwT) {
        boolean z;
        XN9<?, ?>[] LIZIZ;
        XNE xne;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new Bitmap[0];
        C78789Uw5 c78789Uw5 = c78820Uwa.LJ;
        if (c78789Uw5 != null && !c78789Uw5.LJIIJ) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            if (c78789Uw5 != null) {
                str = c78789Uw5.LIZJ;
            }
            Bitmap LJI = LJI(-1, -1, str);
            if (LJI != null) {
                c68322mC.element = new Bitmap[]{LJI};
            }
        }
        XN6 LJFF = DiyPropParser.LJFF(this.LIZ);
        if (LJFF != null && (LIZIZ = LJFF.LIZIZ(UIAnnotationUIType.UIAnnotationUIType_Asset)) != null) {
            XN9<?, ?> xn9 = LIZIZ[0];
            if (!(xn9 instanceof XNE) || (xne = (XNE) xn9) == null) {
                return;
            }
            xne.LIZJ(c68322mC.element, UIAnnotationUpdateType.UIAnnotationUpdateType_Done, new C78822Uwc(c78820Uwa, this, c68322mC, c78813UwT));
        }
    }

    @Override // X.InterfaceC78821Uwb
    public final void LIZJ(C78820Uwa data, C78817UwX c78817UwX) {
        o.LJIIIZ(data, "data");
        List<C78831Uwl> list = this.LJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((C78831Uwl) next).LJLIL.LIZ(), data.LIZ)) {
                arrayList.add(next);
            }
        }
        List<C78801UwH> list2 = this.LJFF;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (o.LJ(((C78801UwH) next2).LIZ, data.LIZ)) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C78801UwH) it3.next()).LIZJ);
        }
        C46193IAz c46193IAz = this.LIZJ;
        if (c46193IAz != null) {
            c46193IAz.g(data.LIZJ);
        }
        XNG xng = ((C78831Uwl) ListProtector.get(arrayList, 0)).LJLIL;
        Object[] array = arrayList3.toArray(new String[0]);
        UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Done;
        C78824Uwe c78824Uwe = new C78824Uwe(this, c78817UwX, data);
        xng.getClass();
        C82887Wfz.LIZ();
        C38995FSd.LIZJ().execute(new ARunnableS17S0400000_14(c78824Uwe, xng, array, uIAnnotationUpdateType, 5));
    }

    public static Bitmap LJI(int i, int i2, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i > 0 && i2 > 0) {
            options.inJustDecodeBounds = false;
            options.inSampleSize = C38891fp.LJIIIZ(options, i2, i);
            return C44694HgQ.LIZLLL(str, options);
        }
        return C44694HgQ.LIZLLL(str, options);
    }

    @Override // X.InterfaceC78821Uwb
    public final void LIZLLL(C78820Uwa data, C78814UwU c78814UwU, boolean z) {
        String str;
        String[] strArr;
        o.LJIIIZ(data, "data");
        List<C78831Uwl> list = this.LJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String LIZ = ((C78831Uwl) next).LJLIL.LIZ();
            C78789Uw5 c78789Uw5 = data.LJ;
            if (c78789Uw5 != null) {
                str = c78789Uw5.LJ;
            }
            if (o.LJ(LIZ, str)) {
                arrayList.add(next);
            }
        }
        C78789Uw5 c78789Uw52 = data.LJ;
        if (c78789Uw52 != null && c78789Uw52.LJIIJ && z) {
            List<C78801UwH> list2 = this.LJFF;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (o.LJ(((C78801UwH) next2).LIZ, data.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((C78801UwH) it3.next()).LIZJ);
            }
            strArr = (String[]) arrayList3.toArray(new String[0]);
        } else {
            strArr = new String[1];
            if (c78789Uw52 != null) {
                str = c78789Uw52.LIZJ;
            }
            strArr[0] = str;
        }
        if (!arrayList.isEmpty()) {
            XNG xng = ((C78831Uwl) ListProtector.get(arrayList, 0)).LJLIL;
            UIAnnotationUpdateType uIAnnotationUpdateType = UIAnnotationUpdateType.UIAnnotationUpdateType_Done;
            C78825Uwf c78825Uwf = new C78825Uwf(z, this, data, strArr, c78814UwU);
            xng.getClass();
            C82887Wfz.LIZ();
            C38995FSd.LIZJ().execute(new ARunnableS17S0400000_14(c78825Uwf, xng, strArr, uIAnnotationUpdateType, 5));
        }
    }

    public C78826Uwg(Effect effect, InterfaceC84497XEf interfaceC84497XEf, C46193IAz c46193IAz, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = effect;
        this.LIZIZ = interfaceC84497XEf;
        this.LIZJ = c46193IAz;
        this.LIZLLL = shortVideoContext;
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
    }
}
