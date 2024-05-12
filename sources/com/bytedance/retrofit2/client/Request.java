package com.bytedance.retrofit2.client;

import X.C64738Paw;
import X.C64908Pdg;
import X.EJ6;
import X.PVP;
import X.PVR;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class Request {
    public final boolean addCommonParam;
    public final TypedOutput body;
    public Object extraInfo;
    public final List<EJ6> headers;
    public boolean isBodyEncryptEnabled;
    public boolean isQueryEncryptEnabled;
    public final int maxLength;
    public final String method;
    public C64738Paw metrics;
    public final int priorityLevel;
    public int queryFilterPriority;
    public final PVP requestBody;
    public final int requestPriorityLevel;
    public final boolean responseStreaming;
    public final String serviceType;
    public final Map<Class<?>, Object> tags;
    public final String url;

    public TypedOutput getBody() {
        PVP pvp = this.requestBody;
        if (pvp != null) {
            return new PVR(pvp);
        }
        return this.body;
    }

    public String getHost() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getHost();
    }

    public String getPath() {
        URI safeCreateUri = safeCreateUri(this.url);
        if (safeCreateUri == null) {
            return null;
        }
        return safeCreateUri.getPath();
    }

    public C64908Pdg newBuilder() {
        return new C64908Pdg(this);
    }

    public Object tag() {
        return tag(Object.class);
    }

    public Object getExtraInfo() {
        return this.extraInfo;
    }

    public List<EJ6> getHeaders() {
        return this.headers;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public String getMethod() {
        return this.method;
    }

    public C64738Paw getMetrics() {
        return this.metrics;
    }

    public int getPriorityLevel() {
        return this.priorityLevel;
    }

    public int getQueryFilterPriority() {
        return this.queryFilterPriority;
    }

    public PVP getRequestBody() {
        return this.requestBody;
    }

    public int getRequestPriorityLevel() {
        return this.requestPriorityLevel;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAddCommonParam() {
        return this.addCommonParam;
    }

    public boolean isBodyEncryptEnabled() {
        return this.isBodyEncryptEnabled;
    }

    public boolean isQueryEncryptEnabled() {
        return this.isQueryEncryptEnabled;
    }

    public boolean isResponseStreaming() {
        return this.responseStreaming;
    }

    public Request(C64908Pdg c64908Pdg) {
        String str = c64908Pdg.LIZIZ;
        if (str != null) {
            this.url = str;
            String str2 = c64908Pdg.LIZ;
            if (str2 != null) {
                this.method = str2;
                if (c64908Pdg.LIZJ == null) {
                    this.headers = Collections.emptyList();
                } else {
                    this.headers = Collections.unmodifiableList(new ArrayList(c64908Pdg.LIZJ));
                }
                this.body = c64908Pdg.LIZLLL;
                this.requestBody = c64908Pdg.LJ;
                this.priorityLevel = c64908Pdg.LJFF;
                this.requestPriorityLevel = c64908Pdg.LJI;
                this.responseStreaming = c64908Pdg.LJII;
                this.maxLength = c64908Pdg.LJIIIIZZ;
                this.addCommonParam = c64908Pdg.LJIIIZ;
                this.extraInfo = c64908Pdg.LJIIJ;
                this.serviceType = c64908Pdg.LJIIJJI;
                this.metrics = c64908Pdg.LJIIL;
                this.tags = c64908Pdg.LJIILIIL;
                this.isQueryEncryptEnabled = c64908Pdg.LJIILJJIL;
                this.isBodyEncryptEnabled = c64908Pdg.LJIILL;
                return;
            }
            throw new NullPointerException("Method must not be null.");
        }
        throw new NullPointerException("URL must not be null.");
    }

    public static URI createUriWithOutQuery(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static URI safeCreateUri(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            try {
                return new URI(str);
            } catch (URISyntaxException unused) {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            }
        } catch (Exception unused2) {
            return createUriWithOutQuery(str);
        }
    }

    public EJ6 getFirstHeader(String str) {
        List<EJ6> list;
        if (str != null && (list = this.headers) != null) {
            for (EJ6 ej6 : list) {
                if (str.equalsIgnoreCase(ej6.LIZ)) {
                    return ej6;
                }
            }
        }
        return null;
    }

    public List<EJ6> headers(String str) {
        List<EJ6> list;
        ArrayList arrayList = null;
        if (str != null && (list = this.headers) != null) {
            for (EJ6 ej6 : list) {
                if (str.equalsIgnoreCase(ej6.LIZ)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ej6);
                }
            }
        }
        return arrayList;
    }

    public void setBodyEncryptEnabled(boolean z) {
        this.isBodyEncryptEnabled = z;
    }

    public void setExtraInfo(Object obj) {
        this.extraInfo = obj;
    }

    public void setMetrics(C64738Paw c64738Paw) {
        this.metrics = c64738Paw;
    }

    public void setQueryEncryptEnabled(boolean z) {
        this.isQueryEncryptEnabled = z;
    }

    public void setQueryFilterPriority(int i) {
        this.queryFilterPriority = i;
    }

    public <T> T tag(Class<? extends T> cls) {
        Map<Class<?>, Object> map = this.tags;
        if (map == null) {
            return null;
        }
        return cls.cast(map.get(cls));
    }

    public Request(String str, String str2, List<EJ6> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj) {
        this(str, str2, list, typedOutput, null, i, 3, z, i2, z2, obj, "", null);
    }

    public Request(String str, String str2, List<EJ6> list, TypedOutput typedOutput, PVP pvp, int i, int i2, boolean z, int i3, boolean z2, Object obj, String str3, Map<Class<?>, Object> map) {
        if (str != null) {
            if (str2 != null) {
                this.method = str;
                this.url = str2;
                if (list == null) {
                    this.headers = Collections.emptyList();
                } else {
                    this.headers = Collections.unmodifiableList(new ArrayList(list));
                }
                this.body = typedOutput;
                this.requestBody = pvp;
                this.priorityLevel = i;
                this.requestPriorityLevel = i2;
                this.responseStreaming = z;
                this.maxLength = i3;
                this.addCommonParam = z2;
                this.extraInfo = obj;
                this.serviceType = str3;
                this.tags = map;
                return;
            }
            throw new NullPointerException("URL must not be null.");
        }
        throw new NullPointerException("Method must not be null.");
    }
}
