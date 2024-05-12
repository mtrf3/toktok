package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.X1D;
import X.XDH;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DownloadableModelResponse extends XDH<Data> {
    public Data data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadableModelResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DownloadableModelResponse copy$default(DownloadableModelResponse downloadableModelResponse, Data data, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            data = downloadableModelResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = downloadableModelResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = downloadableModelResponse.status_code;
        }
        return downloadableModelResponse.copy(data, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final DownloadableModelResponse copy(Data data, String str, int i) {
        return new DownloadableModelResponse(data, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DownloadableModelResponse) {
            return C78966Uyw.LJIIIZ(((DownloadableModelResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("DownloadableModelResponse:%s,%s,%s", getObjects());
    }

    /* loaded from: classes7.dex */
    public static final class Data {
        public Map<String, ? extends List<? extends ModelInfo>> arithmetics;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = data.arithmetics;
            }
            return data.copy(map);
        }

        public final Data copy(Map<String, ? extends List<? extends ModelInfo>> map) {
            return new Data(map);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Data) && o.LJ(this.arithmetics, ((Data) obj).arithmetics);
            }
            return true;
        }

        public int hashCode() {
            Map<String, ? extends List<? extends ModelInfo>> map = this.arithmetics;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(arithmetics=");
            LIZ.append(this.arithmetics);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public final Map<String, List<ModelInfo>> getArithmetics() {
            return this.arithmetics;
        }

        public Data(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        public final void setArithmetics(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        public /* synthetic */ Data(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map);
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.XDH
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public Data getResponseData() {
        return this.data;
    }

    public final void setData(Data data) {
        this.data = data;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public DownloadableModelResponse(Data data, String str, int i) {
        this.data = data;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ DownloadableModelResponse(Data data, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : data, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
