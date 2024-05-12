package com.bytedance.ies.ugc.aweme.network.zstd;

import X.C0RN;
import X.C221108m2;
import X.C35617DyP;
import X.C37348ElE;
import X.C60352Yl;
import X.C62822Ol8;
import X.C84261X5d;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FUJ;
import X.X1D;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.zstd.ZstdDictSetting;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ZstdDictUpdateTask implements EE1 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C60352Yl.LJLIL);

    @Override // X.EEY
    public final String key() {
        return "ZstdDictUpdateTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Map<String, ZstdDictSetting.DictUrl> map;
        ZstdDictSetting.ZstdDictConfig zstdDictConfig = (ZstdDictSetting.ZstdDictConfig) this.LJLIL.getValue();
        Map<String, String> map2 = null;
        if (zstdDictConfig != null) {
            map2 = zstdDictConfig.path;
        }
        synchronized (C37348ElE.LIZ) {
            C37348ElE.LIZLLL = map2;
        }
        ZstdDictSetting.ZstdDictConfig zstdDictConfig2 = (ZstdDictSetting.ZstdDictConfig) this.LJLIL.getValue();
        if (zstdDictConfig2 == null || (map = zstdDictConfig2.versionUrl) == null) {
            return;
        }
        for (Map.Entry<String, ZstdDictSetting.DictUrl> entry : map.entrySet()) {
            String key = entry.getKey();
            ZstdDictSetting.DictUrl value = entry.getValue();
            if (value != null) {
                C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35617DyP.INSTANCE);
                DownloadTask with = C84261X5d.with(EF7.LIZIZ());
                with.url(value.url);
                with.md5(value.checksum);
                with.savePath((String) LIZIZ.getValue());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(key);
                LIZ.append(".dict");
                with.name(X1D.LIZIZ(LIZ));
                with.monitorScene("zstd_dict_download");
                with.subThreadListener(new FUJ(key, this));
                with.download();
            }
        }
    }
}
