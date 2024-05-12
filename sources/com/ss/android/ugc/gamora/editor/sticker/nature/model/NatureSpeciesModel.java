package com.ss.android.ugc.gamora.editor.sticker.nature.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NatureSpeciesModel extends F9E {

    @InterfaceC65349Pkn("genus_id")
    public final String genusId;

    @InterfaceC65349Pkn("genus_name")
    public final String genusName;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("prob")
    public final float prob;

    @InterfaceC65349Pkn("species_id")
    public final String speciesId;

    @InterfaceC65349Pkn("species_name")
    public final String speciesName;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.speciesName, this.genusName, this.speciesId, this.genusId, Float.valueOf(this.prob), this.iconUrl};
    }

    public NatureSpeciesModel(String speciesName, String genusName, String speciesId, String genusId, float f, String iconUrl) {
        o.LJIIIZ(speciesName, "speciesName");
        o.LJIIIZ(genusName, "genusName");
        o.LJIIIZ(speciesId, "speciesId");
        o.LJIIIZ(genusId, "genusId");
        o.LJIIIZ(iconUrl, "iconUrl");
        this.speciesName = speciesName;
        this.genusName = genusName;
        this.speciesId = speciesId;
        this.genusId = genusId;
        this.prob = f;
        this.iconUrl = iconUrl;
    }
}
