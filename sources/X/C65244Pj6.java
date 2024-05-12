package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.Pj6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65244Pj6 implements InterfaceC65016PfQ<TypedInput, ComposePbAndJson> {
    public static final AtomicBoolean LJ = new AtomicBoolean(true);
    public static final String LJFF = "wire_convert";
    public final Gson LIZ;
    public final C65180Pi4 LIZIZ;
    public final Type LIZJ;
    public final InterfaceC55669Lt3 LIZLLL;

    @Override // X.InterfaceC65016PfQ
    public final ComposePbAndJson LIZ(TypedInput typedInput) {
        ComposePbAndJson LIZIZ;
        boolean z;
        int i;
        TypedInput typedInput2 = typedInput;
        Type type = this.LIZJ;
        final boolean z2 = true;
        if (type != null && type == FeedItemList.class && typedInput2 != null) {
            String mimeType = typedInput2.mimeType();
            if (!TextUtils.isEmpty(mimeType) && mimeType.contains("json")) {
                z = true;
            } else {
                z = false;
            }
            FAM LIZ = C56662Kg.LIZ();
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            if (LIZ.LJIIIIZZ == -1) {
                LIZ.LJIIIIZZ = i;
            }
        }
        String mimeType2 = typedInput2.mimeType();
        if (TextUtils.isEmpty(mimeType2) || !mimeType2.contains("json")) {
            z2 = false;
        }
        AtomicBoolean atomicBoolean = LJ;
        if (atomicBoolean.get()) {
            atomicBoolean.getAndSet(false);
            AbstractC73672Svk.LJJIJIL("").LJJJ(T16.LIZ()).LJJJJZI(new InterfaceC64592gB() { // from class: X.Pj7
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    boolean z3 = z2;
                    JSONObject jSONObject = new JSONObject();
                    String str = "proto";
                    if (z3) {
                        str = "json";
                    }
                    try {
                        jSONObject.put("service", str);
                        jSONObject.put("type", str);
                    } catch (Throwable th) {
                        C36922EeM.LJFF(th);
                    }
                    C09900aA.LJ(C65244Pj6.LJFF, jSONObject);
                }
            });
        }
        if (z2) {
            C36922EeM.LIZLLL(2, "ComposePbAndJson", "response json");
            try {
                long currentTimeMillis = System.currentTimeMillis();
                LIZIZ = LIZIZ(typedInput2);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                InterfaceC55669Lt3 interfaceC55669Lt3 = this.LIZLLL;
                if (interfaceC55669Lt3 != null) {
                    ((C55667Lt1) interfaceC55669Lt3).LIZIZ(currentTimeMillis2, LIZIZ.LJLIL, null, true);
                }
            } catch (IOException e) {
                InterfaceC55669Lt3 interfaceC55669Lt32 = this.LIZLLL;
                if (interfaceC55669Lt32 != null) {
                    ((C55667Lt1) interfaceC55669Lt32).LIZ(e.getMessage());
                }
                throw e;
            }
        } else {
            try {
                long currentTimeMillis3 = System.currentTimeMillis();
                LIZIZ = ComposePbAndJson.LIZIZ(this.LIZIZ.LIZ(typedInput2));
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                InterfaceC55669Lt3 interfaceC55669Lt33 = this.LIZLLL;
                if (interfaceC55669Lt33 != null) {
                    ((C55667Lt1) interfaceC55669Lt33).LIZIZ(currentTimeMillis4, null, LIZIZ.LJLILLLLZI, false);
                }
            } catch (IOException e2) {
                InterfaceC55669Lt3 interfaceC55669Lt34 = this.LIZLLL;
                if (interfaceC55669Lt34 != null) {
                    ((C55667Lt1) interfaceC55669Lt34).LIZ(e2.getMessage());
                }
                throw e2;
            }
        }
        return LIZIZ;
    }

    public final ComposePbAndJson LIZIZ(TypedInput typedInput) {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.in(), str);
        try {
            return ComposePbAndJson.LIZ(this.LIZ.LJIIIZ(TypeToken.get(this.LIZJ)).read(this.LIZ.LJIIL(inputStreamReader)));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    public C65244Pj6(ParameterizedType parameterizedType, Gson gson, InterfaceC55669Lt3 interfaceC55669Lt3) {
        this.LIZ = gson;
        this.LIZLLL = interfaceC55669Lt3;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.LIZIZ = new C65180Pi4(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.LIZJ = actualTypeArguments[1];
    }
}
