package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import defpackage.a1;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Pdg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64908Pdg {
    public String LIZ;
    public String LIZIZ;
    public List<EJ6> LIZJ;
    public TypedOutput LIZLLL;
    public final PVP LJ;
    public final int LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public final boolean LJIIIZ;
    public Object LJIIJ;
    public String LJIIJJI;
    public final C64738Paw LJIIL;
    public java.util.Map<Class<?>, Object> LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    public final Request LIZ() {
        if (this.LIZIZ != null) {
            return new Request(this);
        }
        throw new IllegalStateException("url == null");
    }

    public C64908Pdg() {
        this.LIZ = "GET";
    }

    public C64908Pdg(Request request) {
        this.LIZ = request.method;
        this.LIZIZ = request.url;
        LinkedList linkedList = new LinkedList();
        this.LIZJ = linkedList;
        linkedList.addAll(request.headers);
        this.LIZLLL = request.body;
        this.LJ = request.requestBody;
        this.LJFF = request.priorityLevel;
        this.LJI = request.requestPriorityLevel;
        this.LJII = request.responseStreaming;
        this.LJIIIIZZ = request.maxLength;
        this.LJIIIZ = request.addCommonParam;
        this.LJIIJ = request.extraInfo;
        this.LJIIJJI = request.serviceType;
        this.LJIIL = request.metrics;
        this.LJIILIIL = request.tags;
        this.LJIILJJIL = request.isQueryEncryptEnabled;
        this.LJIILL = request.isBodyEncryptEnabled;
    }

    public final void LIZJ(String str) {
        if (str != null) {
            this.LIZIZ = str;
            return;
        }
        throw new NullPointerException("url == null");
    }

    public final void LIZIZ(String str, TypedOutput typedOutput) {
        TypedOutput typedOutput2;
        if (str != null) {
            if (str.length() != 0) {
                if (typedOutput != null) {
                    typedOutput2 = typedOutput;
                    if (!C65139PhP.LJIIL(str)) {
                        typedOutput2 = typedOutput;
                        if (!str.equals("OPTIONS")) {
                            typedOutput2 = typedOutput;
                            if (!str.equals("DELETE")) {
                                typedOutput2 = typedOutput;
                                if (!str.equals("PROPFIND")) {
                                    typedOutput2 = typedOutput;
                                    if (!str.equals("MKCOL")) {
                                        typedOutput2 = typedOutput;
                                        if (!str.equals("LOCK")) {
                                            throw new IllegalArgumentException(a1.LJ("method ", str, " must not have a request body."));
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    typedOutput2 = typedOutput;
                    if (C65139PhP.LJIIL(str)) {
                        FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
                        formUrlEncodedTypedOutput.addField("body", "null");
                        typedOutput2 = formUrlEncodedTypedOutput;
                    }
                }
                this.LIZ = str;
                this.LIZLLL = typedOutput2;
                return;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
        throw new NullPointerException("method == null");
    }
}
