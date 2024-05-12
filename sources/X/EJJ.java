package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MultiEditVideoSegmentRecordDataDeserializer;
import com.ss.android.ugc.aweme.dmt_integration.typeadapter.MvNetFileBeanDeserializer;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.tools.type_adapter.BooleanAsIntTypeAdapter;

/* loaded from: classes7.dex */
public final class EJJ extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final EJJ LJLIL = new EJJ();

    public EJJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        e eVar = new e();
        eVar.LJIIJ = true;
        eVar.LIZIZ(new MultiEditVideoSegmentRecordDataDeserializer(), MultiEditVideoSegmentRecordData.class);
        eVar.LIZIZ(new MvNetFileBeanDeserializer(), MvNetFileBean.class);
        eVar.LIZIZ(new BooleanAsIntTypeAdapter(), Integer.TYPE);
        return eVar.LIZ();
    }
}
