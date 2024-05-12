package X;

import com.bytedance.vmsdk.jsbridge.utils.ReadableArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;
import com.google.gson.l;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.Eqs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37698Eqs extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ m LJLIL;
    public final /* synthetic */ ReadableMap LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37698Eqs(m mVar, ReadableMap readableMap) {
        super(1);
        this.LJLIL = mVar;
        this.LJLILLLLZI = readableMap;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String key = str;
        o.LJIIJ(key, "key");
        ReadableType type = this.LJLILLLLZI.getType(key);
        if (type != null) {
            switch (C37704Eqy.LIZ[type.ordinal()]) {
                case 1:
                    this.LJLIL.LJJII(key, l.LJLIL);
                    break;
                case 2:
                    this.LJLIL.LJJIII(Boolean.valueOf(this.LJLILLLLZI.getBoolean(key)), key);
                    break;
                case 3:
                    this.LJLIL.LJJIIJ(key, Integer.valueOf(this.LJLILLLLZI.getInt(key)));
                    break;
                case 4:
                    this.LJLIL.LJJIIJ(key, Long.valueOf(this.LJLILLLLZI.getLong(key)));
                    break;
                case 5:
                    this.LJLIL.LJJIIJ(key, Double.valueOf(this.LJLILLLLZI.getDouble(key)));
                    break;
                case 6:
                    this.LJLIL.LJJIIZ(key, this.LJLILLLLZI.getString(key));
                    break;
                case 7:
                    m mVar = this.LJLIL;
                    ReadableMap map = this.LJLILLLLZI.getMap(key);
                    o.LJFF(map, "getMap(key)");
                    mVar.LJJII(key, C37697Eqr.LIZLLL(map));
                    break;
                case 8:
                    m mVar2 = this.LJLIL;
                    ReadableArray array = this.LJLILLLLZI.getArray(key);
                    o.LJFF(array, "getArray(key)");
                    mVar2.LJJII(key, C37697Eqr.LIZJ(array));
                    break;
            }
        }
        return C76800UCe.LIZ;
    }
}
