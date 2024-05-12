package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Jul, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50679Jul extends F9E implements InterfaceC50315Jot {
    public final long LJLIL;
    public final java.util.Map<?, ?> LJLILLLLZI;
    public final boolean LJLJI;
    public final long LJLJJI;

    public C50679Jul() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public final String M() {
        java.util.Map<?, ?> map = this.LJLILLLLZI;
        if (map == null || map.isEmpty()) {
            return "[]";
        }
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), this.LJLILLLLZI);
        o.LJIIIIZZ(json, "get().gson.toJson(last_suggest_words)");
        return json;
    }

    public final boolean N() {
        if (this.LJLIL != 0 && System.currentTimeMillis() - this.LJLIL <= this.LJLJJI) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C50679Jul(int i) {
        this(System.currentTimeMillis(), false, C113554cx.LJJJLIIL());
    }

    public C50679Jul(long j, boolean z, java.util.Map last_suggest_words) {
        o.LJIIIZ(last_suggest_words, "last_suggest_words");
        this.LJLIL = j;
        this.LJLILLLLZI = last_suggest_words;
        this.LJLJI = z;
        SettingsManager.LIZLLL().getClass();
        this.LJLJJI = SettingsManager.LJ("middle_page_recom_search_valid_time", 15) * 1000;
    }

    public static C50679Jul L(C50679Jul c50679Jul, long j, java.util.Map last_suggest_words, boolean z, int i) {
        if ((i & 1) != 0) {
            j = c50679Jul.LJLIL;
        }
        if ((i & 2) != 0) {
            last_suggest_words = c50679Jul.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = c50679Jul.LJLJI;
        }
        c50679Jul.getClass();
        o.LJIIIZ(last_suggest_words, "last_suggest_words");
        return new C50679Jul(j, z, last_suggest_words);
    }
}
