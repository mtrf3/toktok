package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChunkDebugInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27990Ayg implements InterfaceC66632QDc<BillInfoResponse> {
    public final /* synthetic */ C27966AyI LIZ;
    public final /* synthetic */ InterfaceC73573Su9<BillInfoResponse> LIZIZ;
    public final /* synthetic */ long LIZJ;

    @Override // X.InterfaceC66632QDc
    public final void onComplete() {
        C36746EbW.LIZ(4, "onComplete");
        this.LIZIZ.onComplete();
        System.currentTimeMillis();
    }

    @Override // X.InterfaceC66632QDc
    public final void onFailed(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFailed, ");
        LIZ.append(th.getMessage());
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        this.LIZIZ.onError(th);
        long currentTimeMillis = System.currentTimeMillis();
        String message = th.getMessage();
        Long valueOf = Long.valueOf(currentTimeMillis - this.LIZJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C27949Ay1.LIZIZ);
        if (message != null) {
            linkedHashMap.put("fail_reason", message);
        }
        if (valueOf != null) {
            linkedHashMap.put("total_cost", Long.valueOf(valueOf.longValue()));
        }
        C76542zS.LIZ("rd_tiktokec_chunk_error", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC66632QDc
    public final void onNext(BillInfoResponse billInfoResponse) {
        String str;
        Boolean bool;
        Boolean bool2;
        ChunkDebugInfo chunkDebugInfo;
        BillInfoResponse data = billInfoResponse;
        o.LJIIIZ(data, "data");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNext: ");
        LIZ.append(data);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        C27966AyI c27966AyI = this.LIZ;
        BillInfoData billInfoData = (BillInfoData) data.data;
        if (billInfoData == null || (str = billInfoData.getRequestId()) == null) {
            str = this.LIZ.LJFF;
        }
        c27966AyI.LJFF = str;
        C27966AyI c27966AyI2 = this.LIZ;
        BillInfoResponse billInfoResponse2 = c27966AyI2.LJ;
        if (billInfoResponse2 == null) {
            billInfoResponse2 = data;
        }
        c27966AyI2.LJ = billInfoResponse2.mergeChunk(data);
        BillInfoData billInfoData2 = (BillInfoData) data.data;
        if (billInfoData2 != null) {
            billInfoData2.setFromChunk(Boolean.TRUE);
        }
        this.LIZIZ.onNext(data);
        long currentTimeMillis = System.currentTimeMillis();
        C27966AyI c27966AyI3 = this.LIZ;
        long j = currentTimeMillis - c27966AyI3.LIZLLL;
        long j2 = currentTimeMillis - this.LIZJ;
        c27966AyI3.LIZLLL = currentTimeMillis;
        Boolean bool3 = Boolean.TRUE;
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        Integer num = data.chunkIndex;
        BillInfoData billInfoData3 = (BillInfoData) data.data;
        Long l = null;
        if (billInfoData3 != null) {
            bool = billInfoData3.getBeginRenderChunk();
        } else {
            bool = null;
        }
        BillInfoData billInfoData4 = (BillInfoData) data.data;
        if (billInfoData4 != null) {
            bool2 = billInfoData4.getLastChunk();
        } else {
            bool2 = null;
        }
        BillInfoData billInfoData5 = (BillInfoData) data.data;
        if (billInfoData5 != null && (chunkDebugInfo = billInfoData5.getChunkDebugInfo()) != null) {
            l = chunkDebugInfo.costTime;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C27949Ay1.LIZIZ);
        if (bool3 != null) {
            linkedHashMap.put("is_success", 1);
        }
        if (valueOf != null) {
            linkedHashMap.put("cost", Long.valueOf(valueOf.longValue()));
        }
        if (valueOf2 != null) {
            linkedHashMap.put("total_cost", Long.valueOf(valueOf2.longValue()));
        }
        if (num != null) {
            linkedHashMap.put("chunk_index", Integer.valueOf(num.intValue()));
        }
        if (bool != null) {
            linkedHashMap.put("begin_render", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("last_chunk", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (l != null) {
            linkedHashMap.put("server_inner_total_cost", Long.valueOf(l.longValue()));
        }
        C76542zS.LIZ("rd_tiktokec_chunk_duration", linkedHashMap);
    }

    public C27990Ayg(C27966AyI c27966AyI, InterfaceC73573Su9<BillInfoResponse> interfaceC73573Su9, long j) {
        this.LIZ = c27966AyI;
        this.LIZIZ = interfaceC73573Su9;
        this.LIZJ = j;
    }
}
