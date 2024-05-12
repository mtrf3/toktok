package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8Fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208398Fv implements Serializable {
    public List<String> LJLIL;
    public String jsonString;

    /* JADX WARN: Multi-variable type inference failed */
    public C208398Fv() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C208398Fv copy$default(C208398Fv c208398Fv, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c208398Fv.jsonString;
        }
        if ((i & 2) != 0) {
            list = c208398Fv.LJLIL;
        }
        return c208398Fv.copy(str, list);
    }

    public final C208398Fv copy(String str, List<String> list) {
        return new C208398Fv(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C208398Fv)) {
            return false;
        }
        C208398Fv c208398Fv = (C208398Fv) obj;
        return o.LJ(this.jsonString, c208398Fv.jsonString) && o.LJ(this.LJLIL, c208398Fv.LJLIL);
    }

    public int hashCode() {
        String str = this.jsonString;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.LJLIL;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String getJsonString() {
        List<String> list = this.LJLIL;
        if (list == null || list.isEmpty()) {
            return "";
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), this.LJLIL);
        o.LJIIIIZZ(json, "{\n            GsonProvid…oJson(wordList)\n        }");
        return json;
    }

    public final String getKeyWord() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.LJLIL;
        if (list != null) {
            for (String str : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(' ');
                sb.append(X1D.LIZIZ(LIZ));
            }
        }
        return s.LJZI(sb).toString();
    }

    public final boolean isVisible() {
        List<String> list = this.LJLIL;
        if (list != null && Integer.valueOf(list.size()).intValue() > 1) {
            return true;
        }
        return false;
    }

    public final void removeAllWords() {
        List<String> list = this.LJLIL;
        if (list != null) {
            list.clear();
        }
        this.jsonString = getJsonString();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CapsuleWords(jsonString=");
        LIZ.append(this.jsonString);
        LIZ.append(", wordList=");
        return C1NE.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final List<String> getWordList() {
        return this.LJLIL;
    }

    public final boolean isLastWord(int i) {
        int i2;
        List<String> list = this.LJLIL;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i != i2 - 1) {
            return false;
        }
        return true;
    }

    public final void removeWord(int i) {
        List<String> list = this.LJLIL;
        if (list != null) {
            ListProtector.remove(list, i);
        }
        this.jsonString = getJsonString();
    }

    public final void setWordList(List<String> list) {
        this.LJLIL = list;
    }

    public C208398Fv(String str, List<String> list) {
        Object LIZ;
        this.jsonString = str;
        this.LJLIL = list;
        if (str != null) {
            Type type = new TypeToken<List<String>>() { // from class: X.8Fw
            }.getType();
            o.LJIIIIZZ(type, "object : TypeToken<MutableList<String?>>() {}.type");
            try {
                LIZ = (List) GsonHolder.LIZLLL().LIZ().LJII(str, type);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            List<String> list2 = (List) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
            this.LJLIL = list2;
            Objects.toString(list2);
        }
    }

    public /* synthetic */ C208398Fv(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
