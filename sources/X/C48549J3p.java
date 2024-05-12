package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.bytenn.ByteNNConfig;
import com.ss.bytenn.Tensor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.J3p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48549J3p implements J3A {
    public com.ss.bytenn.API LIZ;

    @Override // X.J3A
    public final boolean LIZ(MappedByteBuffer model, MLConfigModel configModel) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(configModel, "configModel");
        com.ss.bytenn.API api = new com.ss.bytenn.API();
        this.LIZ = api;
        J72 CreateEngine = api.CreateEngine();
        if (CreateEngine != J72.NO_ERROR) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("byteNN create engine failed with code ");
            LIZ.append(CreateEngine);
            C40507Fv5.LIZIZ(new RuntimeException(X1D.LIZIZ(LIZ)));
            return false;
        }
        ByteNNConfig byteNNConfig = new ByteNNConfig();
        try {
            EnumC48550J3q enumC48550J3q = EnumC48550J3q.CPU;
            if (TextUtils.equals(configModel.bytenn_forward_type, "auto")) {
                enumC48550J3q = EnumC48550J3q.Auto;
            }
            byteNNConfig.init(enumC48550J3q, model, null, "", "");
            int i = configModel.num_threads;
            if (i == 2) {
                byteNNConfig.setThreadNum(i);
            } else {
                byteNNConfig.setThreadNum(1);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        com.ss.bytenn.API api2 = this.LIZ;
        o.LJI(api2);
        J72 InitEngine = api2.InitEngine(byteNNConfig);
        J72 j72 = J72.NO_ERROR;
        if (InitEngine != j72) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("byteNN init engine failed with code ");
            LIZ2.append(InitEngine);
            C40507Fv5.LIZIZ(new RuntimeException(X1D.LIZIZ(LIZ2)));
        }
        if (C40507Fv5.LIZ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" createEngine bytenn initCode:");
            LIZ3.append(InitEngine);
            LIZ3.append(" configModel:");
            LIZ3.append(configModel);
            X1D.LIZIZ(LIZ3);
        }
        if (InitEngine != j72) {
            return false;
        }
        return true;
    }

    @Override // X.J3A
    public final void LIZIZ(ByteBuffer inputBuffer, float[][] outputArray, MLConfigModel configModel) {
        o.LJIIIZ(inputBuffer, "inputBuffer");
        o.LJIIIZ(outputArray, "outputArray");
        o.LJIIIZ(configModel, "configModel");
        if (this.LIZ == null) {
            return;
        }
        ArrayList<Tensor> arrayList = new ArrayList<>();
        com.ss.bytenn.API api = this.LIZ;
        o.LJI(api);
        J72 GetEngineInputConfig = api.GetEngineInputConfig(arrayList);
        J72 j72 = J72.NO_ERROR;
        if (GetEngineInputConfig != j72) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("byteNN get engine input failed with code ");
            LIZ.append(GetEngineInputConfig);
            C40507Fv5.LIZIZ(new RuntimeException(X1D.LIZIZ(LIZ)));
            return;
        }
        Object obj = ListProtector.get(arrayList, 0);
        o.LJIIIIZZ(obj, "inputTensors[0]");
        try {
            ((Tensor) obj).setData(inputBuffer);
            com.ss.bytenn.API api2 = this.LIZ;
            o.LJI(api2);
            api2.SetEngineInputs(arrayList);
            com.ss.bytenn.API api3 = this.LIZ;
            o.LJI(api3);
            api3.Inference();
            ArrayList<Tensor> arrayList2 = new ArrayList<>();
            com.ss.bytenn.API api4 = this.LIZ;
            o.LJI(api4);
            J72 GetEngineOutputs = api4.GetEngineOutputs(arrayList2);
            if (GetEngineOutputs != j72) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("byteNN inference get output failed with code ");
                LIZ2.append(GetEngineOutputs);
                C40507Fv5.LIZIZ(new RuntimeException(X1D.LIZIZ(LIZ2)));
                return;
            }
            Object obj2 = ListProtector.get(arrayList2, 0);
            o.LJI(obj2);
            ByteBuffer data = ((Tensor) obj2).getData();
            data.order(ByteOrder.nativeOrder());
            int i = 0;
            while (data.hasRemaining()) {
                float f = data.getFloat();
                float[] fArr = outputArray[0];
                if (i < fArr.length) {
                    fArr[i] = f;
                }
                if (C40507Fv5.LIZ) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("bytenn holder output ");
                    LIZ3.append(i);
                    LIZ3.append(" is ");
                    LIZ3.append(f);
                    X1D.LIZIZ(LIZ3);
                }
                i++;
            }
            if (C40507Fv5.LIZ && i != outputArray[0].length) {
                StringBuilder LJ = C7MY.LJ("bytenn inference error, outBuffer.size != resultBuffer.size, result.size:", i, " out.size:");
                LJ.append(outputArray[0].length);
                C44384HbQ.LJJ("ml#evaluator", X1D.LIZIZ(LJ), null);
            }
        } catch (Exception e) {
            C44384HbQ.LJJ("ml#evaluator", "inference error: ", e);
            C40507Fv5.LIZIZ(e);
        }
    }
}
