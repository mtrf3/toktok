package X;

import android.text.TextUtils;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Jwj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50801Jwj<T> implements InterfaceC64592gB {
    public final /* synthetic */ C50799Jwh LJLIL;
    public final /* synthetic */ DynamicPatch LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ LynxViewClient LJLJJI;

    public C50801Jwj(C50799Jwh c50799Jwh, DynamicPatch dynamicPatch, boolean z, LynxViewClient lynxViewClient) {
        this.LJLIL = c50799Jwh;
        this.LJLILLLLZI = dynamicPatch;
        this.LJLJI = z;
        this.LJLJJI = lynxViewClient;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.Jwt] */
    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        EnumC50808Jwq enumC50808Jwq;
        int i;
        TemplateData templateData = (TemplateData) obj;
        C50799Jwh c50799Jwh = this.LJLIL;
        DynamicPatch dynamicPatch = this.LJLILLLLZI;
        c50799Jwh.LJIIIZ = dynamicPatch;
        C50831JxD c50831JxD = c50799Jwh.LJIILIIL;
        c50831JxD.getClass();
        c50831JxD.LIZ = System.currentTimeMillis();
        if (dynamicPatch != null) {
            str = dynamicPatch.schema;
        } else {
            str = null;
        }
        String schema = "";
        if (str == null) {
            str = "";
        }
        C50102JlS c50102JlS = new C50102JlS();
        c50102JlS.LJIIZILJ("type", "start_load");
        c50102JlS.LJIL(2);
        c50102JlS.LJIIZILJ("schema", str);
        c50102JlS.LJIILIIL();
        if (this.LJLJI) {
            C50799Jwh c50799Jwh2 = this.LJLIL;
            DynamicPatch dynamicPatch2 = this.LJLILLLLZI;
            LynxViewClient lynxViewClient = this.LJLJJI;
            c50799Jwh2.getClass();
            C50802Jwk c50802Jwk = C50802Jwk.LIZ;
            C50800Jwi callback = c50799Jwh2.LJIILL;
            o.LJIIIZ(dynamicPatch2, "dynamicPatch");
            o.LJIIIZ(callback, "callback");
            if (C50802Jwk.LIZ(c50799Jwh2.LJIIJJI)) {
                C50102JlS c50102JlS2 = new C50102JlS();
                c50102JlS2.LJIIZILJ("type", "spark_container_destroyed");
                c50102JlS2.LJIIZILJ("schema", dynamicPatch2.schema);
                c50102JlS2.LJIILIIL();
                return;
            }
            String bulletSchema = dynamicPatch2.getBulletSchema();
            if (bulletSchema == null) {
                bulletSchema = dynamicPatch2.schema;
            }
            if (!TextUtils.isEmpty(bulletSchema)) {
                schema = bulletSchema;
            }
            dynamicPatch2.schema = schema;
            C68322mC c68322mC = new C68322mC();
            o.LJIIIIZZ(schema, "schema");
            ?? r0 = (T) C50804Jwm.LIZJ(schema, new C50806Jwo(c68322mC, c50799Jwh2, callback, dynamicPatch2, templateData, lynxViewClient));
            c68322mC.element = r0;
            if (r0 != 0 && (enumC50808Jwq = r0.LJLJI) != null && (i = C50809Jwr.LIZ[enumC50808Jwq.ordinal()]) != -1) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                } else {
                    C50802Jwk.LJ(c50799Jwh2, (C50811Jwt) c68322mC.element, callback, dynamicPatch2, templateData);
                    return;
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50799Jwh2.LJIIJJI;
            String str2 = dynamicPatch2.schema;
            o.LJIIIIZZ(str2, "dynamicPatch.schema");
            C50802Jwk.LIZIZ(c50802Jwk, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, str2, templateData, false, callback, lynxViewClient, null, 64);
            return;
        }
        C50799Jwh c50799Jwh3 = this.LJLIL;
        DynamicPatch dynamicPatch3 = this.LJLILLLLZI;
        c50799Jwh3.getClass();
        C50802Jwk c50802Jwk2 = C50802Jwk.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c50799Jwh3.LJIIJJI;
        String str3 = dynamicPatch3.schema;
        o.LJIIIIZZ(str3, "dynamicData.schema");
        C50802Jwk.LIZIZ(c50802Jwk2, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, str3, templateData, false, c50799Jwh3.LJIILL, c50799Jwh3.LJIILLIIL, null, 64);
    }
}
