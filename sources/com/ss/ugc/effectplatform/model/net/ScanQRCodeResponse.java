package com.ss.ugc.effectplatform.model.net;

import X.C78966Uyw;
import X.X1D;
import X.XDH;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ScanQRCodeResponse extends XDH<DataNode> {
    public DataNode data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public ScanQRCodeResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScanQRCodeResponse copy$default(ScanQRCodeResponse scanQRCodeResponse, DataNode dataNode, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dataNode = scanQRCodeResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = scanQRCodeResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = scanQRCodeResponse.status_code;
        }
        return scanQRCodeResponse.copy(dataNode, str, i);
    }

    private Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status_code)};
    }

    public final ScanQRCodeResponse copy(DataNode dataNode, String str, int i) {
        return new ScanQRCodeResponse(dataNode, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScanQRCodeResponse) {
            return C78966Uyw.LJIIIZ(((ScanQRCodeResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("ScanQRCodeResponse:%s,%s,%s", getObjects());
    }

    @Override // X.XDH
    public boolean checkValue() {
        DataNode dataNode = this.data;
        if (dataNode == null || dataNode.getEffect() == null) {
            return false;
        }
        return true;
    }

    /* loaded from: classes7.dex */
    public static final class DataNode {
        public PlatformEffect effect;
        public List<String> url_prefix;

        /* JADX WARN: Multi-variable type inference failed */
        public DataNode() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataNode copy$default(DataNode dataNode, PlatformEffect platformEffect, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                platformEffect = dataNode.effect;
            }
            if ((i & 2) != 0) {
                list = dataNode.url_prefix;
            }
            return dataNode.copy(platformEffect, list);
        }

        public final DataNode copy(PlatformEffect platformEffect, List<String> list) {
            return new DataNode(platformEffect, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataNode)) {
                return false;
            }
            DataNode dataNode = (DataNode) obj;
            return o.LJ(this.effect, dataNode.effect) && o.LJ(this.url_prefix, dataNode.url_prefix);
        }

        public int hashCode() {
            PlatformEffect platformEffect = this.effect;
            int hashCode = (platformEffect != null ? platformEffect.hashCode() : 0) * 31;
            List<String> list = this.url_prefix;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DataNode(effect=");
            LIZ.append(this.effect);
            LIZ.append(", url_prefix=");
            LIZ.append(this.url_prefix);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public final PlatformEffect getEffect() {
            return this.effect;
        }

        public final List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public final void setEffect(PlatformEffect platformEffect) {
            this.effect = platformEffect;
        }

        public final void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public DataNode(PlatformEffect platformEffect, List<String> list) {
            this.effect = platformEffect;
            this.url_prefix = list;
        }

        public /* synthetic */ DataNode(PlatformEffect platformEffect, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : platformEffect, (i & 2) != 0 ? null : list);
        }
    }

    public final DataNode getData() {
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
    public DataNode getResponseData() {
        return this.data;
    }

    public final void setData(DataNode dataNode) {
        this.data = dataNode;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ScanQRCodeResponse(DataNode dataNode, String str, int i) {
        this.data = dataNode;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ ScanQRCodeResponse(DataNode dataNode, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : dataNode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
