package com.bytedance.android.livesdk.livesetting.wallet;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceBalanceShownSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class WalletEntranceBalanceShownSetting_WalletEntranceConfig_OptTypeAdapter extends TypeAdapter<WalletEntranceBalanceShownSetting.WalletEntranceConfig> {
    public final Gson LIZ;

    public WalletEntranceBalanceShownSetting_WalletEntranceConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WalletEntranceBalanceShownSetting.WalletEntranceConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        WalletEntranceBalanceShownSetting.WalletEntranceConfig walletEntranceConfig = new WalletEntranceBalanceShownSetting.WalletEntranceConfig(false, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "show_entrance")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    walletEntranceConfig.setShowInNavBar(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "show_balance")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    walletEntranceConfig.setShowBalance(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return walletEntranceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, WalletEntranceBalanceShownSetting.WalletEntranceConfig walletEntranceConfig) {
        WalletEntranceBalanceShownSetting.WalletEntranceConfig walletEntranceConfig2 = walletEntranceConfig;
        o.LJIIIZ(writer, "writer");
        if (walletEntranceConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("show_entrance");
        writer.LJJIII(walletEntranceConfig2.getShowInNavBar());
        writer.LJI("show_balance");
        writer.LJJIII(walletEntranceConfig2.getShowBalance());
        writer.LJFF();
    }
}
